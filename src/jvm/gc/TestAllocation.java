/*
* @文 件 名:  TestAllocation.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月6日 下午6:41:03 
*/
package jvm.gc;


/**   
 * @文 件 名:  TestAllocation.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  新生代 MinorGC
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月6日 下午6:41:03 
 */
public class TestAllocation {
	
	
	private static final int _1MB = 1024*1024;
	

	
	/**
	 * VM PARA:   "F:\Program Files (x86)\Java\jdk1.6.0_13\bin\java" -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8  -XX:+PrintGCDetails  jvm/gc/TestAllocation
	 */
	
	public static void testAloocation() {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1  = new byte[2*_1MB];
		allocation2  = new byte[2*_1MB];
		allocation3  = new byte[2*_1MB];
		allocation1 = null;
		allocation4  = new byte[4*_1MB];
		
		
	}
	
	
public static void main(String[] args) {
	TestAllocation.testAloocation();
}
	
}
