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
import org.xhh.db.domain.ProUserpay;
import org.xhh.db.service.ProUserPayService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/proUserPay")
@Validated
public class AdminProUserpayController {

    private final Log logger = LogFactory.getLog(AdminProUserpayController.class);

    @Autowired
    private ProUserPayService proUserPayService;

    @RequiresPermissions("admin:proUserPay:create")
    @RequiresPermissionsDesc(menu={"工薪管理" , "工薪维护"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody ProUserpay proUserpay) {
        logger.info("【AdminProContentController】====== create ======" + proUserpay.toString() );
        proUserPayService.add(proUserpay);
        return ResponseUtil.ok(proUserpay);
    }

    @RequiresPermissions("admin:proUserPay:list")
    @RequiresPermissionsDesc(menu={"工薪管理" , "工薪维护"}, button="查询")
    @GetMapping("/list")
    public Object list(String number, String project,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<ProUserpay> proUserpayList = proUserPayService.querySelective(number, project, page, limit, sort, order);
        return ResponseUtil.okList(proUserpayList);
    }

    @RequiresPermissions("admin:proUserPay:delete")
    @RequiresPermissionsDesc(menu = {"工薪管理", "工薪维护"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody ProUserpay proUserpay) {
        Integer id = proUserpay.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        proUserPayService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proUserPay:update")
    @RequiresPermissionsDesc(menu = {"工薪管理", "工薪编辑"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody ProUserpay proUserpay) {
        Integer proContentId = proUserpay.getId();
        if (proContentId == null) {
            return ResponseUtil.badArgument();
        }

        proUserPayService.updateById(proUserpay);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:proUserPay:read")
    @RequiresPermissionsDesc(menu = {"工薪管理", "工薪详情"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(proUserPayService.queryById(id));
    }
}
