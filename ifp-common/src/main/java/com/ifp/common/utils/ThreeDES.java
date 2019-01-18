package com.ifp.common.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import com.ifp.common.utils.Base64Tool;

import net.sf.json.JSONObject;

/**
 * java�?3DES加解�? 加密选项：DESede/ECB/PKCS5Padding
 * 
 * @author mac
 *
 */
public class ThreeDES {

	/**
	 * 将数据使�?3EDS算法加密，加密后使用Base64编码
	 * 
	 * @param message
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encode(String message, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		String result = Base64Tool.encode(cipher.doFinal(message.getBytes("UTF-8")));
		return result;
	}

	/**
	 * 将数据使�?3EDS算法加密，加密后使用Base64编码
	 * 
	 * @param message
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encode(byte[] bytes, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		String result = Base64Tool.encode(cipher.doFinal(bytes));
		return result;
	}

	/**
	 * 将数据使�?3EDS算法解密，解密前的数据为Base64编码
	 * 
	 * @param message
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decode(String desStr, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] bytes = Base64Tool.decode(desStr);
		byte[] decodeBytes = cipher.doFinal(bytes);
		String result = new String(decodeBytes, "UTF-8");
		return result;
	}

	/**
	 * 将数据使�?3EDS算法解密，解密前的数据为Base64编码
	 * 
	 * @param message
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decode(byte[] bytes, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decodeBytes = cipher.doFinal(bytes);

		String result = new String(decodeBytes, "UTF-8");
		return result;
	}
	
	public static byte[] decodeReturnBytes(byte[] bytes, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decodeBytes = cipher.doFinal(bytes);

		return decodeBytes;
	}

	public static byte[] decodeByte(String desStr, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] bytes = Base64Tool.decode(desStr);
		byte[] decodeBytes = cipher.doFinal(bytes);
		return decodeBytes;
	}
	/**
	 * 将数据使�?3EDS算法解密，解密前的数据为Base64编码
	 * 
	 * @param message
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decodeToBytes(byte[] bytes, String key) throws Exception {
		String algorithm = "DESede/ECB/PKCS5Padding";
		Cipher cipher = Cipher.getInstance(algorithm);
		byte[] keybyte = key.getBytes("UTF-8");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(keybyte);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decodeBytes = cipher.doFinal(bytes);
		return decodeBytes;
	}

	public static void main(String[] args) throws Exception {
//		String readFile = FileUtil.readFile("e:/login.txt");
		//String key = "GTO2OINTERFACE2017#@!%88";
		String key = "BJAPPINTERFACE2018#@!%88";
//		String readFile ="{\"policy\":{\"orderId\":\"04dea97293a64487b8092a416c0e607f\",\"mobile\":\"13910587271\",\"functionCode\":\"1\",\"randomStr\":\"\",\"bankAccount\":\"6212260200083424446\"}}";
		//String readFile ="{\"traexaDto\":{\"cusMember\":{\"memberId\":\"69dc716a3eb0495da4ff7e7fa170f512\",\"infoId\":\"b6bba150e7394cf1ad27cefb6d39aa3a\",\"userName\":\"18612905089\",\"isSign\":\"1\",\"enabledFlag\":\"1\"},\"page\":{\"pageNo\":\"1\",\"pageSize\":\"3\",\"pageCount\":null,\"pages\":null}}}";
		//String desStr = ThreeDES.encode(message, key);
		//System.out.println();ThreeDES.decode(desStr, key);
		/*String readFile ="{\"user\": {"+
//		String desStr = ThreeDES.encode(readFile, key);
//		System.out.println(ThreeDES.decode(desStr, key));
//		System.out.println(desStr);
		/*String readFile ="{\"productDef\": {"+
				"\"deviceNo\": \"4FDSAFERWQR13432\","+
				"\"loginCode\": \"0100001027\","+
				"\"loginPwd\": \"a123456\","+
				"\"channel\": \"01\","+
				"\"token\": \"\","+
				"\"openId\": \"wxy841030awwihyq\","+
				"\"agentChannel\": \"1\","+
				"\"random\": \"1000001\","+
				"\"loginType\": \"extraExtCheck\","+
				"\"customList\": {"+
					"\"custom\": ["+
					      "{"+
						      "\"key\": \"No2\","+
						      "\"value\": \"a\""+
					      "},"+
					      "{"+
					    	  "\"key\": \"No1\","+
					    	  "\"value\":\"b\""+
					      "}"+
					    "]"+
				  "}"+
        	"}}";*/

