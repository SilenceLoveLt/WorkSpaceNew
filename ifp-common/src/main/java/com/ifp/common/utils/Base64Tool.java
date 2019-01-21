package com.ifp.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Base64Tool {
	/**
	 * 文件转换为Base64
	 * @param filePath
	 * @return
	 */
	public static String encode(String filePath) {
		File file = new File(filePath);
		int len = 0;
		byte[] bt = new byte[1024];
		if (file.exists() && file.isFile()) {
			try {
				FileInputStream in = new FileInputStream(file);
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				while ((len = in.read(bt)) != -1) {
					out.write(bt, 0, len);
				}
				in.close();
				out.close();
				return encode(out.toByteArray());
			} catch (FileNotFoundException e) {
				return null;
			} catch (IOException e) {
				return null;
			}
		}
		return null;
	}
	public static String encode(String strSrc,String encode){
		String strOut="";
		try {
			strOut=new String(Base64Encoder.encode(strSrc.getBytes(encode)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strOut;
	}
	public static String encode(byte[] bytes){
		String strOut="";
		try {
			strOut=new String(Base64Encoder.encode(bytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strOut;
	}
	public static String decode(String strSrc,String encode){
		String strOut="";
		try {
			 strOut = new String(Base64Decoder.decodeToBytes(strSrc),encode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strOut;
	}
	public static byte[] decode(String strSrc){
		byte[] bytes;
		bytes = Base64Decoder.decodeToBytes(strSrc);
		return bytes;
	}

	public static void main(String [] args){
	    System.out.println(encode("/media/jackphang/500G/temp/微信图片_20180622172141.jpg"));
	}
}
