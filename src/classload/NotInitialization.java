/*
* @文 件 名:  NotInitialization.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年12月27日 上午10:11:58 
*/
package classload;


/**   
 * @文 件 名:  NotInitialization.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年12月27日 上午10:11:58 
 */
public class NotInitialization {
	
	/**   
	 * 功能简述:  
	 * @author  0216000799
	 * @version  1.0
	 * @since 1.0
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		SuperClass sc[] = new SuperClass[10];
		
		System.out.println(sc.getClass().getName());
		
		System.out.println(SuperClass.class.getName());
//		System.out.println(SubClass.value);
	}
}
