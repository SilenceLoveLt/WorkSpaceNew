package com.ifp.common.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalMac {
	private static final Logger logger = LoggerFactory.getLogger(LocalMac.class);

	private static final Pattern ADDRESS_PATTERN = Pattern.compile("^\\d{1,3}(\\.\\d{1,3}){3}\\:\\d{1,5}$");
	private static final String LOCALHOST = "127.0.0.1";
	private static volatile InetAddress LOCAL_ADDRESS = null;

	/**
	 * @param args
	 * @throws UnknownHostException 
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws UnknownHostException, SocketException {
		//得到IP，输出PC-201309011313/122.206.73.83
		// InetAddress ia = InetAddress.getLocalHost();
		InetAddress ia = getLocalAddress();
		System.out.println(ia);
		getLocalMac(ia);
	}
	public static String getLocalMac(InetAddress ia) throws SocketException {
		// TODO Auto-generated method stub
		//获取网卡，获取地�?
		byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
		System.out.println("mac数组长度�?"+mac.length);
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<mac.length; i++) {
			if(i!=0) {
				sb.append("-");
			}
			//字节转换为整�?
			int temp = mac[i]&0xff;
			String str = Integer.toHexString(temp);
			//System.out.println("�?8�?:"+str);
			if(str.length()==1) {
				sb.append("0"+str);
			}else {
				sb.append(str);
			}
		}
		System.out.println("本机MAC地址:"+sb.toString().toUpperCase());
		return sb.toString().toUpperCase();
	}

	public static String getLocalHost() {
		InetAddress address = getLocalAddress();
		return address == null ? LOCALHOST : address.getHostAddress();
	}

	/**
	 * 遍历本地网卡，返回第�?个合理的IP�?
	 * 
	 * @author chengcs
	 * 
	 * @return 本地网卡IP
	 */
	public static InetAddress getLocalAddress() {
		if (LOCAL_ADDRESS != null)
			return LOCAL_ADDRESS;
		InetAddress localAddress = getLocalAddress0();
		LOCAL_ADDRESS = localAddress;
		return localAddress;
	}

	private static InetAddress getLocalAddress0() {
		InetAddress localAddress = null;
		try {
			localAddress = InetAddress.getLocalHost();
			if (isValidAddress(localAddress)) {
				return localAddress;
			}
		} catch (Throwable e) {
			logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
		}
		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
			if (interfaces != null) {
				while (interfaces.hasMoreElements()) {
					try {
						NetworkInterface network = interfaces.nextElement();
						Enumeration<InetAddress> addresses = network.getInetAddresses();
						if (addresses != null) {
							while (addresses.hasMoreElements()) {
								try {
									InetAddress address = addresses.nextElement();
									if (isValidAddress(address)) {
										return address;
									}
								} catch (Throwable e) {
									logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
								}
							}
						}
					} catch (Throwable e) {
						logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
					}
				}
			}
		} catch (Throwable e) {
			logger.warn("Failed to retriving ip address, " + e.getMessage(), e);
		}
		logger.error("Could not get local host ip address, will use 127.0.0.1 instead.");
		return localAddress;
	}

	public static boolean isValidAddress(String address) {
		return ADDRESS_PATTERN.matcher(address).matches();
	}

	private static final String ANYHOST = "0.0.0.0";
	private static final Pattern IP_PATTERN = Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3,5}$");
	private static boolean isValidAddress(InetAddress address) {
		if (address == null || address.isLoopbackAddress())
			return false;
		String name = address.getHostAddress();
		return (name != null && !ANYHOST.equals(name) && !LOCALHOST.equals(name) && IP_PATTERN.matcher(name).matches());
	}

}
