package CodeUp;
import java.util.Scanner;

public class CodeUp1014 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String a = sc.next();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		String b = sc.next();
		String temp = a;
		a = b;
		b = temp;
		System.out.println(a +","+ b);
		sc.close();
	}
}
