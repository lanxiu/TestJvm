/*
* @文 件 名:  MonitoringTest.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月20日 下午3:50:45 
*/
package jvm.gc;

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.Main;

/**   
 * @文 件 名:  MonitoringTest.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月20日 下午3:50:45 
 */


//   java -verbose:gc -Xms100M -Xmx100M   -XX:+UseSerialGC   jvm/gc/MonitoringTest
public class MonitoringTest {

	static class OOMObject {
		public byte[] placeholder = new byte[64*1024];
	}

	public static void fillHeap(int num) throws InterruptedException {
		
		List<OOMObject> list = new ArrayList<MonitoringTest.OOMObject>();
		int i= 0;
		while(i< 1000) {
			Thread.sleep(50);
			list.add(new OOMObject());
			i++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}
}
