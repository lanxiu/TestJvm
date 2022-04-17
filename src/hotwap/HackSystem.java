package hotwap;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class HackSystem {
	

	public final static InputStream in = System.in;
	
	private static ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	public final static PrintStream out = new PrintStream(buffer);
	public final static PrintStream err = out;
	public static String getBufferString() {
		return buffer.toString();
	}
	
	public static void clearBuffer() {
		buffer.reset();
	}
	
	
}
