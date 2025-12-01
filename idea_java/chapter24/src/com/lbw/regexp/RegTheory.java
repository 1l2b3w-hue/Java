package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 分析正则表达式的底层实现
public class RegTheory {

    public static void main(String[] args) {

        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：" +
                "J2ME（Java2 Micro Edition，Java2平台的微型版），应用于移动、无线及有限资源的环境；" +
                "J2SE（Java 2 Standard Edition，Java 2平台的标准版），应用于桌面环境；" +
                "J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应用于基于Java的应用服务器。" +
                "Java 2平台的发布，是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及。";

        // \\d 表示匹配任意数字(前面 \ 为转义)
//        String regex = "\\d\\d\\d\\d";
        String regex = "(\\d\\d)(\\d\\d)";
        // 分组 : 当匹配规则中有 () 时，一个()表示一个分组，第一个() 就是第一组.....
        // 创建模式对象(正则表达式对象)
        Pattern pattern = Pattern.compile(regex);

        // 创建匹配器
        // 创建一个匹配器，按照模式对象的匹配规则，从 content 中查找相关的字符串
        Matcher matcher = pattern.matcher(content);

        // 循环匹配
        /*
          matcher.find() 完成的任务
          1. 根据匹配规则，找到满足规则的子字符串
          2. 找到子字符串后，将 子字符串的开始的索引记录到 matcher 的 group 数组中(int)
                2.1 将 group[0] 设置为 子字符串的开始位置，将子字符串的结束索引 +1 放入 group[1]中
                2.2 根据分组情况，将第一组匹配达到的字符串记录到 group[2] 和 group[3],记录索引与上相同
                2.3 将第二组匹配达到的字符串记录到 group[4] 和 group[5] ....
          3. 同时记录oldLast 的值为 子字符串的结束索引 +1,使下次执行find时，从oldLast开始匹配

          matcher.group(0) :
            源码：
            public String group(int group) {
                if (first < 0)
                    throw new IllegalStateException("No match found");
                if (group < 0 || group > groupCount())
                    throw new IndexOutOfBoundsException("No group " + group);
                if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
                    return null;
                return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
            }
            根据你传递的 group 参数，从 content 中截取 [groups[group * 2], groups[group * 2 + 1]) 即
            截取 [0,4) 的子字符串

            再次执行 find 方法时，将会按照上面的规则从 oldLast 开始重新再来一遍，并将group[0] 和 group[1] 覆盖

         */

        while(matcher.find()) {
            // 如果正则表达式有 () 分组
            // 取出的匹配子字符串规则如下：
            // group(0) : 表示匹配到的子字符串
            // group(1) : 表示匹配到的子字符串的第一组
            // group(2) : 表示匹配到的子字符串的第2组 .....
            // 分组的数不能越界

            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
