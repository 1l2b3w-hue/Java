public class Recursion {

	public static void main(String[] args) {
		AA n = new AA();
		n.test(4);
		int sum = n.factorial(4);
		System.out.println("sum = " + sum);
	}
}
class AA {
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		// else
		System.out.println("n = " + n);
	}
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return factorial(n - 1) * n;
		}
	}
}