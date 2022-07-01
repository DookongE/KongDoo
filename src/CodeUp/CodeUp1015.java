package CodeUp;
import java.util.Scanner;

public class CodeUp1015 {
	public static void main(String[]args) {
		System.out.println("실수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.println(String.format("%.2f", a));
		sc.close();
	}
}
