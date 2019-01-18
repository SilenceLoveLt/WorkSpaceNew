package com.ifp.common.constant;

public class Constant {
	public static final String DEFAULT_CHANNELID = "*";
	public static final String SIGN = "sign";
	public static final String COMID = "comId";
	/**
	 * 
	 */
	public static final String SYSTEM = "SYSTEM";
	/**
	 * 
	 */
	public static final String IFP_AI_SIGN_KEY = "N2APPINTERFACE2018#@!%99";
	/**
	 * 
	 */
	public static final String IFP_AI_COM_ID = "N2O2O20180912";

	/**
	 * 
	 */
	public static final String SYS_CONSTANT_0 = "0";
	/**
	 * 
	 */
	public static final String SYS_CONSTANT_1 = "1";
	/**
	 *
	 */
	public static final String SYS_CONSTANT_2 = "2";
	/**
	 * 
	 */
	public static final String SYS_CONSTANT_3 = "3";
	/**
	 * 
	 */
	public static final String SYS_CONSTANT_ERR = "-1";

	public static final String CHARACTERENCODING_GBK = "GBK";
	public static final String CHARACTERENCODING_UTF8 = "UTF-8";

	/***/
	public static final String DATA = "data";

	/***/
	public static final String RESULT_DATA = "RESULT_DATA";

	public static final String INTERFACE_MESSAGE_PACKAGE = "packages";
	public static final String INTERFACE_MESSAGE_HEADER = "header";
	public static final String INTERFACE_MESSAGE_REQUEST = "request";
	public static final String INTERFACE_MESSAGE_RESPONSE = "response";
	public static final String INTERFACE_SYSTEM_NAME_APP = "BJLAPP-A";
	public static final String INTERFACE_SYSTEM_NAME_ARISK = "iwechat1";
	public static final String INTERFACE_SYSTEM_NAME_BYGENERATION = "iwechat2";
	public static final String INTERFACE_MESSAGE_HEADER_RESPONSE_CODE = "responseCode";
	public static final String INTERFACE_MESSAGE_HEADER_ERROR_MESSAGE = "errorMessage";
	public static final String INTERFACE_MESSAGE_HEADER_TOKENCODE = "tokenCode";
	public static final String INTERFACE_MESSAGE_HEADER_SKIPAUTH = "skipAuth";
	public static final String RESPONSE_ERROR_KEY_CODE1000 = "1000";
	public static final String RESPONSE_ERROR_KEY_CODE1001 = "1001";
	public static final String RESPONSE_ERROR_KEY_CODE1900 = "1900";
	public static final String RESPONSE_ERROR_KEY_TOKENINVALID = "TOKENINVALID";
	public static final String RESPONSE_ERROR_KEY_ERROR = "ERROR";
	public static final String RESPONSE_SUCCESS_KEY = "SUCCESS";
	public static final String RESPONSE_FAIL_KEY = "FAIL";

	public static final String CODECONVERT_HEARD_REQUESTTYPE = "requestType";

	public static final String SYS_ENV_DEV = "DEV";
	public static final String SYS_ENV_UAT = "UAT";
	public static final String SYS_ENV_PRE = "PRE";
	public static final String SYS_ENV_PRO = "PRO";
	public static final String SYS_ENV = "SYS_ENV";
	public static final String SYS_ENV_SYSTEMID_SYS = "SYS";

	/* APP端角色定义码表 */
	public static final String MEMBER_APP_ROLE_AGENT = "APP_AGENT_ROLE";// 终端代理人角色
	public static final String MEMBER_APP_ROLE_MEMBER = "APP_MEMBER_ROLE";// 终端普通会员角色

	/* 终端设备参数常量 */
	public static final String CLIENT_REQUEST_PARAM_DEVICENO = "deviceno";
	public static final String CLIENT_REQUEST_PARAM_TOKENCODE = "tokencode";
	public static final String CLIENT_REQUEST_PARAM_LOGINCODE = "logincode";
	public static final String CLIENT_REQUEST_PARAM_LOGINMEMBERINFO = "loginmemberinfo";

	/* 服务工程名称，REDIS中KEY需要引用 */
	public static final String SERVICE_KEY_AUTHSERVICE = "AUTHSERVICE";
	public static final String SERVICE_KEY_MEMBERSERVICE = "MEMBERSERVICE";

