/*
* @文 件 名:  FinalizeEscapceGC.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年10月10日 下午5:15:27 
*/
package jvm.gc;


/**   
 * @文 件 名:  FinalizeEscapceGC.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年10月10日 下午5:15:27 
 */
public class FinalizeEscapceGC {
	
	public static FinalizeEscapceGC SAVE_HOOK = null;
	public void isAlive() {
		System.out.println("yes,i am alive:)");
	}
	protected void  finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed");
		FinalizeEscapceGC.SAVE_HOOK = this;
		
		
	}
	public static void main(String[] args) throws Throwable {
		SAVE_HOOK = new FinalizeEscapceGC();
		SAVE_HOOK =  null;
		System.gc();
		Thread.sleep(500);
		
		if(SAVE_HOOK != null) 
			SAVE_HOOK.isAlive();
		else 
			System.out.println("no ,i am dead :(");
		
		

		SAVE_HOOK =  null;
		System.gc();
		Thread.sleep(500);
		
		if(SAVE_HOOK != null) 
			SAVE_HOOK.isAlive();
		else 
			System.out.println("no ,i am dead :(");
	
		
		
	}
	
	
	
	
	
	
}
