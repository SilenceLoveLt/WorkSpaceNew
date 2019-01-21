package com.ifp.common.model;

import java.io.Serializable;
import java.util.Map;



/**
 * <P>
 *此对象抽象业务信息，各服务层在各自服务里继承此类进行属性添加
 * 如有未考虑到的业务，可将内容存储进dataMap属性中，或使用备用字段
 * </P>
 * @ClassName: PackageDTO
 * @author wxy  2018年09月22日 下午3:08:34
 * @see TODO
 */
public class PackageObj implements Serializable {
	private static final long serialVersionUID = 6800615312222966658L;
	private Header header;//鎶ユ枃澶撮儴淇℃伅 
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	
	public static PackageObj failMsg(String responseCode,String errorMessage) {
		PackageObj packages=new PackageObj();
		Header header =new Header();
		header.setResponseCode(responseCode);
		header.setErrorMessage(errorMessage);
		packages.setHeader(header);
		return packages;
	}
}