	/* 模板类别 */
	public static final String TEMPLATE_KEY_SMS = "SMSTEMPLATE";
	public static final String TEMPLATE_KEY_EMAIL = "EMAILTEMPLATE";
    
    /*
     * 直播常量配置key 
     */
    public static final String LIVE_COMPANY = "LIVE_COMPANY"; //厂商KEY
    public static final String LIVE_APPKEY = "LIVE_APPKEY";
    public static final String LIVE_APPSECRET = "LIVE_APPSECRET";
    /**
     * 创建频道
     */
    public static final String LIVE_CHANNEL_CREATE_URL = "LIVE_CHANNEL_CREATE_URL";
    /**
     * 修改频道
     */
    public static final String LIVE_CHANNEL_UPDATE_URL = "LIVE_CHANNEL_UPDATE_URL";
    /**
     * 删除频道
     */
    public static final String LIVE_CHANNEL_DELETE_URL = "LIVE_CHANNEL_DELETE_URL";
    /**
     * 获取频道状态
     */
    public static final String LIVE_CHANNEL_STATUS_URL = "LIVE_CHANNEL_STATUS_URL";
    /**
     * 获取频道列表
     */
    public static final String LIVE_CHANNEL_LIST_URL = "LIVE_CHANNEL_LIST_URL";
    /**
     * 重新获取推流地址
     */
    public static final String LIVE_CHANNEL_ADDRESS_URL = "LIVE_CHANNEL_ADDRESS_URL";
    /**
     * 设置频道为录制状态
     */
    public static final String LIVE_CHANNEL_SET_ALWAYS_RECORD_URL = "LIVE_CHANNEL_SET_ALWAYS_RECORD_URL";
    /**
     * 禁用频道
     */
    public static final String LIVE_CHANNEL_PAUSE_URL = "LIVE_CHANNEL_PAUSE_URL";
    /**
     * 批量禁用频道
     */
    public static final String LIVE_CHANNEL_LIST_PAUSE_URL = "LIVE_CHANNEL_LIST_PAUSE_URL";
    /**
     * 恢复频道
     */
    public static final String LIVE_CHANNEL_RESUME_URL = "LIVE_CHANNEL_RESUME_URL";
    /**
     * 批量恢复频道
     */
    public static final String LIVE_CHANNEL_LIST_RESUME_URL = "LIVE_CHANNEL_LIST_RESUME_URL";
    /**
     * 获取录制视频文件列表
     */
    public static final String LIVE_VIDEO_LIST_URL = "LIVE_VIDEO_LIST_URL";
    /**
     * 获取某一时间范围的录制视频文件列表
     */
    public static final String LIVE_VOD_VIDEO_LIST_URL = "LIVE_VOD_VIDEO_LIST_URL";
    /**
     * 设置视频录制回调地址
     */
    public static final String LIVE_RECORDL_SET_CALLBACK_URL = "LIVE_RECORDL_SET_CALLBACK_URL";
    /**
     * 设置回调的加签秘钥
     */
    public static final String LIVE_CALLBACK_SET_SIGN_KEY_URL = "LIVE_CALLBACK_SET_SIGN_KEY_URL";
    /**
     * 录制文件合并
     */
    public static final String LIVE_VIDEO_MERGE_URL = "LIVE_VIDEO_MERGE_URL";
    /**
     * 录制重置
     */
    public static final String LIVE_CHANNEL_RESET_RECORD_URL = "LIVE_CHANNEL_RESET_RECORD_URL";
    /**
     * 直播实时转码地址
     */
    public static final String LIVE_TRANSCODE_ADDRESS_URL = "LIVE_TRANSCODE_ADDRESS_URL";
    /**
     * 视频录制回调地址查询
     */
    public static final String LIVE_RECORD_CALLBACK_QUERY_URL = "LIVE_RECORD_CALLBACK_QUERY_URL";
    /**
     * 设置录制信息
     */
    public static final String LIVE_SETUP_RECORD_INFO_URL = "LIVE_SETUP_RECORD_INFO_URL";
    
