package com.ifp.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * wxy
 * 2013-4-9
 * 功能说明：对model设置
 * @param queryFilters
 * @throws IOException
 * 修改历史
 */
public class SetUserBean {
	 /**
       * 获取利用反射获取类里面的值和名称
       *
       * @param obj
       * @return
       * @throws IllegalAccessException
       */
      public static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
          Map<String, Object> map = new HashMap<>();
          Class<?> clazz = obj.getClass();
          System.out.println(clazz);
          for (Field field : clazz.getDeclaredFields()) {
              field.setAccessible(true);
              String fieldName = field.getName();
              Object value = field.get(obj);
              map.put(fieldName, value);
          }
          return map;
      }
	 
	public static void  setFormBean(Object bean,String key,Object value) {
		Class c = bean.getClass();
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			String name = ms[i].getName();
			if (name.startsWith("set")) {
				Class[] cc = ms[i].getParameterTypes();
				if (cc.length == 1) {
					String type = cc[0].getName(); // parameter type
					try {
						// get property name:
						String prop = Character.toLowerCase(name.charAt(3))+ name.substring(4);
						Object param = value;
						//System.out.println("param:"+param);
						//System.out.println("key:"+key.toLowerCase() +" prop:"+prop.toLowerCase());
						if(key.toLowerCase().equals(prop.toLowerCase()))
						{
							if (param != null && !param.equals("")) {
								// ms.setAccessible(true);
								if (type.equals("java.lang.String")) {
									ms[i].invoke(bean, new Object[] { param });
								} else if (type.equals("int") || type.equals("java.lang.Integer")) {
									ms[i].invoke(bean, new Object[] { new Integer((Integer)param) });
								} else if (type.equals("long") || type.equals("java.lang.Long")) {
									ms[i].invoke(bean, new Object[] { new Long((Long)param) });
								} else if (type.equals("boolean") || type.equals("java.lang.Boolean")) {
									ms[i].invoke(bean, new Object[] { Boolean.valueOf((Boolean)param) });
								} else if (type.equals("java.util.Date")) {
									ms[i].invoke(bean, new Object[] { (Date)param });
								}else{
									ms[i].invoke(bean, new Object[] { param });
								}
							}
							break;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}

}
