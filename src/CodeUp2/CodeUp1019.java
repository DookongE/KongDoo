package CodeUp2;
import java.util.Scanner;

public class CodeUp1019 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년을 입력하세요: ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		int day = sc.nextInt();
		System.out.println(year + "." + month + "." + day);
		sc.close();
	}
}
