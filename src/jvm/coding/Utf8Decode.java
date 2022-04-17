/*
* @文 件 名:  Utf8Decode.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月27日 上午10:20:17 
*/
package jvm.coding;

import java.nio.charset.Charset;

/**   
 * @文 件 名:  Utf8Decode.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月27日 上午10:20:17 
 */
public class Utf8Decode {
	
	public void decode(String str) {
		
		byte[] bb = str.getBytes(Charset.forName("utf8"));
		
		for(byte tmp:bb) {
			
			System.out.print(tmp + " " );
		}
		
		byte b1 = bb[0];
		b1 = 127;

		System.out.println("*****************************");
		System.out.println(b1 );
		System.out.println(b1%16);
		System.out.println(b1/16);
		System.out.println(b1 >> 4);
		System.out.println(   "0xf ");
		System.out.println(  b1 & 0xf);
		System.out.println(   "0x0f ");
		System.out.println(b1 & 0x0f);
		System.out.println(   "0x00f ");
		System.out.println(b1 & 0x00f);
		System.out.println(   "0x000f ");
		System.out.println(b1 & 0x000f);
		System.out.println(   "0xf0 ");
		System.out.println(b1 & 0xf0);
		System.out.println(   "0xf00 ");
		System.out.println(b1 & 0xf00);
		System.out.println(   "0xf000 ");
		System.out.println(b1 & 0xf000);
		System.out.println(   "0x0000f ");
		System.out.println(b1 & 0x0000f);
		//96 15
	}
	
	
}
