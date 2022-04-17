/*
* @文 件 名:  SuperClas.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年12月27日 上午10:09:31 
*/
package classload;


/**   
 * @文 件 名:  SuperClas.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年12月27日 上午10:09:31 
 */
public class SuperClass {
	
	static {
		System.out.println("Super Class init");
	}

//	public static int value11 =123;
	public static int value =123;
	
	public static final int FINAL_VALUE=345;
	
	
}
