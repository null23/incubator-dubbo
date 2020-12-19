//package org.apache.dubbo.demo.provider;
//
//public class Wrapper {
//    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
//        org.apache.dubbo.demo.DemoService w;
//        try {
//            w = ((org.apache.dubbo.demo.DemoService) $1);
//        } catch (Throwable e) {
//            throw new IllegalArgumentException(e);
//        }
//        try {
//            if ("sayHello2".equals($2) && $3.length == 1) {
//                return ($w) w.sayHello2((java.lang.String) $4[0]);
//            }
//            if ("sayHello".equals($2) && $3.length == 1) {
//                return ($w) w.sayHello((java.lang.String) $4[0]);
//            }
//        } catch (Throwable e) {
//            throw new java.lang.reflect.InvocationTargetException(e);
//        }
//        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class org.apache.dubbo.demo.DemoService.");
//    }
//}
