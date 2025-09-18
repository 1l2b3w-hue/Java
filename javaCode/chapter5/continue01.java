public class continue01 {

	public static void main(String[] args) {
		// int i = 1;
		// while(i <= 4){
		// 	i++;
		// 	if(i == 2) {
		// 		continue;
		// 	}
		// 	System.out.println("i = " + i);
		// }
		label1:
		for(int j = 0; j < 4; j++) {
			label2: 
			for(int i = 0; i < 10; i++) {
				if(i == 2){
					// continue;
					// continue label2;
					continue label1;
				}
				System.out.print("i = " + i);
			}
		}
	}
} 