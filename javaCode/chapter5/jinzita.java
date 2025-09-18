import java.util.Scanner;
public class jinzita {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int layer = sc.nextInt();
		
		for(int i = 1; i <= layer ; i++) {
			if(i <= layer / 2 + 1) {
				for(int k = 1; k <= layer / 2 + 1 - i; k++) {
				
					System.out.print(" ");  //´òÓ¡¿Õ¸ñ
				}
				for(int j = 1; j <= 2 * i - 1; j++) {
					if(j == 1 || j == 2 * i - 1 || i == layer / 2 + 1 ) {
						System.out.print("*");   
					}
					else {
						System.out.print(" ");  //¿ÕÐÄ
					}
				}
			}
			else {
				for(int n = layer - i;n < layer - (layer / 2 + 1); n++) {
					System.out.print(" ");
				}
				for(int k = 1; k <= 2 * (layer - i) + 1; k++) {
					if(k == 1 || k == 2 * (layer - i) + 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}