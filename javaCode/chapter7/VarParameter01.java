public class VarParameter01 {

	public static void main(String[] args){
		HspMethod m = new HspMethod();
		System.out.println(m.sum(10,56,23,78,32,45));
		System.out.println(m.sum(10,56,66));

		// 细节： 可变参数的实参可以是一个数组
		int[] a = {1,2,3,4,5,6};
		System.out.println(m.sum(a));

	}
}
class HspMethod {
	// int... : 表示可变参数，可以接受0~n个int类型的参数
	// 使用可变参数时，可以当作数组来使用，即parameters就看成一个数组
	public int sum(int... parameters) {
		// System.out.println("接受的个数 ： " + parameters.length);
		// return 0;
		int res = 0;
		for(int i = 0; i < parameters.length; i++){
			res += parameters[i];
		}
		return res;
	}

	public void f2( String a,double... nums){
		// 不能 ： double... nums,String a
	}
}