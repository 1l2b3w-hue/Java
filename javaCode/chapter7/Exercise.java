public class Exercise {

	public static void main(String[] args) {
		// A01 a = new A01();
		// // double[] arr = {100.6,43.67,45.78,76.45,76.23,45.32};
		// // double[] arr = {};
		// double[] arr = null;
		// Double res = a.max(arr);
		// if(res != null){
		// 	System.out.println("���ֵΪ �� " + a.max(arr));
		// }
		// else {
		// 	System.out.println("��������������,����Ϊnull��������Ϊ��");
		// }

		// A02 a = new A02();
		// String s1 = "abc";
		// // String[] arr = {"acd","abc","fda","adfs"};
		// String[] arr = {};
		// // String[] arr = null;
		// if(a.find(s1,arr) != -1 ){
		// 	System.out.println("�ҵ��ˣ��±�Ϊ �� " + a.find(s1,arr));
		// }
		// else {
		// 	System.out.println("û�ҵ�");
		// }

		Book b1 = new Book("�����СŮ��",176.6);
		Book b2 = new Book("��ͽ��ͯ��",134.6);
		Book b3 = new Book("123",76.6);
		b1.info();
		b2.info();
		b3.info();
		b1.updatePrice();
		b2.updatePrice();
		b3.updatePrice();
		b1.info();
		b2.info();
		b3.info();
	}
}
// ��д��A01�����巽��max��ʵ����ĳ��double��������ֵ��������
// class A01 {
// 	public Double max(double[] arr) {
// 		if(arr != null && arr.length > 0) {
// 			double max = arr[0];
// 			for(int i = 1; i < arr.length; i++){
// 				if(max < arr[i]) {
// 					max = arr[i];
// 				}
// 			}
// 			return max;
// 		}
// 		else {
// 			return null;
// 		}
		
// 	}
// }
// ��д��A02�����巽��find��ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң�������������
// ����Ҳ���������-1
class A02 {
	public int find(String s1,String[] arr) {
		if(arr != null ){
			for(int i = 0; i < arr.length; i++){
				if(s1.equals(arr[i])) {
					return i;
				}
			}
		}
		return -1;
	}
}
// ��д��Book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸񣬾��壺����۸�
// >150�������Ϊ150������۸�>100������Ϊ100�����򲻱�H
class Book {
	String name;
	double price;
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		if(this.price > 150) {
			this.price = 150;
		}
		else if(this.price > 100){
			this.price = 100;
		}
	}
	public void info() {
		System.out.println("���� �� " + this.name + 
			"�۸� ��" + this.price);
	}
}