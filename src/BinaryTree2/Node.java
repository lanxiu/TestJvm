/*
* @文 件 名:  Node.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月5日 下午4:46:39 
*/
package BinaryTree2;


/**   
 * @文 件 名:  Node.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月5日 下午4:46:39 
 */
public   class  Node<K extends Comparable<K>, V> implements TreeNode {
    K k;
    V v;
    Node left, right;

    public Node(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public String toString() {
        return "[" + k + "]";
    }

    @Override
    public String getPrintInfo() {

        return toString();
    }

    @Override
    public TreeNode getLeftChild() {
        // TODO Auto-generated method stub
        return left;
    }

    @Override
    public TreeNode getRightChild() {
        // TODO Auto-generated method stub
        return right;
    }

}
 
