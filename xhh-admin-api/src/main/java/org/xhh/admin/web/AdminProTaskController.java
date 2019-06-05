package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.core.validator.Order;
import org.xhh.core.validator.Sort;
import org.xhh.db.domain.LitemallAdmin;
import org.xhh.db.domain.ProTask;
import org.xhh.db.service.ProTaskService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-3
 */
@RestController
@RequestMapping("/admin/proTask")
@Validated
public class AdminProTaskController {

    private final Log logger = LogFactory.getLog(AdminProTaskController.class);

    @Autowired
    private ProTaskService proTaskService;

    @RequiresPermissions("admin:proTask:list")
    @RequiresPermissionsDesc(menu={"项目管理" , "任务维护"}, button="查询")
    @GetMapping("/list")
    public Object list(String sketch, String status,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<ProTask> proTaskList = proTaskService.querySelective(sketch, status, page, limit, sort, order);
        return ResponseUtil.okList(proTaskList);
    }

    @RequiresPermissions("admin:proTask:delete")
    @RequiresPermissionsDesc(menu = {"项目管理", "任务维护"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody ProTask proTask) {
        Integer id = proTask.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        proTaskService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proTask:update")
    @RequiresPermissionsDesc(menu = {"项目管理", "任务维护"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody ProTask proTask) {
        proTaskService.updateById(proTask);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proTask:read")
    @RequiresPermissionsDesc(menu = {"项目管理", "任务维护"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        ProTask proTask = proTaskService.queryById(id);
        // 从shiro中获取subject
        Subject currentUser = SecurityUtils.getSubject();
        LitemallAdmin admin = null;
        if(currentUser != null) {
            admin = (LitemallAdmin) currentUser.getPrincipal();
        }

        proTask.setCreaterid(admin.getUsername());
        return ResponseUtil.ok(proTask);
    }
}
