package hotwap;

import java.lang.reflect.Method;

public class JavaClassExecuter {

	
	public static String execute(byte[] classByte) {
		
		HackSystem.clearBuffer();
		ClassModifier cm = new ClassModifier(classByte);
		byte[] modiBytes = cm.modifyUtf8Constant("java/lang/System", "hotswap/HackSystem");
		HotSwapClassLoader loader = new HotSwapClassLoader();
		Class clazz = loader.loadByte(modiBytes);
		try {
			Method method = clazz.getMethod("main", new Class[] {String[].class});
			method.invoke(null, new String[] {null});
			}catch (Throwable e) {
				e.printStackTrace(HackSystem.out);
			}
		
		
		
		return "";
	}
	
	
	
	
}
