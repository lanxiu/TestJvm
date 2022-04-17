/*
 * @文 件 名: WaitThread.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述: (用一句话描述该文件做什么)
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2018年11月22日 上午9:47:27
 */
package jvm.gc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @文 件 名: WaitThread.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述:
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2018年11月22日 上午9:47:27
 */
public class WaitThread {
	
	/**
	 * 功能简述: 线程锁死循环
	 * 
	 * @author 0216000799
	 * @version 1.0
	 * @since 1.0
	 */
	public static void createBusyThread() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true)
					;
			}
		}, "testBusyThread");
		thread.start();
	}
	
	/**
	 * 功能简述: 线程锁等待演示
	 * 
	 * @author 0216000799
	 * @version 1.0
	 * @since 1.0
	 * @param lock
	 */
	public static void createLockThread(final Object lock) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "testLockThread");
		thread.start();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		createLockThread(new Object());
	}
}
