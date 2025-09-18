import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入字母 ：");
		// char a = sc.next().charAt(0);
		// switch(a) {
		// 	case 'a' : System.out.println("星期一");
		// 		break;
		// 	case 'b' : System.out.println("星期二");
		// 		break;
		// 	case 'c' : System.out.println("星期三");
		// 		break;
		// 	case 'd' : System.out.println("星期四");
		// 		break;
		// 	case 'e' : System.out.println("星期五");
		// 		break;
		// 	case 'f' : System.out.println("星期六");
		// 		break;
		// 	case 'g' : System.out.println("星期天");
		// 		break;
		// 	default :  System.out.println("输入错误");
		// }	
		// switch 细节 ：
		// 表达式中的数据类型应该与case常量中的数据类型保持一致，或者是可以转换为可比较的数据类型
		// 表达式返回的数据类型只能是byte,short,int,char,String,enum
		// case 子句中的值必须是常量或者是常量表达式，不能是变量
		char c = 'a';
		// double c = 1.1;
		// char c1 = 'a';
		switch(c) {
			case 'a' : 
				System.out.println("OK1");
				break;
			case 'b' + 1 : 
				System.out.println("OK2");
				break;
			// case 20 :  // char 可以转换为int
			// 	System.out.println("OK2");
			// 	break;
			// case "hello" :  //显示不匹配
			// 	System.out.println("OK2");
			// 	break;
			// default : 
			// 	System.out.println("OK3"); 
		}
	}
}