/*
* @文 件 名:  TestClass.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月27日 上午9:13:17 
*/
package org.fenixsoft.clazz;

/**   
 * @文 件 名:  TestClass.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月27日 上午9:13:17 
 */
public class TestClass {
	
	private int m;
	
	public int in2() {
		return m + 1;
	}

	public int inc(int a) {
		int x;
		try {
			x = 1;
			return x;
		} catch (Exception e) {
			x = 2;
			return x;
		} finally {
			x = 3;
		}
		
	}
	
	
	
}
