import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������� :");
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("���������18,Ҫ���Լ�����Ϊ�����������");
		}
		else {
			System.out.println("������䲻����ηŹ�����");
		}
	}
}