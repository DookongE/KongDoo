package CodeUp;
import java.util.Scanner;

public class CodeUp1020 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 앞자리 6자리를 입력하세요: ");
		int firstjumin = sc.nextInt();
		System.out.println(firstjumin+"-");
		System.out.print("주민번호 뒷자리 7자리를 입력하세요: ");
		int secondjumin = sc.nextInt();
		System.out.print(firstjumin+""+secondjumin);
		sc.close();
	}
}
