/*
* @文 件 名:  TestPretenureSize.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月6日 下午7:27:10 
*/
package jvm.gc;


/**   
 * @文 件 名:  TestPretenureSize.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  大对象直接进入老年代
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月6日 下午7:27:10 
 */
public class TestPretenureSize {
	
	private static final int _1MB = 1024 * 1024;
	
	/**
    "F:\Program Files (x86)\Java\jdk1.6.0_13\bin\java" -XX:PretenureSizeThreshold=3145728 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8  -XX:+PrintGCDetails  jvm/gc/TestPretenureSize
	 
    java -XX:PretenureSizeThreshold=3145728 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8  -XX:+PrintGCDetails  jvm/gc/TestPretenureSize
	 
	 */
	
	public static void testPretenureSizeThreshold() {
		byte[] allocation1;
		allocation1 = new byte[4 * _1MB];
	}
	
	public static void main(String[] args) {
		TestPretenureSize.testPretenureSizeThreshold();
	}
}
