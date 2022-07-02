package CodeUp2;
import java.util.Scanner;

public class CodeUp1018 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시를 입력하세요: ");
		int time = sc.nextInt();
		System.out.print("분을 입력하세요: ");
		int min = sc.nextInt();
		System.out.println(time + ":" + min);
		sc.close();
	}
}
