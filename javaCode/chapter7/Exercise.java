public class Exercise {

	public static void main(String[] args) {
		// A01 a = new A01();
		// // double[] arr = {100.6,43.67,45.78,76.45,76.23,45.32};
		// // double[] arr = {};
		// double[] arr = null;
		// Double res = a.max(arr);
		// if(res != null){
		// 	System.out.println("最大值为 ： " + a.max(arr));
		// }
		// else {
		// 	System.out.println("数组输入有问题,不能为null或者数组为空");
		// }

		// A02 a = new A02();
		// String s1 = "abc";
		// // String[] arr = {"acd","abc","fda","adfs"};
		// String[] arr = {};
		// // String[] arr = null;
		// if(a.find(s1,arr) != -1 ){
		// 	System.out.println("找到了，下标为 ： " + a.find(s1,arr));
		// }
		// else {
		// 	System.out.println("没找到");
		// }

		Book b1 = new Book("买火柴的小女孩",176.6);
		Book b2 = new Book("安徒生童话",134.6);
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
// 编写类A01，定义方法max，实现求某个double数组的最大值，并返回
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
// 编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引，
// 如果找不到，返回-1
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
// 编写类Book，定义方法updatePrice，实现更改某本书的价格，具体：如果价格
// >150，则更改为150，如果价格>100，更改为100，否则不变H
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
		System.out.println("书名 ： " + this.name + 
			"价格 ：" + this.price);
	}
}