public class logicOperator {

	public static void main(String[] args) {
		// && ¶ÌÂ·Óë¡¢ & Âß¼­Óë

		int age = 50;
		if(age > 20 && age < 30) {
			System.out.println("OK1000");
		}
		if(age > 20 & age < 40) {
			System.out.println("OK2000");
		}

		int a = 4;
		int b = 9;
		if(a < 10 && ++b < 50) {
			System.out.println("OK3000");
		}
		// if(a < 1 & ++b < 50) {
		// 	System.out.println("OK3000");
		// }
		System.out.println("a = " + a  + "b = " + b);

		
	}
}