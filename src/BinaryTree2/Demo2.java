/*
* @文 件 名:  Demo2.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月5日 下午4:50:03 
*/
package BinaryTree2;


/**   
 * @文 件 名:  Demo2.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月5日 下午4:50:03 
 */
public class Demo2 {
	
	  public static void main(String[] args) {
	        BST<Integer, String> bst = new BST();
	        bst.insert(10, "a");
	        bst.insert(12, "b");
	        bst.insert(3, "d");
	        bst.insert(9, "cdd");
	        bst.insert(33, "cff");
	        bst.insert(38, "ceee");
	        bst.insert(1, "aaaa");
	        bst.insert(0, "dddd");
	        bst.insert(99, "dddd");
	        bst.insert(100, "dddd");
	        bst.insert(7, "dddd");
	        bst.insert(1, "dddd");
	        //从根开始打印
	        TreePrintUtil.pirnt(bst.getRoot());

	    }
 
	
}
