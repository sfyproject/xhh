package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.core.validator.Order;
import org.xhh.core.validator.Sort;
import org.xhh.db.domain.Activitymeal;
import org.xhh.db.domain.ProUser;
import org.xhh.db.service.ActivitymealService;
import org.xhh.db.service.ProUserService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/activityMeal")
@Validated
public class ActivityMealController {

    private final Log logger = LogFactory.getLog(ActivityMealController.class);

    @Autowired
    private ActivitymealService activitymealService;

    @RequiresPermissions("admin:activityMeal:create")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地租赁模板"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody Activitymeal activitymeal) {
        logger.info("【ActivityMealController】====== create ======" + activitymeal.toString() );
        activitymealService.add(activitymeal);
        return ResponseUtil.ok(activitymeal);
    }

    @RequiresPermissions("admin:activityMeal:list")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地租赁模板"}, button="查询")
    @GetMapping("/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        List<Activitymeal> activitymealList = activitymealService.querySelective(name, page, limit);
        return ResponseUtil.okList(activitymealList);
    }

    @RequiresPermissions("admin:activityMeal:delete")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地租赁模板"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody Activitymeal activitymeal) {
        Integer id = activitymeal.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        activitymealService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityMeal:update")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地租赁模板"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody Activitymeal activitymeal) {
        Integer id = activitymeal.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }

        activitymealService.updateById(activitymeal);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityMeal:read")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地租赁模板"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(activitymealService.queryById(id));
    }
}
