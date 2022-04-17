/*
* @文 件 名:  Hello.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2018年12月25日 上午9:53:55 
*/
package mbean;


/**   
 * @文 件 名:  Hello.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2018年12月25日 上午9:53:55 
 */
public class Hello implements HelloMBean {
    private String name;
    @Override
    public String getName() {
        return name;
    }
 
    @Override
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public void printHello() {
        System.out.println("Hello world, "+ name);
    }
 
    @Override
    public void printHello(String whoName) {
        System.out.println("Hello, "+whoName);
    }
}
