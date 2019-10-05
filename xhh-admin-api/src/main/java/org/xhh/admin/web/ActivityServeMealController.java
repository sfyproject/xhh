package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.db.domain.Activityservemeal;
import org.xhh.db.service.ActivityservemealService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/activityServeMeal")
@Validated
public class ActivityServeMealController {

    private final Log logger = LogFactory.getLog(ActivityServeMealController.class);

    @Autowired
    private ActivityservemealService activityservemealService;

    @RequiresPermissions("admin:activityServeMeal:create")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地服务模板"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody Activityservemeal activityServeMeal) {
        logger.info("【ActivityServeMealController】====== create ======" + activityServeMeal.toString() );
        activityservemealService.add(activityServeMeal);
        return ResponseUtil.ok(activityServeMeal);
    }

    @RequiresPermissions("admin:activityServeMeal:list")
    @RequiresPermissionsDesc(menu={"场地管理" , "场地服务模板"}, button="查询")
    @GetMapping("/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        List<Activityservemeal> activityServeMealList = activityservemealService.querySelective(name, page, limit);
        return ResponseUtil.okList(activityServeMealList);
    }

    @RequiresPermissions("admin:activityServeMeal:delete")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务模板"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody Activityservemeal activityservemeal) {
        Integer id = activityservemeal.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        activityservemealService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityServeMeal:update")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务模板"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody Activityservemeal activityservemeal) {
        Integer id = activityservemeal.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }

        activityservemealService.updateById(activityservemeal);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:activityServeMeal:read")
    @RequiresPermissionsDesc(menu = {"场地管理" , "场地服务模板"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(activityservemealService.queryById(id));
    }
}
