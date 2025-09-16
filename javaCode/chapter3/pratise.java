public class pratise {

	public static void main(String[] args) {
		short s = 12;
		// s = s - 9 ; //结果为int，错误
		
		byte b = 10;
		// b = b + 11; //结果为int，错误
		b = (byte)(b + 12);

		char c = 'a';
		int i = 16;
		float d = .314F;
		double result = c + i + d;

		byte b = 16;
		short s = 14;
		short t = s + b; //结果为int,报错
	}
}