package CodeUp;
import java.util.Scanner;

public class CodeUp1023 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수의 정수부분을 입력하세요: ");
		int num = sc.nextInt();
		System.out.println(num + ".");
		System.out.print("뒷자리를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println(num + "." +num1);
		System.out.println(num);
		System.out.println(num1);
		sc.close();
	}
}
