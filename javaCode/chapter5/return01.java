public class return01 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			if(i == 3){
				System.out.println("��˳ƽ����");
				// break;
				// continue;
				return;
			}
			System.out.println("Hello world");
		}
		System.out.println("go on...");
	}
}