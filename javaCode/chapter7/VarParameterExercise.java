public class VarParameterExercise {

	public static void main(String[] args) {

		// �������������ֱ�ʵ�ַ������������ſγɼ����ܷ֣����������������ſγɼ�����
		// �֣����������������ſγɼ����ܷ֣�����װ��һ���ɱ�����ķ���
		HspMethod printScore = new HspMethod();
		String s1 = printScore.showScore("С��",75.7,66);
		String s2 = printScore.showScore("С��",75.7,66,78.9);
		String s3 = printScore.showScore("С��",75.7,66,67,98,77);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
class HspMethod {
	public String showScore(String name, double... scores) {
		double scoreSum = 0;
		for(int i = 0; i < scores.length; i++) {
			scoreSum += scores[i];
		}
		// System.out.println("���� �� " + name + scores.length +
		//  "���ܳɼ�Ϊ" + scoreSum);
		String ret = name + "�ɼ� :" + scoreSum;
		return ret;
	}
}