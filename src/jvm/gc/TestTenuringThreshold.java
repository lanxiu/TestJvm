/*
* @文 件 名:  TestTenuringThreshold.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月6日 下午7:33:57 
*/
package jvm.gc;


/**   
 * @文 件 名:  TestTenuringThreshold.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  长期存活对象进入老年代  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月6日 下午7:33:57 
 */
public class TestTenuringThreshold {
	
	private static final int _1MB = 1024 * 1024;
	
	/**
    "F:\Program Files (x86)\Java\jdk1.6.0_13\bin\java" -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8  -XX:+PrintGCDetails -XX:MaxTenuringThreshold=1   jvm/gc/TestTenuringThreshold
    java -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8  -XX:+PrintGCDetails -XX:MaxTenuringThreshold=1   jvm/gc/TestTenuringThreshold
	 */

	public static void testPretenureSizeThreshold() {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[_1MB / 2];
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation3 = new byte[4 * _1MB];
	}
	
	public static void main(String[] args) {
		TestTenuringThreshold.testPretenureSizeThreshold();
	}
}
