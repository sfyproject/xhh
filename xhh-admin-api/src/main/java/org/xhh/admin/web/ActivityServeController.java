package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.db.domain.Activityserve;
import org.xhh.db.service.ActivityserveService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/activityServe")
@Validated
public class ActivityServeController {

    private final Log logger = LogFactory.getLog(ActivityServeController.class);

    @Autowired
    private ActivityserveService activityServeService;

    @RequiresPermissions("admin:activityServe:create")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地服务"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody Activityserve activityServe) {
        logger.info("【ActivityServeController】====== create ======" + activityServe.toString() );
        activityServeService.add(activityServe);
        return ResponseUtil.ok(activityServe);
    }

    @RequiresPermissions("admin:activityServe:list")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地服务"}, button="查询")
    @GetMapping("/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        List<Activityserve> activityServeList = activityServeService.querySelective(name, page, limit);
        return ResponseUtil.okList(activityServeList);
    }

    @RequiresPermissions("admin:activityServe:delete")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody Activityserve activityServe) {
        Integer id = activityServe.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        activityServeService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityServe:update")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody Activityserve activityServe) {
        Integer id = activityServe.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }

        activityServeService.updateById(activityServe);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityServe:read")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(activityServeService.queryById(id));
    }
}
