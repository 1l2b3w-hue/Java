public class OverLoadExercise{

	public static void main(String[] args) {
		/*
			��д������Methods�ж����������ط��������á�������Ϊm������������
			�����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢���
			�������˲�������������ַ�����Ϣ���������main0�����зֱ��ò���
			�������������
		*/
		Method method = new Method();
		method.m(6);
		method.m(6,5);
		method.m("OverLoadExercise");
		/*
			��Methods�࣬�����������ط���max0����һ����������������intֵ�е���
			��ֵ���ڶ�����������������doubleֵ�е����ֵ����������������������
			doubleֵ�е����ֵ�����ֱ������������
		*/
		System.out.println(method.max(10,15));
		System.out.println(method.max(10.8,10.9));
		System.out.println(method.max(10.6,15.7,9.9));

	}
}
class Method{
	public void m(int n){
		System.out.println(n * n);
	}
	public void m(int n1,int n2){
		System.out.println(n1 * n2);
	}
	public void m(String s1){
		System.out.println(s1);
	}
	public int max(int n1,int n2) {
		if(n1 > n2){
			return n1;
		}
		else {
			return n2;
		}
	}
	public double max(double n1,double n2) {
		if(n1 > n2){
			return n1;
		}
		else {
			return n2;
		}
	}
	public double max(double n1,double n2,double n3){
		double max1 = n1 > n2 ? n1 : n2;
		double max2 = max1 > n3 ? max1 : n3;
		return max2;
	}
}