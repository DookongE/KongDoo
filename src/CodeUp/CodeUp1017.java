package CodeUp;
import java.util.Scanner;

public class CodeUp1017 {
	public static void main(String[]args) {
		System.out.println("정수를 하나 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a +  " " + a + " " + a);
		sc.close();
	}
}
