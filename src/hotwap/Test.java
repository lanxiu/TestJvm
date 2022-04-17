package hotwap;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("");
		byte[] b = new byte[is.available()];
		is.read(b);
		is.close();

		JavaClassExecuter.execute(b);

	}
}
