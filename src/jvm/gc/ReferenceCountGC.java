/*
* @文 件 名:  ReferenceCountGC.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年9月30日 下午4:20:12 
*/
package jvm.gc;


/**   
 * @文 件 名:  ReferenceCountGC.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  测试引用和垃圾回收
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年9月30日 下午4:20:12 
 */
public class ReferenceCountGC {
	
	public Object instance = null;
	
	private static final int _1MB = 1024* 1024;
	
	private byte[] bigSize = new byte[_1MB];
	
	public static void main(String[] args) {
		ReferenceCountGC r1 = new ReferenceCountGC();
		ReferenceCountGC r2 = new ReferenceCountGC();
		r1.instance = r2;
		r2.instance = r1;
		
		r1=null;
		r2 = null;
		System.gc();
		
		
	}
	
	
}
