package hotwap;

import org.apache.tools.ant.types.selectors.SizeSelector.ByteUnits;

/**
 * 修改class 文件 常量池的功能
 * 
 * @author lenchol
 *
 */
public class ClassModifier

{

	// 常量池起始偏移
	private static final int CONSTATN_POOL_COUNT_INDEX = 8;

	// 常量的tag标志
	private static final int CONSTANT_UTF8_INFO = 1;

	// 11种常量所占的长度
	private static final int[] CONSTANT_ITEM_LENGTH = { -1, -1, -1, 5, 5, 9, 9, 3, 3, 5, 5, 5, 5 };

	private static final int u1 = 1;
	private static final int u2 = 2;
	private byte[] classByte;

	public ClassModifier(byte[] classByte) {
		this.classByte = classByte;
	}

	/**
	 * 修改常量池中常量的内容
	 * @param oldStr
	 * @param newStr
	 * @return
	 */
	public byte[] modifyUtf8Constant(String oldStr, String newStr) {
		
		int cpc = getConstatnPoolCount();
		int offset = CONSTATN_POOL_COUNT_INDEX + u2;
		for(int i=0;i<cpc;i++) {
			int tag = ByteUtils.bytes2Int(classByte, offset, u1);
			if(tag == CONSTANT_UTF8_INFO) {
				int len = ByteUtils.bytes2Int(classByte, offset+u1, u2);
				offset +=(u1+u2);
				
				String str =ByteUtils.bytes2String(classByte, offset, len);
				
				if(str.equalsIgnoreCase(oldStr)) {
					
					byte[] strBytes= ByteUtils.string2Byte2(newStr);
					byte[] strLen = ByteUtils.int2Bytes(newStr.length(), u2);
					classByte = ByteUtils.bytesReplace(classByte, offset-u2, u2, strLen);
					classByte = ByteUtils.bytesReplace(classByte, offset, len, strBytes);
					return classByte;
				} else {
					offset += len;
				}
				
				
			} else {
				offset +=CONSTANT_ITEM_LENGTH[tag];
			}
		}
		
		
		
		
		
		
		return classByte;
	}
	
	public int getConstatnPoolCount() {
		
		return ByteUtils.bytes2Int(classByte, CONSTATN_POOL_COUNT_INDEX, u2);
	}

}
