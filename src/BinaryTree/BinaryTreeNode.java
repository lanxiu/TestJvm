/*
 * @文 件 名: BinaryTreeNode.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述: (用一句话描述该文件做什么)
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2019年1月5日 上午11:06:28
 */
package BinaryTree;

/**
 * @文 件 名: BinaryTreeNode.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述:
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2019年1月5日 上午11:06:28
 */
// 二叉树节点
public class BinaryTreeNode {
	
	private char				data;
	private BinaryTreeNode	left;
	private BinaryTreeNode	right;

	public BinaryTreeNode() {
	}

	public BinaryTreeNode(char data) {

		this.data = data;
	}
	
	public BinaryTreeNode(char data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public char getData() {
		return data;
	}
	
	public void setData(char data) {
		this.data = data;
	}
	
	public BinaryTreeNode getLeft() {
		return left;
	}
	
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	public BinaryTreeNode getRight() {
		return right;
	}
	
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
}