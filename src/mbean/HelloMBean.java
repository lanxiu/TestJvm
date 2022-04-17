/*
* @文 件 名:  HelloMBean.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年12月25日 上午9:53:30 
*/
package mbean;


/**   
 * @文 件 名:  HelloMBean.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年12月25日 上午9:53:30 
 */
public interface HelloMBean {
    public String getName();
    public void setName(String name);
    public void printHello();
    public void printHello(String whoName);
}

