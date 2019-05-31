package org.xhh.admin.util;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.xhh.admin.annotation.RequiresPermissionsDesc;

public class Permission {

    // 验证用户是否登录
    private RequiresPermissions requiresPermissions;
    // 定义目录和按钮
    private RequiresPermissionsDesc requiresPermissionsDesc;
    private String api;

    public RequiresPermissions getRequiresPermissions() {
        return requiresPermissions;
    }

    public RequiresPermissionsDesc getRequiresPermissionsDesc() {
        return requiresPermissionsDesc;
    }

    public void setRequiresPermissions(RequiresPermissions requiresPermissions) {
        this.requiresPermissions = requiresPermissions;
    }

    public void setRequiresPermissionsDesc(RequiresPermissionsDesc requiresPermissionsDesc) {
        this.requiresPermissionsDesc = requiresPermissionsDesc;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
