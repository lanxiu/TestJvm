/*
 * @文 件 名: IteratorTreeCenter.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述: (用一句话描述该文件做什么)
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2019年1月5日 上午11:10:41
 */
package BinaryTree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @文 件 名: IteratorTreeCenter.java
 * @版 权: 灭霸指挥中心. Copyright 2014-2020, All rights reserved
 * @描 述:
 * @版 本: 1.0
 * @创 建 人: 0216000799
 * @创建时间: 2019年1月5日 上午11:10:41
 */
public class IteratorTreeCenter {
	
	String tmp = "";

	// 根节点 --》 左子树 --》右子树
	@Test
	public void iteratorCenter() {
		BinaryTreeNode tree = CreateTree.createTree();
		printTree(tree);
		System.out.println(tmp);
	}

	public void printTree(BinaryTreeNode node) {
		if (node == null)
			return;
		tmp += "     ";
		tmp += node.getData();
		printTree(node.getLeft());
		printTree(node.getRight());
	}

	// 左子树 --》 根节点 --》右子树
	@Test
	public void iteratorLeft() {
		BinaryTreeNode tree = CreateTree.createTree();
		tmp = printTreeLeftSort(tree);
		System.out.println(tmp);
	}
	
	public String printTreeLeftSort(BinaryTreeNode node) {
		if (node == null)
			return "";
		return printTreeLeftSort(node.getLeft()) + node.getData() + printTreeLeftSort(node.getRight());
	}

	// 左子树 --》 右子树 --》根节点
	@Test
	public void iteratorRight() {
		BinaryTreeNode tree = CreateTree.createTree();
		tmp = printTreeRightSort(tree);
		System.out.println(tmp);
	}
	
	public String printTreeRightSort(BinaryTreeNode node) {
		if (node == null)
			return "";
		return printTreeRightSort(node.getLeft()) + printTreeRightSort(node.getRight()) + node.getData();
	}

	@Test
	public void printTree() {
		BinaryTreeNode tree = CreateTree.createTree();
		int floor = 3;
		int distance = (int) Math.pow(2, floor) * 20;
		List<BinaryTreeNode> lst = new ArrayList<BinaryTreeNode>();
		lst.add(tree);
		int i = 1;
		while (lst.size() > 0) {
			int n = (int) (distance / Math.pow(2, i));
			List<BinaryTreeNode> lstTmp = new ArrayList<BinaryTreeNode>();
			for (int t = 0; t < lst.size(); t++) {
				printSpace(n);
				BinaryTreeNode treeTmp = lst.get(t);
				System.out.print(treeTmp.getData());
				if (treeTmp.getLeft() != null)
					lstTmp.add(treeTmp.getLeft());
				if (treeTmp.getRight() != null)
					lstTmp.add(treeTmp.getRight());
			}
			lst = lstTmp;
			i++;
			System.out.println();
		}
	}

	public void printSpace(int n) {
		for (int i = 0; i <= n; i++)
			System.out.print(" ");
	}
}
