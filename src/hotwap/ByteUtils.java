package hotwap;

public class ByteUtils {

	public static int bytes2Int(byte[] b, int start, int len) {

		int sum = 0;
		int end = start + len;
		for (int i = start; i < end; i++) {
			int n = ((int) b[i]) & 0xff;
			n <<= ((--len) * 8);
			sum = n + sum;
		}
		return sum;

	}

	public static byte[] int2Bytes(int value, int len) {

		byte[] b = new byte[len];
		for (int i = 0; i < len; i++) {
			b[len - i - 1] = (byte) ((value >> 8 * i) & 0xff);
		}
		return b;
	}

	public static String bytes2String(byte[] b, int start, int len) {
		return new String(b, start, len);
	}

	public static byte[] string2Byte2(String str) {
		return str.getBytes();
	}

	public static byte[] bytesReplace(byte[] originalBYtes, int offset, int len, byte[] replaceBYtes) {

		byte[] newBYtes = new byte[originalBYtes.length + replaceBYtes.length - len];

		System.arraycopy(originalBYtes, 0, newBYtes, 0, offset);
		System.arraycopy(replaceBYtes, 0, newBYtes, offset, replaceBYtes.length);
		System.arraycopy(originalBYtes, offset + len, newBYtes, offset + replaceBYtes.length,
				originalBYtes.length - offset - len);
		return newBYtes;
	}

}
