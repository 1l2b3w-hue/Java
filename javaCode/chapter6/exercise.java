import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		// 1.
		// int a = 6;
		// int b = 3;
		// // a : 0110
		// // b : 0011
		// System.out.println(a & b); //全1为1，因此结果为 ： 0010，2
		// System.out.println(a | b); //有1为1，因此结果为 ： 0111，7
		// System.out.println(a ^ b); //不同为1，因此结果为 ： 0101，5
		// System.out.println( ~a ); //按位取反（算8位）：1111 1001 （负数补码）
	 // 	//转原码 ： 1000 0111  结果为2 -7
	 // 	System.out.println(a << 2); // 相当于*2*2； 结果为24
	 // 	System.out.println(a >> 2); // 相当于/2/2； 结果为1
	 // 	System.out.println(a >>> 2); // 结果为1

		//2.
		// int a = 10;
		// int b = 20; 
		// //以a ^ 0 = a ,a ^ a = 0;
		// a = a ^ b;
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println("a = " + a + " b = " + b);

		//3.
		//过了吧，确定要我自己实现转换吗
		// int num = 25;
		// String a = " ";
		// String b = " ";
		// String c = " ";
		// while(num != 0) {
		// 	int yu = num % 2;
		// 	a = yu + a;
		// 	num /= 2;
		// }
		// System.out.println(a); // 二进制
		// num = 25;
		// while(num != 0) {
		// 	int yu = num % 8;
		// 	b = yu + b;
		// 	num /= 8;
		// }
		// System.out.println(b);//八进制
		// num = 25;
		// while(num != 0) {
		// 	int yu = num % 16;
		// 	if(yu > 9) {
		// 		switch(yu - 9) {
		// 			case 1: c = 'a' + c; break;
		// 			case 2: c = 'b' + c; break;
		// 			case 3: c = 'c' + c; break;
		// 			case 4: c = 'd' + c; break;
		// 			case 5: c = 'e' + c; break;
		// 			case 6: c = 'f' + c; break;
		// 		}
		// 	}
		// 	else {
		// 		c = yu + c;
		// 	}
			
		// 	num /= 16;
		// }
		// System.out.println(c);//十六进制

		//4.


		//5.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入成绩 ：");
		// double score = sc.nextDouble();
		// if(score >= 90 && score <= 100) {
		// 	System.out.println("A");
		// }
		// else if(score >= 80 && score <= 89) {
		// 	System.out.println("B");
		// }
		// else if(score >= 70 && score <= 79) {
		// 	System.out.println("C");
		// }
		// else if(score >= 60 && score <= 69) {
		// 	System.out.println("D");
		// }
		// else if(score >= 0 && score <= 59) {
		// 	System.out.println("E");
		// }
		// else {
		// 	System.out.println("成绩输入错误");
		// }

		//6.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入一个字符 ：");
		// char a = sc.next().charAt(0);
		// if(a < 90) {
		// 	a = (char)(a + 32);
		// }
		// switch(a) {
		// 	case 'a' :
		// 	case 'e' :
		// 	case 'i' :
		// 	case 'o' :
		// 	case 'u' :	System.out.println("是元音字符");
		// 		break; //你竟然想让我一一列举出其余的21个字母吗？有毒吧
		// 	case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm':
		// 	case 'n': case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y':
		// 	case 'z' : 	System.out.println("是辅音字符");
		// 		break;
		// 	default : System.out.println("输入非法");
		// }
	}
}