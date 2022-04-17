/*
* @文 件 名:  CreateTree.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月5日 上午11:07:11 
*/
package BinaryTree;


/**   
 * @文 件 名:  CreateTree.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月5日 上午11:07:11 
 */
public class CreateTree {
	
	public static BinaryTreeNode createTree() {
		BinaryTreeNode btree = new BinaryTreeNode('A');
		BinaryTreeNode btreeB = new BinaryTreeNode('B');
		BinaryTreeNode btreeC = new BinaryTreeNode('C');
		BinaryTreeNode btreeD = new BinaryTreeNode('D');
		BinaryTreeNode btreeE = new BinaryTreeNode('E');
		BinaryTreeNode btreeF = new BinaryTreeNode('F');
		BinaryTreeNode btreeG = new BinaryTreeNode('G');
		BinaryTreeNode btreeH = new BinaryTreeNode('H');
		BinaryTreeNode btreeI = new BinaryTreeNode('I');
		BinaryTreeNode btreeJ = new BinaryTreeNode('J');
		BinaryTreeNode btreeK = new BinaryTreeNode('K');
		BinaryTreeNode btreeL = new BinaryTreeNode('L');
		BinaryTreeNode btreeM = new BinaryTreeNode('M');
		
		btree.setLeft(btreeB);
		btree.setRight(btreeC);
		btreeB.setLeft(btreeD);
		btreeF.setLeft(btreeE);
		btreeC.setLeft(btreeG);
		btreeB.setRight(btreeF);
		btreeG.setRight(btreeH);
		btreeC.setRight(btreeI);
		btreeD.setRight(btreeK);
		btreeF.setRight(btreeL);
		btreeD.setLeft(btreeJ);
		btreeG.setLeft(btreeM);
		
		return btree;
	}
}
