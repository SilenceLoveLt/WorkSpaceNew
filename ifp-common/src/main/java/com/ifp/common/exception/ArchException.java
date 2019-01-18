package com.ifp.common.exception;

/**
 * 架构异常，遇见此异常，就代表服务端出现非预期异常，前端需要以友好方式提示用户。<br>
 *
 * 请思考如下代码：<br>
 * <pre>
 * 	try {
 * 		// 代码产生异常...
 *    } catch(Exception e) {
 * 		throw new ArchException(e);
 *    }
 * </pre>
 * 如果不处理异常，直接将异常抛出，那么异常会直接交给框架处理，在SpringBoot中，产生白页，所以，一般会配置异常拦截器，
 * 处理掉该异常；实现一个{@code HandlerExceptionResolver}是其中一种方式，当HandlerExceptionResolver截取到
 * 异常后，面临一个问题，就是是否将该异常输出到Logger？如果程序中的catch代码中，在抛出异常之前，已经进行了log，在
 * HandlerExceptionResolver中再次log，显然是不合适的，所以，必须进行某项约定：规定只在catch中记录log，还是只在
 * HandlerExceptionResolver记录log，而且，此约定最好还能通过某个参数控制，比如，已经约定只在HandlerExceptionResolver
 * 中记录log了，但是某个地方想单独在catch中记录，为了不至于HandlerExceptionResolver再次记录，需要进行某项设置将讯息传递
 * 到HandlerExceptionResolver，告诉HandlerExceptionResolver，不要再次打印了，此处，采用的是 isLog 字段。
 * @author xman
 *
 */
public class ArchException extends RuntimeException {

	private static final long serialVersionUID = 1L;

    /**
     * 设置在catch中是否已经进行了Log。
     * true：已经进行log，后续异常处理器（如果有）可以不用再次log；
     * false：默认值，没有进行log，后续异常处理器需要log。
     */
    private boolean isLog;
	
	public ArchException(String message) {
		super(message);
	}

	public ArchException(Throwable cause) {
		super(cause);
	}

	public ArchException(String message, Throwable cause) {
		super(message, cause);
    }

    public ArchException(String message, boolean isLogged) {
        super(message);
        isLog = isLogged;
    }

    public ArchException(Throwable cause, boolean isLogged) {
        super(cause);
        isLog = isLogged;
    }

    public ArchException(String message, Throwable cause, boolean isLogged) {
        super(message, cause);
        isLog = isLogged;
    }

    public boolean isLogged() {
        return isLog;
	}
	
}