	/*
	 * IM相关常量KEY
	 */
	public static final String IM_COMPANY = "IM_COMPANY";// 厂商KEY
	public static final String IM_APPKEY = "IM_APPKEY";
	public static final String IM_APPSECRET = "IM_APPSECRET";
	/**
	 * @Fields IM_ACCOUNTIMPORT_URL : im导入账户请求地址
	 */
	public static final String IM_ACCOUNTIMPORT_URL = "IM_ACCOUNTIMPORT_URL";
	/**
	 * @Fields IM_ACCOUNTSETINFO_URL : IM设置账户名片请求地址
	 */
	public static final String IM_ACCOUNTSETINFO_URL = "IM_ACCOUNTSETINFO_URL";
	/**
	 * @Fields IM_ACCOUNTFRIEND_ADD_URL : 加好友
	 */
	public static final String IM_ACCOUNTFRIEND_ADD_URL = "IM_ACCOUNTFRIEND_ADD_URL";
	/**
	 * @Fields IM_ACCOUNTFRIEND_UPDATE_URL : 更新好友相关信息
	 */
	public static final String IM_ACCOUNTFRIEND_UPDATE_URL = "IM_ACCOUNTFRIEND_UPDATE_URL";
	/**
	 * @Fields IM_ACCOUNTFRIEND_DELETE_URL : 删除好友
	 */
	public static final String IM_ACCOUNTFRIEND_DELETE_URL = "IM_ACCOUNTFRIEND_DELETE_URL";
	/**
	 * @Fields IM_ACCOUNTFRIEND_GET_URL : 获取好友关系
	 */
	public static final String IM_ACCOUNTFRIEND_GET_URL = "IM_ACCOUNTFRIEND_GET_URL";
	/**
	 * @Fields IM_ACCOUNT_SENDMSG_URL : 发送普通消息
	 */
	public static final String IM_ACCOUNT_SENDMSG_URL = "IM_ACCOUNT_SENDMSG_URL";
	/**
	 * @Fields IM_ACCOUNT_SENDBATCHMSG_URL : 批量发送点对点普通消息
	 */
	public static final String IM_ACCOUNT_SENDBATCHMSG_URL = "IM_ACCOUNT_SENDBATCHMSG_URL";
	/**
	 * @Fields IM_TEAM_CREATE_URL : 创建群
	 */
	public static final String IM_TEAM_CREATE_URL = "IM_TEAM_CREATE_URL";
	/**
	 * @Fields IM_TEAM_ADD_URL : 拉人入群
	 */
	public static final String IM_TEAM_ADD_URL = "IM_TEAM_ADD_URL";
	/**
	 * @Fields IM_TEAM_KICK_URL : 踢人出群
	 */
	public static final String IM_TEAM_KICK_URL = "IM_TEAM_KICK_URL";
	/**
	 * @Fields IM_TEAM_REMOVE_URL : 解散群
	 */
	public static final String IM_TEAM_REMOVE_URL = "IM_TEAM_REMOVE_URL";
	/**
	 * @Fields IM_TEAM_UPDATE_URL : 编辑群资料
	 */
	public static final String IM_TEAM_UPDATE_URL = "IM_TEAM_UPDATE_URL";
	/**
	 * @Fields IM_TEAM_QUERY_URL : 群信息与成员列表查询
	 */
	public static final String IM_TEAM_QUERY_URL = "IM_TEAM_QUERY_URL";
	/**
	 * @Fields IM_TEAM_DETAIL_URL : 获取群组详细信息
	 */
	public static final String IM_TEAM_DETAIL_URL = "IM_TEAM_DETAIL_URL";
	/**
	 * @Fields IM_TEAM_CHANGEOWNER_URL : 移交群主
	 */
	public static final String IM_TEAM_CHANGEOWNER_URL = "IM_TEAM_CHANGEOWNER_URL";
	/**
	 * @Fields IM_TEAM_ADDMANAGER_URL : 任命管理员
	 */
	public static final String IM_TEAM_ADDMANAGER_URL = "IM_TEAM_ADDMANAGER_URL";
	/**
	 * @Fields IM_TEAM_REMOVEMANAGER_URL : 移除管理员
	 */
	public static final String IM_TEAM_REMOVEMANAGER_URL = "IM_TEAM_REMOVEMANAGER_URL";
	/**
	 * @Fields IM_TEAM_JOINTEAMS_URL : 获取某用户所加入的群信息
	 */
	public static final String IM_TEAM_JOINTEAMS_URL = "IM_TEAM_JOINTEAMS_URL";
	/**
	 * @Fields IM_TEAM_UPDATETEAMNICK_URL : 修改群昵称
	 */
	public static final String IM_TEAM_UPDATETEAMNICK_URL = "IM_TEAM_UPDATETEAMNICK_URL";
	/**
	 * @Fields IM_ACCOUNT_MSGHISTORY_URL : 单聊云端历史消息查询
	 */
	public static final String IM_ACCOUNT_MSGHISTORY_URL = "IM_ACCOUNT_MSGHISTORY_URL";
	/**
	 * @Fields IM_TEAM_MSGHISTORY_URL : 群聊云端历史消息查询
	 */
	public static final String IM_TEAM_MSGHISTORY_URL = "IM_TEAM_MSGHISTORY_URL";

