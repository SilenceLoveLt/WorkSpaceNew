/**
 * 
 */
package com.ifp.common.constant;


/**  
 * <p>Title: ProjectEnum</p>  
 * <p>Description: 鏋氫妇锟�</p>  
 * @author xutao  
 * @date 2018锟�4锟�11锟�  
 */
public enum ProjectEnum {
	
	MEMINFO_FBANK("MEMINFO_FBANK", "银行卡正面"),
	MEMINFO_FCARDID("MEMINFO_FCARDID", "身份证正面"),
	MEMINFO_BCARDID("MEMINFO_BCARDID", "身份证背面"),
    MEMINFO_EDUPIC("MEMINFO_EDUPIC", "学历证书"),
    MEMINFO_LEAVE("MEMINFO_LEAVE", "离职证明"),
    MEMINFO_BBANK("MEMINFO_BBANK", "银行卡背面"),
    MEMENTRESULT("MEMENTRESULT", "人员入司进度资料"),
    MEMINFO("MEMINFO", "人员基本信息资料"),
    MEMINFO_OTHER("MEMINFO_OTHER", "架构图影像"),
    MEMINFO_CA("MEMINFO_CA", "CA签名影像"),
    MEMINFO_SINGNPIC("MEMINFO_SINGNPIC", "电子签名串图片"),
	POLICY_TRACK("POLICY_TRACK", "保单追踪附件");

	private String code;
	private String name;

	private ProjectEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public static String getName(String code){
	    for(ProjectEnum projectEnum:values()){
	        if(projectEnum.getCode().equals(code)){
	            return projectEnum.getName();
            }
        }
        return "";
    }

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
