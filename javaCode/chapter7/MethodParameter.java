public class MethodParameter {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Change change = new Change() ;
		change.swipe(a,b);
		System.out.println("main ÖÐµÄa = " + a + " b = " + b);
	}
}
class Change {
	public void swipe(int a,int b) {
		System.out.println("a = " + a + " b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + " b = " + b);
	}
}