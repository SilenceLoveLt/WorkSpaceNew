package com.ifp.common.constant;

/**
 * <P>Description: 标识BaseCode是否已作用</P>
 * @ClassName: BaseCodeEnabled
 * @see
 */
public enum BaseCodeEnabled {

	/**
	 * @Fields ENABLE : 可用
	 */
	ENABLE("1"), /**
					* @Fields DISABLE : 不可用
					*/
	DISABLE("0");

	private final String isEnable;

	BaseCodeEnabled(String isEnable) {
		this.isEnable = isEnable;
	}

	public String isEnable() {
		return this.isEnable;
	}
}
