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
import org.xhh.db.domain.ProUser;
import org.xhh.db.service.ProUserService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/proUser")
@Validated
public class AdminProUserController {

    private final Log logger = LogFactory.getLog(AdminProUserController.class);

    @Autowired
    private ProUserService proUserService;

    @RequiresPermissions("admin:proUser:create")
    @RequiresPermissionsDesc(menu={"人员管理" , "项目维护"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody ProUser proUser) {
        logger.info("【AdminProUserController】====== create ======" + proUser.toString() );
        proUserService.add(proUser);
        return ResponseUtil.ok(proUser);
    }

    @RequiresPermissions("admin:proUser:list")
    @RequiresPermissionsDesc(menu={"人员管理" , "项目维护"}, button="查询")
    @GetMapping("/list")
    public Object list(String number, String project,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<ProUser> proUserList = proUserService.querySelective(number, project, page, limit, sort, order);
        return ResponseUtil.okList(proUserList);
    }

    @RequiresPermissions("admin:proUser:delete")
    @RequiresPermissionsDesc(menu = {"人员管理", "项目维护"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody ProUser proUser) {
        Integer id = proUser.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        proUserService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proUser:update")
    @RequiresPermissionsDesc(menu = {"人员管理", "项目编辑"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody ProUser proUser) {
        Integer proContentId = proUser.getId();
        if (proContentId == null) {
            return ResponseUtil.badArgument();
        }

        proUserService.updateById(proUser);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proUser:read")
    @RequiresPermissionsDesc(menu = {"人员管理", "项目详情"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(proUserService.queryById(id));
    }
}
