package com.ifp.common.constant;

import java.util.Arrays;
import java.util.List;

/**
 * <P>Description: 项目枚举工具</P>
 * @ClassName: EnumCommonType
 * @author xushixuan 2012-8-13 下午02:02:56
 */
public class EnumCommonType {

	/**
	 * 
	 * <P>Description: 系统管理</P>
	 * @ClassName: SystemEnumType
	 * @author xushixuan 2012-8-13 下午02:05:37
	 */
	public enum SystemEnumType {
		SYSTEM_USER("system", "系统管理员");

		private String code;
		private String name;

		private SystemEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 系统管理�?</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<SystemEnumType> getAll() {
			return Arrays.asList(SystemEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getSystemEnumType</p>
		 * <p>Description: 根据code值查找对应的SystemEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static SystemEnumType getSystemEnumType(String code) {
			code = code.trim();
			for (SystemEnumType systemEnumType : values()) {
				if (code.equals(systemEnumType.getCode())) {
					return systemEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: �?售渠道所属层�?</P>
	 * @ClassName: ChannelSystemEnumType
	 * @author xushixuan 2012-8-13 下午02:05:37
	 */
	public enum ChannelSystemEnumType {
		B2B("B2B", "B2B"), B2C("B2C", "B2C"), B2G("B2G", "B2G");

		private String code;
		private String name;

		private ChannelSystemEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的渠道层级</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<ChannelSystemEnumType> getAll() {
			return Arrays.asList(ChannelSystemEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getChannelSystemEnumType</p>
		 * <p>Description: 根据code值查找对应的ChannelSystemEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static ChannelSystemEnumType getChannelSystemEnumType(String code) {
			code = code.trim();
			for (ChannelSystemEnumType channelSystemEnumType : values()) {
				if (code.equals(channelSystemEnumType.getCode())) {
					return channelSystemEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * <P>Description: 积分明细状�??</P>
	 * @ClassName: IntegralDetailStatus
	 * @author A   2012-10-9 下午03:16:40
	 * @see 
	 */
	public enum IntegralDetailStatus {
		INIT("1", "初始状�??"), SUCCESS("2", "成功"), FAILURE("3", "失败");

		private String code;
		private String name;

		private IntegralDetailStatus(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的 积分明细状�?�数�?</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<IntegralDetailStatus> getAll() {
			return Arrays.asList(IntegralDetailStatus.values());
		}

		/**
		 * 
		 * <p>Title: getIntegralDetailStatus</p>
		 * <p>Description: 根据code值查找对应的积分明细状�??</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static IntegralDetailStatus getIntegralDetailStatus(String code) {
			code = code.trim();
			for (IntegralDetailStatus integralDetailStatus : values()) {
				if (code.equals(integralDetailStatus.getCode())) {
					return integralDetailStatus;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: 产品渠道配置是否有效枚举�?</P>
	 * @ClassName: ChannelProductStatusEnumType
	 * @author xushixuan 2012-8-29 下午03:23:58
	 */
	public enum ChannelProductStatusEnumType {
		SHENG_XIAO("1", "已生�?"), JIN_YONG("2", "禁用"), GUO_QI("0", "已过�?"), NOT_SHENG_XIAO("3", "未生�?");

		private String code;
		private String name;

		private ChannelProductStatusEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的 产品渠道配置是否有效数据</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<ChannelProductStatusEnumType> getAll() {
			return Arrays.asList(ChannelProductStatusEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getChannelSystemEnumType</p>
		 * <p>Description: 根据code值查找对应的ChannelProductStatusEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static ChannelProductStatusEnumType getChannelProductStatusEnumType(String code) {
			code = code.trim();
			for (ChannelProductStatusEnumType channelProductStatusEnumType : values()) {
				if (code.equals(channelProductStatusEnumType.getCode())) {
					return channelProductStatusEnumType;
				}
			}
			return null;
		}

	}

	/**
	 * 
	 * <P>Description: 已生效，已失效状态�?�枚举类
	 * 		适用范围，佣金规则状态，积分规则状�?�等�?
	 * 		以后如果涉及到已生效，已失效两种状�?�的业务数据值，统一使用该枚举类进行数据的处理�??
	 * </P>
	 * @ClassName: StatusCommonEnumType
	 * @author xushixuan 2012-8-29 下午03:23:58
	 */
	public enum StatusCommonEnumType {
		SHENG_XIAO("1", "已生�?"), JIN_YONG("2", "禁用"), GUO_QI("0", "已过�?"), NOT_SHENG_XIAO("3", "未生�?");

		private String code;
		private String name;

		private StatusCommonEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 已生效，已失效状态�?�枚举类</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<StatusCommonEnumType> getAll() {
			return Arrays.asList(StatusCommonEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getStatusCommonEnumType</p>
		 * <p>Description: 根据code值查找对应的StatusCommonEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static StatusCommonEnumType getStatusCommonEnumType(String code) {
			code = code.trim();
			for (StatusCommonEnumType statusCommonEnumType : values()) {
				if (code.equals(statusCommonEnumType.getCode())) {
					return statusCommonEnumType;
				}
			}
			return null;
		}

	}

	/**
	 * 
	 * <P>Description: 订单�?售类�?</P>
	 * @ClassName: OrderTypeEnumType
	 * @author xushixuan 2012-8-30 上午11:18:36
	 */
	public enum OrderTypeEnumType {
		B2B_ORDER_TYPE("B2B", "B2B�?�?"), B2G_ORDER_TYPE("B2G", "B2G�?�?"), B2C_ORDER_TYPE("B2C", "B2C�?�?"), OTHERS_ORDER_TYPE(
				"OTHERS", "其他�?�?");
		private String code;
		private String name;

		private OrderTypeEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的订单�?售类�?</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<OrderTypeEnumType> getAll() {
			return Arrays.asList(OrderTypeEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getOrderTypeEnumType</p>
		 * <p>Description: 根据code值查找对应的OrderTypeEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static OrderTypeEnumType getOrderTypeEnumType(String code) {
			code = code.trim();
			for (OrderTypeEnumType orderTypeEnumType : values()) {
				if (code.equals(orderTypeEnumType.getCode())) {
					return orderTypeEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: �?售明细订单标示枚举类</P>
	 * @ClassName: SellDetailpolicyMarkEnumType
	 * @author xushixuan 2012-8-30 下午02:32:11
	 */
	public enum SellDetailOrderMarkEnumType {
		GOUBAO("1", "购保"), TUIBAO("2", "�?�?");
		private String code;
		private String name;

		private SellDetailOrderMarkEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的�?售明细订单标示枚举类</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<SellDetailOrderMarkEnumType> getAll() {
			return Arrays.asList(SellDetailOrderMarkEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getSellDetailOrderMarkEnumType</p>
		 * <p>Description: 根据code值查找对应的SellDetailOrderMarkEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static SellDetailOrderMarkEnumType getSellDetailOrderMarkEnumType(String code) {
			code = code.trim();
			for (SellDetailOrderMarkEnumType sellDetailOrderMarkEnumType : values()) {
				if (code.equals(sellDetailOrderMarkEnumType.getCode())) {
					return sellDetailOrderMarkEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: 用户账户存支类型</P>
	 * @ClassName: AccountInOutEnumType
	 * @author xushixuan 2012-8-30 下午04:00:24
	 */
	public enum AccountInOutEnumType {
		IN_MONEY("1", "存入"), OUT_MONEY("2", "支出");

		private String code;
		private String name;

		private AccountInOutEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的用户账户存支类型</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<AccountInOutEnumType> getAll() {
			return Arrays.asList(AccountInOutEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getAccountInOutEnumType</p>
		 * <p>Description: 根据code值查找对应的AccountInOutEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static AccountInOutEnumType getAccountInOutEnumType(String code) {
			code = code.trim();
			for (AccountInOutEnumType accountInOutEnumType : values()) {
				if (code.equals(accountInOutEnumType.getCode())) {
					return accountInOutEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: 产品状�??</P>
	 * @ClassName: ProductStatusEnumType
	 * @author huangshuyi 2012-8-31 下午04:00:24
	 */
	public enum ProductStatusEnumType {
		NEW_STATUS("0", "未提�?"), NEW_AUDIT_STATUS("01", "审核�?�?"), NEW_PUBLISH_STATUS("02", "发布�?�?"), SUBMIT_STATUS("1",
				"待审�?"), AUDIT_STATUS("2", "待发�?"), PUBISH_STATUS("3", "已发�?"), DELETE_STATUS("90", "已删�?"), REFERRALS_STATUS(
				"91", "已下�?");
		private String code;
		private String name;

		private ProductStatusEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的产品的状�?</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<ProductStatusEnumType> getAll() {
			return Arrays.asList(ProductStatusEnumType.values());
		}

		/**
		 * 
		 * <p>Title: ProductStatusEnumType</p>
		 * <p>Description: 根据code值查找对应的ProductStatusEnumType类型</p>
		 * @param code
		 * @return
		 * @author huangshuyi  2012-8-13 下午02:13:30
		 */
		public static ProductStatusEnumType getProductStatusEnumType(String code) {
			code = code.trim();
			for (ProductStatusEnumType productStatusEnumType : values()) {
				if (code.equals(productStatusEnumType.getCode())) {
					return productStatusEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * <P>Description: 根据code值查找对应的IntegralProjectEnumType类型</P>
	 * @ClassName: IntegralProjectEnumType
	 * @author wei.zhou  2012-9-13 上午10:12:14
	 * @see 
	 */
	public enum IntegralProjectEnumType {
		PROJECT_LOGIN("1", "注册");
		private String code;
		private String name;

		private IntegralProjectEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有积分项�?</p>
		 * @return
		 * @author wei.zhou  2012-9-12 下午05:51:03
		 */
		public static List<IntegralProjectEnumType> getAll() {
			return Arrays.asList(IntegralProjectEnumType.values());
		}

		/**
		 * <p>Title: getIntegralProjectEnumType</p>
		 * <p>Description: 根据code值查找对应的getIntegralProjectEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-9-12 下午05:52:31
		 */
		public static IntegralProjectEnumType getIntegralProjectEnumType(String code) {
			code = code.trim();
			for (IntegralProjectEnumType integralProjectEnumType : values()) {
				if (code.equals(integralProjectEnumType.getCode())) {
					return integralProjectEnumType;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <P>Description: 订单积分归属标示</P>
	 * @ClassName: OrderPointAttrEnumType
	 * @author xushixuan 2012-8-29 下午03:23:58
	 */
	public enum OrderPointAttrEnumType {
		ONESELF("1", "本网�?"), OTHER("0", "其他");

		private String code;
		private String name;

		private OrderPointAttrEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * 
		 * <p>Title: getAll</p>
		 * <p>Description:获得�?有的订单积分归属标示�?</p>
		 * @return
		 * @author xushixuan  2012-8-13 下午05:41:53
		 */
		public static List<OrderPointAttrEnumType> getAll() {
			return Arrays.asList(OrderPointAttrEnumType.values());
		}

		/**
		 * 
		 * <p>Title: getOrderPointAttrEnumType</p>
		 * <p>Description: 根据code值查找对应的OrderPointAttrEnumType类型</p>
		 * @param code
		 * @return
		 * @author xushixuan  2012-8-13 下午02:13:30
		 */
		public static OrderPointAttrEnumType getOrderPointAttrEnumType(String code) {
			code = code.trim();
			for (OrderPointAttrEnumType orderPointAttrEnumType : values()) {
				if (code.equals(orderPointAttrEnumType.getCode())) {
					return orderPointAttrEnumType;
				}
			}
			return null;
		}

	}

	/**
	 * <P>Description: 数据限制规则-限制类型</P>
	 * @ClassName: LimitDataRuleEnumType
	 * @author wei.zhou  2012-10-9 下午01:06:08
	 * @see 
	 */
	public enum LimitDataRuleEnumType {
		JIFEN_ZUIDI_XIAOFEI("1", "积分�?低消费限�?");

		private String code;
		private String name;

		private LimitDataRuleEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的订单积分归属标示�?</p>
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:05:57
		 */
		public static List<LimitDataRuleEnumType> getAll() {
			return Arrays.asList(LimitDataRuleEnumType.values());
		}

		/**
		 * <p>Title: getLimitDataRuleEnumType</p>
		 * <p>Description: 根据code值查找对应的LimitDataRuleEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:05:21
		 */
		public static LimitDataRuleEnumType getLimitDataRuleEnumType(String code) {
			code = code.trim();
			for (LimitDataRuleEnumType limitDataRuleEnumType : values()) {
				if (code.equals(limitDataRuleEnumType.getCode())) {
					return limitDataRuleEnumType;
				}
			}
			return null;
		}

	}
	
	
	/**
	 * <P>Description: 证件类型枚举�?</P>
	 * @ClassName: CertiTypeEnumType
	 * @author wei.zhou  2012-10-9 下午01:06:08
	 * @see 
	 */
	public enum CertiTypeEnumType {
		SFZ_TYPE("0", "身份�?"),JGZ_TYPE("1", "军官�?"),HZ_TYPE("2", "护照");

		private String code;
		private String name;

		private CertiTypeEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的订单积分归属标示�?</p>
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:05:57
		 */
		public static List<CertiTypeEnumType> getAll() {
			return Arrays.asList(CertiTypeEnumType.values());
		}

		/**
		 * <p>Title: getCertiTypeEnumType</p>
		 * <p>Description: 根据code值查找对应的LimitDataRuleEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:05:21
		 */
		public static CertiTypeEnumType getCertiTypeEnumType(String code) {
			code = code.trim();
			for (CertiTypeEnumType certiTypeEnumType : values()) {
				if (code.equals(certiTypeEnumType.getCode())) {
					return certiTypeEnumType;
				}
			}
			return null;
		}

	}


	/**
	 * <P>Description: 兑换规则-兑换比率类别</P>
	 * @ClassName: ExchangeRuleEnumType
	 * @author wei.zhou  2012-10-9 下午01:09:36
	 * @see 
	 */
	public enum ExchangeRuleEnumType {
		JIFEN_XIANJIN("1", "积分现金");

		private String code;
		private String name;

		private ExchangeRuleEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有的订单积分归属标示�?</p>
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:24
		 */
		public static List<ExchangeRuleEnumType> getAll() {
			return Arrays.asList(ExchangeRuleEnumType.values());
		}

		/**
		 * <p>Title: getExchangeRuleEnumType</p>
		 * <p>Description: 根据code值查找对应的ExchangeRuleEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:10
		 */
		public static ExchangeRuleEnumType getExchangeRuleEnumType(String code) {
			code = code.trim();
			for (ExchangeRuleEnumType exchangeRuleEnumType : values()) {
				if (code.equals(exchangeRuleEnumType.getCode())) {
					return exchangeRuleEnumType;
				}
			}
			return null;
		}
		
	}
	
	
	/**
	 * <P>Description: 订单状�??</P>
	 * @ClassName: OrderStatusEnumType
	 * @author A   2014�?4�?18�? 下午2:02:11
	 * @see
	 */
	public enum OrderStatusEnumType {
		ORDER_STATUS_EFFECT("83", "已生�?")
		,ORDER_STATUS_DEPOSIT("81","暂存")
		,ORDER_STATUS_WAITPAY("82","待支�?")
		,ORDER_STATUS_EXPIRED("86","已过�?")
		,ORDER_STATUS_PAYSUCCESS("87","已支�?")
		,ORDER_STATUS_PAYREFUSED("90","拒保")
		,ORDER_STATUS_RULE_ERROR("8701","已支�?")
		,ORDER_STATUS_PAYMENT_EXPIRED("8702","已支付，订单支付日期大于保险期望生效日期")
		,ORDER_STATUS_THIRD_INIT_ERROR("8703","已支付，初始（临时）调用承保接口异常(第三方接�?)")
		,ORDER_STATUS_THIRD_ERROR("8704","已支付，经过补偿调用后仍旧承保不成功")
		,ORDER_STATUS_ESB_ERROR("8705","已支付，调用ESB系统解析过程异常，非调用第三方异�?")
		,ORDER_STATUS_PRODUCT_EXPIRED("8706","已支付，但产品已下架")
		,ORDER_STATUS_REFUNDED("8801","订单已撤�?")
		,ORDER_STATUS_SURRENDER("8802","订单已�??�?");
		

		private String code;
		private String name;

		private OrderStatusEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有订单状态�??</p>
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:24
		 */
		public static List<OrderStatusEnumType> getAll() {
			return Arrays.asList(OrderStatusEnumType.values());
		}

		/**
		 * <p>Title: getOrderStatusEnumType</p>
		 * <p>Description: 根据code值查找对应的OrderStatusEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:10
		 */
		public static OrderStatusEnumType getOrderStatusEnumType(String code) {
			code = code.trim();
			for (OrderStatusEnumType orderStatusEnumType : values()) {
				if (code.equals(orderStatusEnumType.getCode())) {
					return orderStatusEnumType;
				}
			}
			return null;
		}
		
	}
	
	/**
	 * <P>Description: 保单状�??</P>
	 * @ClassName: ExchangeRuleEnumType
	 * @author wei.zhou  2012-10-9 下午01:09:36
	 * @see 
	 */
	public enum PolicyStatusEnumType {
		POLICY_STATUS_UNDERWRITEING("0","核保�?")
		,POLICY_STATUS_UNDERWRITE_SUC("2", "核保成功")
		,POLICY_STATUS_UNDERWRITE_FAIL("5","核保失败")
		,POLICY_STATUS_SECUNDWRT_SUC("6","二次核保成功")
		,POLICY_STATUS_SECUNDWRT_FAIL("7","二次核保失败")
		,POLICY_STATUS_DECLINATURE("8","拒保")
		,POLICY_STATUS_INSURE_SUC("10","承保成功")
		,POLICY_STATUS_INSURE_FAIL("11","承保失败")
		,POLICY_STATUS_SURRENDER_SUC("12","�?保成�?")
		,POLICY_STATUS_SURRENDER_FAIL("13","�?保失�?")
		,POLICY_STATUS_TERMINATION("3","终止")
		,POLICY_STATUS_FAILURE("14","失效");

		private String code;
		private String name;

		private PolicyStatusEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		/**
		 * <p>Title: getAll</p>
		 * <p>Description: 获得�?有订单状态�??</p>
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:24
		 */
		public static List<PolicyStatusEnumType> getAll() {
			return Arrays.asList(PolicyStatusEnumType.values());
		}

		/**
		 * <p>Title: getOrderStatusEnumType</p>
		 * <p>Description: 根据code值查找对应的OrderStatusEnumType类型</p>
		 * @param code
		 * @return
		 * @author wei.zhou  2012-10-9 下午01:09:10
		 */
		public static PolicyStatusEnumType getPolicyStatusEnumType(String code) {
			code = code.trim();
			for (PolicyStatusEnumType policyStatusEnumType : values()) {
				if (code.equals(policyStatusEnumType.getCode())) {
					return policyStatusEnumType;
				}
			}
			return null;
		}
		
	}

	/**
	 * <P>Description: TODO</P>
	 * @ClassName: PolicyAlterStatusEnumType
	 * @author houweiting  2014�?5�?16�? 上午10:56:46
	 * @see TODO
	 */
	public enum PolicyAlterStatusEnumType {
		POLICYALTER_STATUS_EFFECT("9", "保全生效")
		,POLICYALTER_STATUS_PROCESSING("0","处理�?")
		,POLICYALTER_STATUS_ACCEPTED("-2","待受�?")
		,POLICY_STATUS_RECORDED("-1","待录�?")
		,POLICY_STATUS_TERMINATION("24","逾期终止")
		,POLICY_STATUS_COMPOSITE("14","待复�?")
		,POLICY_STATUS_NOTEFFECT("26","确认未生�?")
		,POLICY_STATUS_REVOCATION("11","保全撤销")
		,POLICY_STATUS_UNDERTERMINATION("28","核保终止")
		,POLICY_STATUS_UNDERTERMINATIONED("29","复核终止")
		,POLICY_STATUS_CONFIRMATION("29","待审批确�?")
		,POLICY_STATUS_ROLLBACK("5","保全回�??")
		,POLICY_STATUS_CROSSSECTION("10","已划�?");

		private String code;
		private String name;

		private PolicyAlterStatusEnumType(String code, String name) {
			this.code = code;
			this.name = name;
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

		
		public static List<PolicyAlterStatusEnumType> getAll() {
			return Arrays.asList(PolicyAlterStatusEnumType.values());
		}

		
		public static PolicyAlterStatusEnumType getPolicyAlterStatusEnumType(String code) {
			code = code.trim();
			for (PolicyAlterStatusEnumType policyAlterStatusEnumType : values()) {
				if (code.equals(policyAlterStatusEnumType.getCode())) {
					return policyAlterStatusEnumType;
				}
			}
			return null;
		}
		
	}
}
