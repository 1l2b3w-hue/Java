public class MethodDetail {

	public static void main(String[] args) {
		// ����Ҫ��ʹ��һ�����������������ĺͺͲ�
		AA tool = new AA();
		int[] result = tool.sumDifference(10,5);
		System.out.print("��Ϊ" + result[0] + " ��Ϊ" + result[1]);
	}
}
class AA {
	public int[] sumDifference(int num1, int num2) {
		int[] results = new int[2];
		results[0] = num1 + num2;
		results[1] = num1 - num2;
		return results;
	}
}