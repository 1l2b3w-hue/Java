import java.util.Scanner;
public class Exercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tom tom = new Tom();
		System.out.println("��������� : ");
		int bureau = sc.nextInt();
		tom.game(bureau);
	}
}
// �и���Tom������ĳ�Ա����.��Ա�����������Ե��Բ�ȭ
// ����ÿ�ζ����������0��1��2
// 0��ʾʯͷ1��ʾ����2��ʾ��
// ��Ҫ������ʾTom����Ӯ�������嵥��
class Tom {
	public void game(int n) {
		int win = 0;
		int lose = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(i = 0; i < n; i++) {
			int randoms =(int)(Math.random() * 3);
			System.out.println("�������ĳ�ȭ : ");
			int m  = sc.nextInt();
			switch(m) {
				case 0 :
					if(randoms == 1) {
						System.out.println("ʯͷ�Լ�����TomӮ");
						win++;
					}
					else if(randoms == 2){
						System.out.println("ʯͷ�Բ�������Ӯ");
						lose++;
					}
					else if(randoms == 0) {
						System.out.println("ʯͷ��ʯͷ��ƽ��");
					}
					break;
				case 1 :
					if(randoms == 1) {
						System.out.println("�����Լ�����ƽ��");
						
					}
					else if(randoms == 2){
						System.out.println("�����Բ���TomӮ");
						win++;
					}
					else if(randoms == 0) {
						System.out.println("������ʯͷ������Ӯ");
						lose++;
					}
					break;

				case 2 :
					if(randoms == 1) {
						System.out.println("���Լ���������Ӯ");
						lose++;
					}
					else if(randoms == 2){
						System.out.println("���Բ���ƽ��");
					}
					else if(randoms == 0) {
						System.out.println("����ʯͷ��TomӮ");
						win++;
					}
					break;

				default :
					System.out.println("�������ִ���");
					i--;
			}
		}
		System.out.println("һ��" + i + "�֣�TomӮ" + win + "��" + lose);
		
	}
}