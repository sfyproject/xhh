package org.xhh.admin.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.xhh.core.util.IpUtil;
import org.xhh.db.domain.LitemallAdmin;
import org.xhh.db.domain.LitemallLog;
import org.xhh.db.service.LitemallLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.xhh.db.service.LitemallLogService;

import javax.servlet.http.HttpServletRequest;

/**
 * 这里的日志类型设计成四种（当然开发者需要可以自己扩展）
 * 一般日志：用户觉得需要查看的一般操作日志，建议是默认的日志级别
 * 安全日志：用户安全相关的操作日志，例如登录、删除管理员
 * 订单日志：用户交易相关的操作日志，例如订单发货、退款
 * 其他日志：如果以上三种不合适，可以选择其他日志，建议是优先级最低的日志级别
 *
 * 当然可能很多操作是不需要记录到数据库的，例如编辑商品、编辑广告品之类。
 */

/**
 * 注解说明
 * @Date: 2019-5-30  11:11
 * @Params: LogHelper.java
 * @Author: sunfy
 *
 * @component （把普通pojo实例化到spring容器中，相当于配置文件中的
 * <bean id="" class=""/>）
 * 泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
 */
@Component
public class LogHelper {
    public final static Integer LOG_TYPE_GENERAL = 0;
    public final static Integer LOG_TYPE_AUTH = 1;
    public final static Integer LOG_TYPE_ORDER = 2;
    public final static Integer LOG_TYPE_OTHER = 3;

    @Autowired
    private LitemallLogService logService;

    public void logGeneralSucceed(String action){
        logAdmin(LOG_TYPE_GENERAL, action, true, "", "");
    }

    public void logGeneralSucceed(String action, String result){
        logAdmin(LOG_TYPE_GENERAL, action, true, result, "");
    }

    public void logGeneralFail(String action, String error){
        logAdmin(LOG_TYPE_GENERAL, action, false, error, "");
    }

    public void logAuthSucceed(String action){
        logAdmin(LOG_TYPE_AUTH, action, true, "", "");
    }

    public void logAuthSucceed(String action, String result){
        logAdmin(LOG_TYPE_AUTH, action, true, result, "");
    }

    public void logAuthFail(String action, String error){
        logAdmin(LOG_TYPE_AUTH, action, false, error, "");
    }

    public void logOrderSucceed(String action){
        logAdmin(LOG_TYPE_ORDER, action, true, "", "");
    }

    public void logOrderSucceed(String action, String result){
        logAdmin(LOG_TYPE_ORDER, action, true, result, "");
    }

    public void logOrderFail(String action, String error){
        logAdmin(LOG_TYPE_ORDER, action, false, error, "");
    }

    public void logOtherSucceed(String action){
        logAdmin(LOG_TYPE_OTHER, action, true, "", "");
    }

    public void logOtherSucceed(String action, String result){
        logAdmin(LOG_TYPE_OTHER, action, true, result, "");
    }


    public void logOtherFail(String action, String error){
        logAdmin(LOG_TYPE_OTHER, action, false, error, "");
    }

    /**
     * 将日志信息写入数据库中
     * @Date: 2019-5-30  11:16
     * @Params: LogHelper.java
     * @Author: sunfy
     *
     */
    public void logAdmin (Integer type, String action, Boolean succeed, String result, String comment){
        LitemallLog log = new LitemallLog();

        // 从shiro中获取subject
        Subject currentUser = SecurityUtils.getSubject();
        if(currentUser != null) {
            LitemallAdmin admin = (LitemallAdmin) currentUser.getPrincipal();
            if(admin != null) {
                log.setAdmin(admin.getUsername());
            }
            else{
                log.setAdmin("匿名用户");
            }
        }
        else{
            log.setAdmin("匿名用户");
        }

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        if(request != null) {
            log.setIp(IpUtil.getIpAddr(request));
        }

        log.setType(type);
        log.setAction(action);
        log.setStatus(succeed);
        log.setResult(result);
        log.setComment(comment);
        logService.add(log);
    }

}
