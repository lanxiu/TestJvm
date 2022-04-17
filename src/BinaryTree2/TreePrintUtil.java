/*
* @文 件 名:  TreePrintUtil.java 
* @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
* @描     述:  (用一句话描述该文件做什么) 
* @版     本: 1.0
* @创 建 人:  0216000799
* @创建时间: 2019年1月5日 下午4:45:22 
*/
package BinaryTree2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**   
 * @文 件 名:  TreePrintUtil.java 
 * @版     权:  灭霸指挥中心. Copyright 2014-2020,  All rights reserved
 * @描     述:  
 * @版     本:  1.0
 * @创 建 人:  0216000799
 * @创建时间: 2019年1月5日 下午4:45:22 
 */
public class TreePrintUtil {
    public static void pirnt(TreeNode root) {
        // 找到左边的最大偏移量
        int maxLeftOffset = findMaxOffset(root, 0, true);
        int maxRightOffset = findMaxOffset(root, 0, false);
        int offset = Math.max(maxLeftOffset, maxRightOffset);
        // 计算最大偏移量
        Map<Integer, PrintLine> lineMap = new HashMap();
        calculateLines(root, offset, lineMap, 0, true);
        Iterator<Integer> lineNumbers = lineMap.keySet().iterator();
        int maxLine = 0;
        while (lineNumbers.hasNext()) {
            int lineNumber = lineNumbers.next();
            if (lineNumber > maxLine) {
                maxLine = lineNumber;
            }
        }
        for (int i = 0; i <= maxLine; i++) {
            PrintLine line = lineMap.get(i);
            if (line != null) {
                System.out.println(line.getLineString());
            }
        }

    }

    private static void calculateLines(TreeNode parent, int offset, Map<Integer, PrintLine> lineMap, int level,
            boolean right) {
        if (parent == null) {
            return;
        }
        int nameoffset = parent.toString().length() / 2;
        PrintLine line = lineMap.get(level);
        if (line == null) {
            line = new PrintLine();
            lineMap.put(level, line);
        }
        line.putString(right ? offset : (offset - nameoffset), parent.toString());
        // 判断有没有下一级
        if (parent.getLeftChild() == null && parent.getRightChild() == null) {
            return;
        }
        // 如果有，添加分割线即/\
        PrintLine separateLine = lineMap.get(level + 1);
        if (separateLine == null) {
            separateLine = new PrintLine();
            lineMap.put(level + 1, separateLine);
        }
        if (parent.getLeftChild() != null) {
            separateLine.putString(offset - 1, "/");
            calculateLines(parent.getLeftChild(), offset - nameoffset - 1, lineMap, level + 2, false);
        }
        if (parent.getRightChild() != null) {
            separateLine.putString(offset + nameoffset + 1, "\\");
            calculateLines(parent.getRightChild(), offset + nameoffset + 1, lineMap, level + 2, true);
        }

    }

    /**
     * 需要打印的某一行
     * 
     * @author zhuguohui
     *
     */
    private static class PrintLine {
        /**
         * 记录了offset和String的map
         */
        Map<Integer, String> printItemsMap = new HashMap ();
        int maxOffset = 0;

        public void putString(int offset, String info) {
            printItemsMap.put(offset, info);
            if (offset > maxOffset) {
                maxOffset = offset;
            }
        }

        public String getLineString() {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i <= maxOffset; i++) {
                String info = printItemsMap.get(i);
                if (info == null) {
                    buffer.append(" ");
                } else {
                    buffer.append(info);
                    i += info.length();
                }
            }
            return buffer.toString();
        }

    }

    private static int findMaxOffset(TreeNode parent, int offset, boolean findLeft) {
        if (parent != null) {
            offset += parent.toString().length();
        }
        if (findLeft && parent.getLeftChild() != null) {
            offset += 1;
            return findMaxOffset(parent.getLeftChild(), offset, findLeft);
        }
        if (!findLeft && parent.getRightChild() != null) {
            return findMaxOffset(parent.getRightChild(), offset, findLeft);
        }
        return offset;
    }

 

}
 