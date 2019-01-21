package com.ifp.common.utils;

import com.ifp.common.constant.Constant;
import com.ifp.common.model.LogCollectObj;
import com.ifp.common.model.ResponseObj;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class WebLogAspect {
    private Log logger = LogFactory.getLog(WebLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    @Pointcut("execution(public * com.ifp.*.controller..*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore() throws Throwable {
        startTime.set(System.currentTimeMillis());
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public Object doAfterReturning(Object ret) throws Throwable {
        if (ret instanceof ResponseObj) {
            ResponseObj responseObj = (ResponseObj) ret;
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            LogCollectObj logCollectObj = new LogCollectObj(responseObj.getFunctionCode(),responseObj.getFunctionName(), (System.currentTimeMillis() - startTime.get()) / 1000, Constant.SYS_CONSTANT_0.equals(responseObj.getResponseCode()) ? Constant.RESPONSE_SUCCESS_KEY : Constant.RESPONSE_FAIL_KEY, responseObj.getResponseMsg(),
                    "", request.getHeader("channel"), request.getHeader("tagchannel"), request.getHeader("devicetype"), request.getHeader("deviceno"),
                    request.getHeader("clientsystem"), request.getHeader("clientsystemver"), request.getHeader("networktype"), request.getHeader("networkoperator"), request.getHeader("networksignal"),
                    request.getHeader("devicememorysize"), request.getHeader("devicememoryusagesize"), request.getHeader("cpuusagerate"), request.getHeader("networkname"), request.getHeader("uploadspeed"),
                    request.getHeader("downloadspeed"), request.getHeader("longitude"), request.getHeader("latitude"), DateFormatUtils.format(new Date(startTime.get()), "yyyy-MM-dd HH:mm:ss"), request.getHeader("requestmessage"), DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"),
                    request.getHeader("responsemessage"), request.getHeader("openid"), request.getHeader("tokencode"), "", request.getHeader("responseadress"));
            logger.info(logCollectObj.toString());
        }
        return ret;
    }

}
