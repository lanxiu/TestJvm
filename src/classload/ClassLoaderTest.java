/*
* @文 件 名:  ClassLoaderTest.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月9日 下午5:05:06 
*/
package classload;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**   
 * @文 件 名:  ClassLoaderTest.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月9日 下午5:05:06 
 */
public class ClassLoaderTest {
	
	public static void main(String[] args) throws Exception{
		
		ClassLoader myClassLoader = new ClassLoader() {
			
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				// TODO Auto-generated method stub
				try {
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
					InputStream is = getClass().getResourceAsStream(fileName);
					if (is == null)
						return super.loadClass(name);
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name, b, 0, b.length);
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
			}
		};
		
		Object obj = myClassLoader.loadClass("classload.NotInitialization").newInstance();
		System.out.println(obj.getClass());
		System.out.println( obj instanceof classload.NotInitialization);
		System.out.println(obj.getClass().getClassLoader().getClass().getName());
		System.out.println(new NotInitialization().getClass().getClassLoader().getClass().getName());
		System.out.println(new NotInitialization() instanceof classload.NotInitialization);
		System.out.println(Charset.defaultCharset());
	}
	
}
