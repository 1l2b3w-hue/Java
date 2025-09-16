public class charDetail {

	public static void main(String[] args) {
		// char 本质是一个整数
		char a = 97;
		System.out.println(a);
		char b = 'a';
		System.out.println((int)b);

		char name = '黎';
		System.out.println((int)name);

		char c = 'a';
		System.out.println(c + 10); 

		char c5 = 'b' + 1;
		System.out.println((int)c5);//99
		System.out.println(c5);//c
	} 
}