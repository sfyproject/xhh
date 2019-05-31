package org.xhh.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.xhh.admin.annotation.RequiresPermissionsDesc;
import org.xhh.core.util.ResponseUtil;
import org.xhh.core.validator.Order;
import org.xhh.core.validator.Sort;
import org.xhh.db.domain.LitemallAddress;
import org.xhh.db.service.LitemallAddressService;
import org.xhh.db.service.LitemallRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/address")
@Validated
public class AdminAddressController {
    private final Log logger = LogFactory.getLog(AdminAddressController.class);

    @Autowired
    private LitemallAddressService addressService;
    @Autowired
    private LitemallRegionService regionService;

    @RequiresPermissions("admin:address:list")
    @RequiresPermissionsDesc(menu={"用户管理" , "收货地址"}, button="查询")
    @GetMapping("/list")
    public Object list(Integer userId, String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {

        List<LitemallAddress> addressList = addressService.querySelective(userId, name, page, limit, sort, order);
        return ResponseUtil.okList(addressList);
    }
}
