/*
* @文 件 名:  TestCoding.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月27日 上午10:24:41 
*/
package test.coding;

import org.junit.Test;

import jvm.coding.Utf8Decode;

/**   
 * @文 件 名:  TestCoding.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月27日 上午10:24:41 
 */

public class TestCoding {
	
	@Test
	public void testCoding() {
		Utf8Decode decode = new Utf8Decode();
		decode.decode("org/fenixsoft/clazz/TestClass");
		
	}
}
