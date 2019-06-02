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
import org.xhh.db.domain.ProContent;
import org.xhh.db.service.ProContentService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:08 2019-6-1
 */
@RestController
@RequestMapping("/admin/pro")
@Validated
public class AdminProContentController {

    private final Log logger = LogFactory.getLog(AdminProContentController.class);

    @Autowired
    private ProContentService proContentService;

    @RequiresPermissions("admin:pro:create")
    @RequiresPermissionsDesc(menu={"项目管理" , "项目维护"}, button="新增")
    @PostMapping("/create")
    public Object create(@RequestBody ProContent proContent) {
        logger.info("【AdminProContentController】====== create ======" + proContent.toString() );
        proContentService.add(proContent);
        return ResponseUtil.ok(proContent);
    }

    @RequiresPermissions("admin:pro:list")
    @RequiresPermissionsDesc(menu={"项目管理" , "项目维护"}, button="查询")
    @GetMapping("/list")
    public Object list(String number, String project,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<ProContent> proContentList = proContentService.querySelective(number, project, page, limit, sort, order);
        return ResponseUtil.okList(proContentList);
    }

    @RequiresPermissions("admin:pro:delete")
    @RequiresPermissionsDesc(menu = {"项目管理", "项目维护"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody ProContent proContent) {
        Integer id = proContent.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        proContentService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:pro:update")
    @RequiresPermissionsDesc(menu = {"项目管理", "项目编辑"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody ProContent proContent) {
        Integer proContentId = proContent.getId();
        if (proContentId == null) {
            return ResponseUtil.badArgument();
        }

        proContentService.updateById(proContent);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:pro:read")
    @RequiresPermissionsDesc(menu = {"项目管理", "项目详情"}, button = "详情")
    @GetMapping("/detail")
    public Object detail(@NotNull Integer id) {
        return ResponseUtil.ok(proContentService.queryById(id));
    }
}
