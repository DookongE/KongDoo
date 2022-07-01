package CodeUp;
import java.util.Scanner;

public class CodeUp1014 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 문자를 입력하세요.");
		String a = sc.next();
		System.out.println("두번째 문자를 입력하세요.");
		String b = sc.next();
		String temp = a;
		a = b;
		b = temp;
		System.out.println(a +","+ b);
		sc.close();
	}
}
