package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	interface IHello {
		void sayHello();
	}

	class Hello implements IHello {

		@Override
		public void sayHello() {

			System.out.println("hello world");
		}
	}

	class DynamicProxy implements InvocationHandler {

		Object originalObj;

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// TODO Auto-generated method stub

			System.out.println("welcome");

			method.invoke(originalObj, args);
			return null;
		}

		Object bind(Object originalObj) {
			this.originalObj = originalObj;
			return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),
					originalObj.getClass().getInterfaces(), this);
		}

	}

	public static void main(String[] args) {

		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		IHello hello = (IHello) new DynamicProxyTest().new DynamicProxy().bind(new DynamicProxyTest().new Hello());

		hello.sayHello();
	}

}
