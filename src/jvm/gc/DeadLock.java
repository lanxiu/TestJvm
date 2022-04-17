/*
* @文 件 名:  DeadLock.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年11月22日 下午3:28:32 
*/
package jvm.gc;


/**   
 * @文 件 名:  DeadLock.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年11月22日 下午3:28:32 
 */
public class DeadLock implements Runnable {

	int a,b;

	public DeadLock(int a,int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized(Integer.valueOf(a)) {
			synchronized (Integer.valueOf(b)) {
				System.out.println(a+b);
			}
		}
	}

	public static void main(String[] args) {
		int i = 0;
		while( i< 100) {
			i++;
			System.out.println(i);
			new Thread(new DeadLock(1, 2)).start();
			new Thread(new DeadLock(2, 1)).start();
		}
	}
}
