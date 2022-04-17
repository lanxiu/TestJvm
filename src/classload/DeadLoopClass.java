/*
* @文 件 名:  DeadLoopClass.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月23日 上午10:31:13 
*/
package classload;


/**   
 * @文 件 名:  DeadLoopClass.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月23日 上午10:31:13 
 */
public class DeadLoopClass {
	
	static {
		if (true) {
			System.out.println(Thread.currentThread() + "  init DeadLoopClass");
		}
	}
	
	
	static class DeadLoopClass2 {
		
		static {
			if (true) {
				System.out.println(Thread.currentThread() + "  init DeadLoopClass2");
				while (true) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Runnable script = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + " start ");
				DeadLoopClass2 dlc = new DeadLoopClass2();
				System.out.println(Thread.currentThread() + " run over ");
			}
		};

		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
