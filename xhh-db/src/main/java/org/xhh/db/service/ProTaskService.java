package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ProTaskMapper;
import org.xhh.db.domain.ProTask;
import org.xhh.db.domain.ProTaskExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 11:04 2019-6-3
 */
@Service
public class ProTaskService {

    @Resource
    private ProTaskMapper proTaskMapper;

    public void add(ProTask proTask) {
        proTask.setAddTime(LocalDateTime.now());
        proTask.setUpdateTime(LocalDateTime.now());
        proTaskMapper.insertSelective(proTask);
    }

    public List<ProTask> querySelective(String sketch, String status, Integer page, Integer limit, String sort, String order) {
        ProTaskExample example = new ProTaskExample();
        ProTaskExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(sketch)) {
            criteria.andSketchLike("%" + sketch + "%");
        }
        if (!StringUtils.isEmpty(status)) {
            criteria.andStatusEqualTo("%" + status + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return proTaskMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        proTaskMapper.deleteByPrimaryKey(id);
    }

    public void updateById(ProTask proTask) {
        proTaskMapper.updateByPrimaryKeySelective(proTask);
    }

    public Object queryById(Integer id) {
        return proTaskMapper.selectByPrimaryKeySelective(id);
    }

    public List<ProTask> queryByProNum(Integer pro_num) {
        ProTaskExample example = new ProTaskExample();
        example.or().andProNumEqualTo(pro_num);
        return proTaskMapper.selectByExample(example);
    }

}
