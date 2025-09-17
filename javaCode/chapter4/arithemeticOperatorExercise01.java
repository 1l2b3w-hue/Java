public class arithemeticOperatorExercise01 {
			 
	public static void main(String[] args) {
		// int i = 1;
		// i = i++; //规则 ： 会创建一个临时变量temp = i；然后执行 i = i + 1,最后执行 i = temp
		// System.out.println(i);

		int i = 1;
		i = ++i; // 规则 ： 创建一个临时变量temp，先执行i = i + 1; 在执行 temp = i，最后就是 i =temp
		System.out.println(i);		
	}
}