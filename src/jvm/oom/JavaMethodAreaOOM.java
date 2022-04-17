/*
* @文 件 名:  JavaMethodAreaOOM.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年9月30日 下午3:57:44 
*/
package jvm.oom;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**   
 * @文 件 名:  JavaMethodAreaOOM.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  测试方法区溢出
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年9月30日 下午3:57:44 
 */
public class JavaMethodAreaOOM {
	
	/**
	-Xms20m -Xmx20m -Xss3m -XX:PermSize=3M  -XX:MaxPermSize=3M  -XX:+HeapDumpOnOutOfMemoryError
	*/
	public static void main(String[] args) {
		
		while(true) {
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(
					new MethodInterceptor() {
						
						@Override
						public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
							// TODO Auto-generated method stub
							return proxy.invokeSuper(obj, args);
						}
					}
			);
			
			enhancer.create();
		}
		
		
	}
	
	static class OOMObject{
		
	}
	
}
