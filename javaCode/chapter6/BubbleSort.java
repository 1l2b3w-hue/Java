public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13,50,99,32,65};
		// int[] arr = {1,2,3,4,5,6,7,8,9};
		boolean flag = true;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 -i; j ++) {
				if(arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
					flag  = false;
				}
			}
			if(flag) {
				System.out.println("已经是一个从小到大的排序了，就不排了");
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}