	/*
	 * 消息推送相关常量KEY
	 */
	public static final String PUSH_COMPANY = "PUSH_COMPANY";// 厂商KEY
	public static final String PUSH_APPKEY = "IM_APPKEY";
	public static final String PUSH_APPSECRET = "IM_APPSECRET";
	/**
	 * @Fields IM_ACCOUNTIMPORT_URL : im导入账户请求地址
	 */
	public static final String PUSH_SENDPUSH_MSG_URL = "PUSH_SENDPUSH_MSG_URL";

	/**
	 * .保单和订单状态：0已删除，10已提交，20核保中，21核保成功，22核保失败，23待人核，24人核失败，25人核成功，30支付中，31支付成功，
	 * 32支付失败，40承保中，41承保成功，42承保失败，50撤单中，51撤单成功，52撤单失败，60退保中，61退保成功， 62退保失败
	 */
	public static final String POLICYORDER_STATUS_0 = "0";
	/**
	 * 10-已提交
	 */
	public static final String POLICYORDER_STATUS_10 = "10";
	/**
	 * 20-核保中
	 */
	public static final String POLICYORDER_STATUS_20 = "20";
	/**
	 * 21-核保成功
	 */
	public static final String POLICYORDER_STATUS_21 = "21";
	/**
	 * 22-核保失败
	 */
	public static final String POLICYORDER_STATUS_22 = "22";
	/**
	 * 23-待人工核保
	 */
	public static final String POLICYORDER_STATUS_23 = "23";
	/**
	 * 24-人工核保失败
	 */
	public static final String POLICYORDER_STATUS_24 = "24";
	/**
	 * 25-人工核保成功
	 */
	public static final String POLICYORDER_STATUS_25 = "25";
	/**
	 * 25-人工核保中(正在请求人工核保)
	 */
	public static final String POLICYORDER_STATUS_26 = "26";
	/**
	 * 30-支付中
	 */
	public static final String POLICYORDER_STATUS_30 = "30";
	/**
	 * 31-支付成功
	 */
	public static final String POLICYORDER_STATUS_31 = "31";
	/**
	 * 32-支付失败
	 */
	public static final String POLICYORDER_STATUS_32 = "32";
	/**
	 * 40-承保中
	 */
	public static final String POLICYORDER_STATUS_40 = "40";
	/**
	 * 41-承保成功
	 */
	public static final String POLICYORDER_STATUS_41 = "41";
	/**
	 * 42-承保失败
	 */
	public static final String POLICYORDER_STATUS_42 = "42";
	/**
	 * 50-撤单中
	 */
	public static final String POLICYORDER_STATUS_50 = "50";
	/**
	 * 51-撤单成功
	 */
	public static final String POLICYORDER_STATUS_51 = "51";
	/**
	 * 52-撤单失败
	 */
	public static final String POLICYORDER_STATUS_52 = "52";
	/**
	 * 60-退保中
	 */
	public static final String POLICYORDER_STATUS_60 = "60";
	/**
	 * 61-退保成功
	 */
	public static final String POLICYORDER_STATUS_61 = "61";
	/**
	 * 62-退保失败
	 */
	public static final String POLICYORDER_STATUS_62 = "62";
	
}
