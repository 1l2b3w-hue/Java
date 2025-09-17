public class relationalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println(a > b); //false
		System.out.println(a >= b); //false
		System.out.println(a < b); //true
		System.out.println(a <= b); //true
		System.out.println(a == b); // false
		System.out.println(a != b); //true

		boolean flag = a > b; // false ? ≤ª£¨true£¨true∂‡¡À
		System.out.println("flag = " + flag);
	}
}