package com.ifp.common.utils;

import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;  
import java.io.IOException;  
import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
  
public class ObjectAndByteUtil {  
  
    /** 
     * 对象转数�? 
     * @param obj 
     * @return 
     */  
    public static byte[] toByteArray (Object obj) {     
        byte[] bytes = null;     
        ByteArrayOutputStream bos = new ByteArrayOutputStream();     
        try {       
            ObjectOutputStream oos = new ObjectOutputStream(bos);        
            oos.writeObject(obj);       
            oos.flush();        
            bytes = bos.toByteArray ();     
            oos.close();        
            bos.close();       
        } catch (IOException ex) {      
        	if(bos!=null){
        		try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
            ex.printStackTrace();  
        }     
        return bytes;   
    }  
      
    /** 
     * 数组转对�? 
     * @param bytes 
     * @return 
     */  
    public static Object toObject (byte[] bytes) {     
        Object obj = null;     
        try {       
            ByteArrayInputStream bis = new ByteArrayInputStream (bytes);       
            ObjectInputStream ois = new ObjectInputStream (bis);       
            obj = ois.readObject();     
            ois.close();  
            bis.close();  
        } catch (IOException ex) {       
            ex.printStackTrace();  
        } catch (ClassNotFoundException ex) {       
            ex.printStackTrace();  
        }     
        return obj;   
    }  
}  


