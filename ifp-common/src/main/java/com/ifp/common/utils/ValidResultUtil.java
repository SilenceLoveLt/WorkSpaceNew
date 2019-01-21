package com.ifp.common.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * @description: valid校验框架工具类
 */
public class ValidResultUtil {

    /**
     * @description: 返回校验信息
     * @params: bindingResult 绑定的校验结果对象
     * @return:
     * @exception:
     */
    public static String  resultMsg(BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            List<ObjectError> errorsList = bindingResult.getAllErrors();
            StringBuilder errorMsg = new StringBuilder();
            for (ObjectError error : errorsList) {
                errorMsg.append(error.getDefaultMessage() + ",");
            }
            return errorMsg.substring(0, errorMsg.length() - 1);
        }
        return "";
    }
}
