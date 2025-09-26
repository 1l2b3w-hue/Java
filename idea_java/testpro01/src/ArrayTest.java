import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Person person = new Person();
        int a = 20;
        int[] arr = {2, 3, 7, 1, 5, 8, 6, 9, 4};
        MyTool tool = new MyTool();
        tool.array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

// 这里使用run一个程序时，会先编译成class文件再运行
//原码文件存放在src中，class文件存放在out中
class MyTool {

    public void array(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }

    }

}

class Person {
    String name;
    int age;

}
