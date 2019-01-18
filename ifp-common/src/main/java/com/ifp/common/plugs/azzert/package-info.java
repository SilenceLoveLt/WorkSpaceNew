/**
 * 断言工具类，提供数据判断的方便方法。
 * 虽然有Spring Assert此类的工具类提供断言功能，但是此类工具类皆是底层架构断言，
 * 无法和"exception"包中定义的“架构/业务”异常兼容（无法抛出业务断言），所以，
 * 系统中需要存在自己的断言方式。
 */
package com.ifp.common.plugs.azzert;