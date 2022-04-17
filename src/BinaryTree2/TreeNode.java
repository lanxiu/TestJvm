/*
* @文 件 名:  TreeNode.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月5日 下午4:46:23 
*/
package BinaryTree2;


/**   
 * @文 件 名:  TreeNode.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月5日 下午4:46:23 
 */
public interface TreeNode {
    /**
     * 需要打印的信息
     * @return
     */
    String getPrintInfo();

    TreeNode getLeftChild();

    TreeNode getRightChild();
}
 