		/*String message2 = ThreeDES.encode(readFile, key);
		message2 = message2.replace("\n", "");
		System.out.println(message2);*/
		//String jsonStr=message2;
		//JSONObject jsonOb = JSONObject.fromObject(jsonStr);
		/*String temp=ThreeDES.decode("1qrkIlVjTmBM3vj87fyS2i0/TOktSIERzQM8+Hjwn81pWPGeC4XPuu0xQiMM109CO8yEm8YDs/48MXB/XtowHoKNnOumO+Vr+qf5xWz4qLDehvKQ3nTXEMbJGW/K/hM0ca1nB3N/wHpdzJgZbdwQggQ7JAvcr0tesOB2kZ6CvRJOH7+bewuB3LahpKHJn/YUFzVs5xbxjVgO1JWXnvGBIC+KzgimkjjcG7mzau6bS1NHDcD7l6KiYQ==", key);
		temp=temp.replaceAll("wxy841030fdsfadsafdsa", "wxy841030awwihyq");
		String message2 = ThreeDES.encode(temp, key);
		message2 = message2.replace("\n", "");
		System.out.println(message2);
		System.out.println(ThreeDES.decode(readFile, key));*/
		
//		String message2 = ThreeDES.encode(readFile, key);
//		message2 = message2.replace("\n", "");
//		System.out.println(message2);
		
		/*String message2 = ThreeDES.decode("RaDNPaVJPr5ObGiJfqJP9tg9s8FzmLfdP58TTf+U39fYbRpDNUmWJllItcA2+0zVC7rdvorFR6lRvtfh+7jt/xO845HzQit8P3oFnEkwdJHIXe5gcamDgq2eeqn+ZyAwkHgzZMIjXGUKAmeqCbETvD6bnfc141YwBOzfETNmg6x5MAwq2sEGEhc1bOcW8Y1YeDaRGYqWc2wVj+z5oPTnapIT19urKaBbLEZXmbk0TSAZiQ7hg39CcQqwOcAEdZyENYvMcdDQbOkdD1a9QSW+leii3MTvcjiCMosPGx6FikXeFeVhFfsvG19z/jWQB9A/SoB7J2cxhVyk7ouvlYNYZ3bO8shvxZ7SB1K8alaTiHdU6jL8Zis6nukWnBp4BiC4FTUjvuVkZvEEsb05sMBzCiEc43bnoFI6WgvR0wq0iLC67zniD7ry3eO3QCdh3yk9SpdttR7Cne+xyKahlhZCFQPP750efbYOqb1ePMBdgnG7hhTGuLVwer5drjCyhvBLd0YSUD2DwZjnuCcvNzrALryCE8xru1YGvl2uMLKG8Et3RhJQPYPBmAzcDkIX+0R0RnAIr6e9/3MQ8SXJ36Wsj4DavODmKPloMVStBeqcYmSRKuwmTSn284gbqRVMvH9Evl2uMLKG8EsPazfrhWtOgA==", key);
		System.out.println(message2);
		
		message2 = ThreeDES.encode(message2, "JXAPPINTERFACE2018#@!%88");
		message2 = message2.replace("\n", "");
		System.out.println(message2);
		
		String message3 = ThreeDES.decode("cVMiFZ9/vPnAGAAyW4IqvHP753wcoZvzi9FDieNkUqm+33ycwu2FYxHVfleMBEZ4HGN+Fo9v61wNl7FIQArUofEaawIWXKQjO00NEW1XFNa8lCEry/a/FSLYF+GG3zvbkGoI+MwhQ/Wyrj6ZjAN8a++EA2f7DQva22P2snfwnBncV4gTBK+AyVZKn/HW8aW2rL8gaFQvxOVV2Z5gOGPnqam717aEuAgIH6L/qVTeySEENZNSPqdNdKzPy/PyHhSih3rL384HsdygrsJgTLfRTps4f2SxMZ00aQdjYjWLJl02v5HhpEB0AEnCc5Gou+wtxdTdmwPhRIiNUnMe5VUwGoENcGiG5pZM2GwnOBFsurVD+o0mM4ppYEPbRr7JSf8aV6X8V2BVBEbytsETTWE+aCZJKMBTHEa2JwohflmJmFA0mLtfXGX4r5gyXcLCFH7rj0N51f+WpnE=", "JXAPPINTERFACE2018#@!%88");
		System.out.println(message3);*/
		String message2 = ThreeDES.decode("", key);
		System.out.println(message2);
		
	}
	
}