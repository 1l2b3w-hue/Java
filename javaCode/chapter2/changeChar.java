public class changeChar {
// 演示转义字符的使用 
	public static void main(String[] args) {
		//  \t : 制表符
		System.out.println("北京\t武汉\t荆门");
		//  \n : 换行符 
		System.out.println("北京\n武汉\n荆门");
		// 	\\ : 一个反斜杠 
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		//  \" : 一个"
		System.out.println("老韩说\"要好好学习java,有前途\"。");
		//  \' : 一个'
		System.out.println("老人说\'上了大学，就好找工作了\'.");
		//  \r : 一个回车
		// 解读 ： 当计算机在读取到\r时，光标会回到该行的最前头然后进行覆盖读取
		System.out.println("韩顺平教育\r北京"); //北京平教育
		System.out.println("韩顺平教育\r\n北京"); //会换行，写北京
	}

}