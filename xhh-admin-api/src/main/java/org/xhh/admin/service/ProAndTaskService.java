package org.xhh.admin.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xhh.admin.dto.ProAndTask;
import org.xhh.core.util.ResponseUtil;
import org.xhh.db.domain.*;
import org.xhh.db.service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.xhh.admin.util.AdminResponseCode.GOODS_NAME_EXIST;

@Service
public class ProAndTaskService {

    private final Log logger = LogFactory.getLog(ProAndTaskService.class);

    @Autowired
    private ProTaskService proTaskService;

    @Autowired
    private ProContentService proContentService;

    @Transactional
    public Object creat(ProAndTask proAndTask) {
//        检查数据是否存在问题
        Object error = validate(proAndTask);
        if (error != null) {
            return error;
        }

        ProContent proContent = proAndTask.getProContent();
        ProTask[] proTasks = proAndTask.getProTasks();

        Integer id = proContentService.add(proContent);

        // 存入项目任务
        for (ProTask proTask : proTasks) {
            proTask.setProNum(id);
            proTaskService.add(proTask);
        }

        return ResponseUtil.ok();
    }

    public Object query(Integer id){
        ProContent proContent = proContentService.queryById(id);
        List<ProTask> proTasks = proTaskService.queryByProNum(id);

        Map<String, Object> data = new HashMap<>();
        data.put("proContent", proContent);
        data.put("proTasks", proTasks);

        return ResponseUtil.ok(data);
    }

    /**
     * 校验数据合法性：项目id不为空
     * @Date: 2019-6-3  19:45
     * @Params: ProAndTaskService.java
     * @Author: sunfy
     */
    private Object validate(ProAndTask proAndTask) {
        ProContent proContent = proAndTask.getProContent();
        Integer id = proContent.getId();
        if (id != null) {
            return ResponseUtil.badArgument();
        }
        return null;
    }

}
