import java.util.Scanner;
public class Object01 {

	public static void main(String[] args) {
		// ʹ�õ��������洢����  ����������һ��è����Ϣ���ˣ����������ݹ���
		// String name1 = "С��";
		// int age1 = 3;
		// String color1 = "��ɫ";
		// String name2 = "С��";
		// int age2 = 100;
		// String color2 = "��ɫ";
		// // ��������
		// System.out.println("������Сè������ �� ");
		// Scanner sc = new Scanner(System.in);
		// String input = sc.next();
		// // �����ж� 
		// if(input.equals(name1)) {
		// 	System.out.println("è�����֣�" +name1+ " ���䣺" + age1 +
		// 			" ��ɫ ��" + color1);
		// }
		// else if(input.equals(name2)){
		// 	System.out.println("è�����֣�" +name2+ " ���䣺" + age2+
		// 			" ��ɫ ��" + color2);
		// }
		// else {
		// 	System.out.println("����̫û����ֻèè");
		// }

		// ���������������Ϣ
		// ���������޷����ֳ�����ͨ���±��ȡ��Ϣ����ɱ����������ݵĶ�Ӧ��ϵ������֪�⣩��
		// ��������һֻè����Ϊ
		// String[] cat1 = {"С��","3","��ɫ"};
		// String[] cat2 = {"С��","100","��ɫ"};

		// �������� �� ��ǰ֪ʶ���ڲ��������ݹ����Ч�ʵ�
		// java����������������(OOP),����Ϊ�˽�����м����޷������Ľ����������

		// ������������ ��
		// ʵ����һֻè  new Cat()������һֻè�Ķ���
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10.0;

		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 20.0;

		System.out.println("��һֻè����ϢΪ �� " + cat1.name + " " 
			+ cat1.age + " " + cat1.color + " " + cat1.weight);
		System.out.println("�ڶ�ֻè����ϢΪ �� " + cat2.name + " " 
			+ cat2.age + " " + cat2.color + " " + cat2.weight);
	}
}

// ����һ��è�� �����Զ�����������
class Cat {
	String name;
	int age;
	String color;
	// �����������
	double weight;
}

class Car {
	String name; //����
	double price;
	String[] masters; //��������������
}