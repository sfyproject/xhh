package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.db.domain.Activity;
import org.xhh.db.service.ActivityService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/activity")
@Validated
public class ActivityController {

    private final Log logger = LogFactory.getLog(ActivityController.class);

    @Autowired
    private ActivityService activityService;

    @RequiresPermissions("admin:activity:create")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody Activity activity) {
        logger.info("【ActivityController】====== create ======" + activity.toString() );
        activityService.add(activity);
        return ResponseUtil.ok(activity);
    }

    @RequiresPermissions("admin:activity:list")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地"}, button="查询")
    @GetMapping("/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        List<Activity> activityList = activityService.querySelective(name, page, limit);
        return ResponseUtil.okList(activityList);
    }

    @RequiresPermissions("admin:activity:delete")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody Activity activity) {
        Integer id = activity.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        activityService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activity:update")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody Activity activity) {
        Integer id = activity.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }

        activityService.updateById(activity);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activity:read")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(activityService.queryById(id));
    }
}
