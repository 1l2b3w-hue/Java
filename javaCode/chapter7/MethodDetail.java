public class MethodDetail {

	public static void main(String[] args) {
		// 现在要求使用一个方法返回两个数的和和差
		AA tool = new AA();
		int[] result = tool.sumDifference(10,5);
		System.out.print("和为" + result[0] + " 差为" + result[1]);
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