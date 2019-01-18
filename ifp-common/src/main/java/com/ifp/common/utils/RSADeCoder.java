package com.ifp.common.utils;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public abstract class RSADeCoder{
	public static final String KEY_ALGORITHM = "RSA";
	public static final String KEY_PROVIDER = "BC";
	public static final String SIGNATURE_ALGORITHM = "SHA1WithRSA";
	 
	
	/**
	 * 公钥解密
	 * */
	public static byte[] decryptRSA(byte[] encoderData,PublicKey publicKey) throws Exception {
		Cipher cipher = Cipher.getInstance(KEY_ALGORITHM, KEY_PROVIDER);
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		int blockSize = cipher.getBlockSize();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		int j = 0;
		while (encoderData.length - j * blockSize > 0) {
		    bout.write(cipher.doFinal(encoderData, j * blockSize, blockSize));
		    j++;
		}
		return bout.toByteArray();
	}
	
	/**
	 * 校验数字签名
	 * */
	public static boolean verify (byte[] encoderData,String sign,PublicKey publicKey) throws Exception {
		
		Signature sig = Signature.getInstance(SIGNATURE_ALGORITHM,KEY_PROVIDER);
		sig.initVerify(publicKey);
		sig.update(encoderData);
		return sig.verify(Base64.decodeBase64(sign.getBytes()));
	}
	
	/** 
	 * 使用模和指数生成RSA公钥 
	 * @param modulus  �? 
	 * @param exponent  指数 
	 * @return 
	 */  
	public static PublicKey getPublicKey(String modulus, String exponent) throws Exception {  
	        BigInteger b1 = new BigInteger(modulus);  
	        BigInteger b2 = new BigInteger(exponent);  
	        Security.addProvider(new BouncyCastleProvider());
	        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM, KEY_PROVIDER);
	        RSAPublicKeySpec keySpec = new RSAPublicKeySpec(b1, b2);  
	        return (RSAPublicKey) keyFactory.generatePublic(keySpec);  
	}
	

}