import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		// 1.
		// int x = 7;
		// int y = 4;
		// if(x > 5) {
		// 	if(y > 5) {
		// 		System.out.println(x + y);
		// 	}
		// 		System.out.println("º«Ë³Æ½½ÌÓý~");
		// }
		// else 
		// 	System.out.println("x is " + x);

		// 2.
		// double d1 = 12.3;
		// double d2 = 15.8;
		// if(d1 > 10.0 && d2 < 20.0) {
		// 	System.out.println(d1 + d2);
		// }

		// 3.
		// int n = 10;
		// int n2 = 20;
		// int sum = n + n2;
		// if(sum %3 == 0 && sum % 5 == 0) {
		// 	System.out.println(sum + "ÄÜ±»3ÓÖÄÜ±»5Õû³ý");
		// }
		// else {
		    // 	System.out.println(sum + "²»ÄÜ±»3ÓÖÄÜ±»5Õû³ý");
		// }

		// 4.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÄê·Ý£º");
		// int year = sc.nextInt();
		// if((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0 )) {
		// 	System.out.println(year + "ÄêÊÇÈòÄê");
		// }
		// else {
		// 	System.out.println(year + "Äê²»ÊÇÊÇÈòÄê");
		// }

		// 5.
		// ¶¨ÒåÈý¸ö±äÁ¿½ÓÊÕÔÂ·Ý¡¢ÄêÁäºÍÆ±¼Û£¬
		// ¸ù¾ÝÔÂ·ÝÅÐ¶Ïµ­Íú¼¾£¬×îºó¸ù¾ÝÄêÁäÅÐ¶ÏÆ±¼Û
		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÔÂ·Ý £º ");
		// int month = sc.nextInt();
		// int price = 60;
		// if(month >= 1 && month <= 12) {
		// 	System.out.println("ÇëÊäÈëÄãµÄÄêÁä£º");
		// 	int age = sc.nextInt();
		// 	if(month >= 4 && month <= 10) {
				
		// 		if(age > 60) {
		// 			price /= 3;
		// 		}
		// 		else if(age < 18) {
		// 			price /= 2;
		// 		}
		// 	}
		// 	else {
		// 		price = 40;
		// 		if(age > 60 || age < 18) {
		// 			price = 20;
		// 		}
		// 	}
		// 	System.out.println("Æ±¼ÛÎª£º" + price);
		// }
		// else {
		// 	System.out.println("ÔÂ·ÝÊäÈë´íÎó");
		// }

		// 6.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÐ¡Ð´×ÖÄ¸ £º ");
		// char c = sc.next().charAt(0);
		// switch(c) {
		// 	case 'a' :
		// 		c = (char)(c - 32);
		// 		System.out.println("´óÐ´×ÖÄ¸Îª £º " + c);
		// 		break;
		// 	case 'b' :
		// 		c = (char)(c - 32);
		// 		System.out.println("´óÐ´×ÖÄ¸Îª £º " + c);
		// 		break;
		// 	case 'c' :
		// 		c = (char)(c - 32);
		// 		System.out.println("´óÐ´×ÖÄ¸Îª £º " + c);
		// 		break;
		// 	case 'd' :
		// 		c = (char)(c - 32);
		// 		System.out.println("´óÐ´×ÖÄ¸Îª £º " + c);
		// 		break;
		// 	case 'e' :
		// 		c = (char)(c - 32);
		// 		System.out.println("´óÐ´×ÖÄ¸Îª £º " + c);
		// 		break;
		// 	default : 
		// 		System.out.println("other");
		// }

		// 7.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÄãµÄ³É¼¨ £º ");
		// int score = sc.nextInt();
		// if(score <= 100 && score >= 0) {
		// 	switch(score / 10) {
		// 		case 6: 
		// 		case 7: 
		// 		case 8: 
		// 		case 9: 
		// 		case 10:  System.out.println("ºÏ¸ñ");
		// 			break;
		// 		default :
		// 			System.out.println("²»ºÏ¸ñ£¬³É¼¨Îª" + score + "/60");

		// 	}
		// }
		// else {
		// 	System.out.println("ÊäÈë³É¼¨´íÎó£¬ÇëÊäÈë0~100");
		// }

		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÄãµÄ³É¼¨ £º ");
		// double score = sc.nextDouble();
		// if(score >= 0 && score <= 100 ) {
		// 	switch((int)(score / 60)) {
		// 		case 1:  System.out.println("ºÏ¸ñ");
		// 			break;
		// 		default :
		// 			System.out.println("²»ºÏ¸ñ");
		// 	}
		// }
		// else {
		// 	System.out.println("ÊäÈë³É¼¨´íÎó£¬ÇëÊäÈë0~100");
		// }

		// 8. 
		// Scanner sc = new Scanner(System.in);
		// System.out.println("ÇëÊäÈëÔÂ·Ý £º ");
		// int month = sc.nextInt();
		// switch(month) {
		// 	case 3 :
		// 	case 4 :
		// 	case 5 : System.out.println("´º¼¾");
		// 		break;
		// 	case 6 :
		// 	case 7 :
		// 	case 8 : System.out.println("ÏÄ¼¾");
		// 		break;
		// 	case 9 : 
		// 	case 10 : 
		// 	case 11 : System.out.println("Çï¼¾");
		// 		break;
		// 	case 12 :
		// 	case 1 :
		// 	case 2 : System.out.println("¶¬¼¾");
		// 		break;
		// 	default : 
		// 		System.out.println("ÔÂ·ÝÊäÈë´íÎó");
		// }

		// 1.
		// int count = 0,sum = 0;
		// for(int i = 1 ; i < 100 ; i++) {
		// 	if(i % 9 == 0) {
		// 		System.out.println(i);
		// 		count++;
		// 	}
		// }
		// System.out.println("1~100ÖÐ£¬9µÄÕûÊý±¶ÓÐ" +count + "¸öÊý");
		// System.out.println("1~100ÖÐ£¬9µÄÕûÊý±¶×ÜºÍÎª" + sum );

		// »¯·±Îª¼ò £º 1.ÏÈÊä³ö1~100£» 2.Êä³ö9µÄ±¶Êý; 3.Í³¼ÆÐÅÏ¢
		// int count = 0;
		// int sum = 0;
		// for(int i = 9; i <= 100; i += 9) {
		// 	// System.out.println(i);
		// 		System.out.println(i);
		// 		count++;
		// 		sum += i;
		// }
		// System.out.println("1~100ÖÐ£¬9µÄÕûÊý±¶ÓÐ" +count + "¸öÊý");
		// System.out.println("1~100ÖÐ£¬9µÄÕûÊý±¶×ÜºÍÎª" + sum );
		// ÏÈËÀºó»î £º
		// 1.±äÁ¿¶¨Òå·¶Î§ºÍÐèÇó£¬²»ÔÙ¶¨ËÀ
		// int count = 0 ,sum = 0;
		// int start = 1;
		// int end = 100;
		// int t = 5 ;
		// for(int i = start ; i < end ; i++) {
		// 	if(i % t == 0) {
		// 		System.out.println(i);
		// 		count++;
		// 	}
		// }
		// System.out.println("count = " +count );
		// System.out.println("sum = " + sum );
		
		// 2.

		// for(int i = 0,j = 5; i <= 5; i++,j--) {
		// 	System.out.println(i + " + " + j + " = " + (i + j));
		// }
		// »¯·±Îª¼ò £º 1.Êä³ö0 ~ 5£»ÁË½âµ½ºóÃæÊý×ÖµÄ¹ØÏµ
		// ÏÈËÀºó»î
		// int n = 9;
		// for(int i = 0; i <= n; i++) {
		// 	System.out.println(i + "+" + (n - i) + "= " + n );
		// } 

		// 3.
		// int start = 1;
		// int end = 100;
		// int i = start;
		// int t = 3;
		// while(i <= end) {
		// 	if(i % t == 0) {
		// 		System.out.println(i);
		// 	}
		// 	i++;
		// }

		//4. 
		// int start = 40;
		// int end = 200;
		// int i = start;
		// int t = 2;
		// while(i <= end) {
		// 	if(i % t == 0) {
		// 		System.out.println(i);
		// 	}
		// 	i++;
		// }

		// 5.
		// int start = 1;
		// int end = 100;
		// int i = start;
		// int sum = 0;
		// do{
		// 	System.out.println(i);
		// 	sum += i;
		// 	i++;
		// }while(i <= end);
		// System.out.println(sum);

		// 6.
		// int start = 1;
		// int end = 200;
		// int i = start;
		// int count = 0;
		// int t = 5;
		// int f = 3;
		// do{
		// 	if(i % t == 0 && i % f !=0) {
		// 		count++;
		// 	}
		// 	i++;
		// }while(i <= end);
		// System.out.println(count);

		// 7.
		// Scanner sc = new Scanner(System.in);
		// char a = 'n';
		// do {
			
		// 	System.out.println("ÀÏº«ÎÊ£º»¹Ç®Âð£¿(y/n)");
		// 	System.out.println("ÀîÈýËµ £º");
		// 	a = sc.next().charAt(0);
		// 	if(a != 'y') {
		// 		System.out.println("ÀÏº«´ò³öÎåÁ¬±Þ");
		// 	}
		// }while(a != 'y');

		// for(int i = 0; i < 2; i++) {
		// 	for(int j = 0; j < 3; j++) {
		// 		System.out.println("i = " + i + " j = " + j);
		// 	}
		// }

		// 1. 
		// double allAvg = 0;
		// int count = 0;
		// int classes = 3;
		// int student = 5;
		// Scanner sc = new Scanner(System.in);
		// for(int i = 1; i <= classes; i++) {
		// 	double sum = 0;
		// 	for(int j = 1; j <= student; j++) {
		// 		double score = sc.nextDouble();
		// 		if(score >= 60.0) {
		// 			count++;
		// 		}
		// 		sum += score;
		// 	}
		// 	allAvg += sum  / 5;
		// 	System.out.println(i + "°àµÄÆ½¾ù³É¼¨Îª £º " +( sum / student));
		// }
		// System.out.println("ËùÓÐ°à¼¶µÄÆ½¾ù·ÖÎª £º " +( allAvg / classes));
		// System.out.println("Èý¸ö°à¼¶ÖÐ£¬¼°¸ñµÄÈËÊýÎª £º " + count);

		// 2.
		// for(int i = 1; i <= 9; i++) {
		// 	for(int j = 1; j <= i; j++) {
		// 		System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		// 	}
		// 	System.out.print("\n");
		// }

		
	}
}   