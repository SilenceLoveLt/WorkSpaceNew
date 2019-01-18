package com.ifp.common.exception;

/**
 * 组件、工具类异常
 *
 * @author xman
 */
public class ToolException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ToolException(String message) {
        super(message);
    }

    public ToolException(Throwable cause) {
        super(cause);
    }

    public ToolException(String message, Throwable cause) {
        super(message, cause);
    }

}
