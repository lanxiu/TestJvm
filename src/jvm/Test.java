/*
* @文 件 名:  Test.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年10月9日 上午10:53:14 
*/
package jvm;

import java.math.BigInteger;

/**   
 * @文 件 名:  Test.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年10月9日 上午10:53:14 
 */
public class Test {
	
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("7388744187474964710948864");
		byte[] b =bi.toByteArray();
		System.out.println(	bi.testBit(40));
		System.out.println(	bi.bitCount());
		System.out.println(	bi.bitLength());

		bi.setBit(40);
		bi.setBit(1);
//		double n = 7388744187474964710948864;
 		 for(int i = 	bi.bitLength();i >= 0; i--) {
 			 if(bi.testBit(i))
 				 System.out.print(1);
 			 else 
 				 System.out.print(0);
 		 }

 		System.out.println(bi.testBit(81));
 		System.out.println(bi );
 		System.out.println(bi.setBit(86).setBit(87) );
 		System.out.println(bi.setBit(84) );
 		System.out.println("7388744187474964710948864");
		
	}
	
}
