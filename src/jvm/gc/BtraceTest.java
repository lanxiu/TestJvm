/*
* @文 件 名:  BtraceTest.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月23日 上午10:01:15 
*/
package jvm.gc;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**   
 * @文 件 名:  BtraceTest.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月23日 上午10:01:15 
 */
public class BtraceTest {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) throws IOException {
		BtraceTest test = new BtraceTest();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i< 10; i ++) {
			
			reader.readLine();
			int a= (int) Math.round(Math.random() * 1000);
			int b= (int) Math.round(Math.random() * 1000);
			
			System.out.println(test.add(a, b));
		}
	}
}
