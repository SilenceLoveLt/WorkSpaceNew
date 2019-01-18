package com.ifp.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA1Hash签名工具
 * 
 * @author chengcs
 *
 */
public class SHA1HashUtil {
	/**
	 * ,用SHA1算法生成安全签名
	 * 
	 * @param content
	 *            明文
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String getSHA1(String content, String charset) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// SHA1签名生成
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(content.getBytes(charset));
		byte[] digest = md.digest();
		StringBuffer hexstr = new StringBuffer();
		String shaHex = "";
		for (int i = 0; i < digest.length; i++) {
			shaHex = Integer.toHexString(digest[i] & 0xFF);
			if (shaHex.length() < 2) {
				hexstr.append(0);
			}
			hexstr.append(shaHex);
		}
		return hexstr.toString();
	}
}
