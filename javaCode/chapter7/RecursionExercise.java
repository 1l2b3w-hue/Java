import java.util.Scanner;
public class RecursionExercise {

	public static void main(String[] args) {
		MyTools tools = new MyTools();
		Scanner sc = new Scanner(System.in);
	// ��ʹ�õݹ�ķ�ʽ���쳲�������1��1��2,3��5��8��13...����һ������n���������ֵ�Ƕ�
		// System.out.println("��������Ҫ�ĵڼ���쳲������� �� ");
		// int n = sc.nextInt();
		// int result = tools.Fibonacci(n);
		// if(result != -1) {
		// System.out.println("��" + n + "��쳲�������Ϊ��" + result);
		// }
		


	// 2.���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ�����Ժ�
	// ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����������10��ʱ�����ٳ�ʱ������û�ԣ�
	// ����ֻ��1�������ˡ����⣺��������ٸ����ӣ�
		int count = 9;
		int result = tools.peachs(count,1);
		System.out.println("�������" + result + "������");

	}
}
class MyTools {
	public int Fibonacci(int n) {
		if(n > 0) {
			if(n == 2 || n == 1) {
			return 1;
			} 
			else {
				return Fibonacci(n - 1) + Fibonacci(n - 2);
			}
		}
		else {
			System.out.println("�����������Ҫ������һ������0����");
			return -1;
		}
	}

	public int peachs(int count, int n) {
		if(count == 0) {
			return n;
		}
		else {
			return peachs(count - 1, 2 * (n + 1));
		}
	}
}