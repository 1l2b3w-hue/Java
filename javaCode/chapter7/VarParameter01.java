public class VarParameter01 {

	public static void main(String[] args){
		HspMethod m = new HspMethod();
		System.out.println(m.sum(10,56,23,78,32,45));
		System.out.println(m.sum(10,56,66));

		// ϸ�ڣ� �ɱ������ʵ�ο�����һ������
		int[] a = {1,2,3,4,5,6};
		System.out.println(m.sum(a));

	}
}
class HspMethod {
	// int... : ��ʾ�ɱ���������Խ���0~n��int���͵Ĳ���
	// ʹ�ÿɱ����ʱ�����Ե���������ʹ�ã���parameters�Ϳ���һ������
	public int sum(int... parameters) {
		// System.out.println("���ܵĸ��� �� " + parameters.length);
		// return 0;
		int res = 0;
		for(int i = 0; i < parameters.length; i++){
			res += parameters[i];
		}
		return res;
	}

	public void f2( String a,double... nums){
		// ���� �� double... nums,String a
	}
}