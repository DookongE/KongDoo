package Apple;
import java.util.Scanner;

public class math {
	public static void main(String[]args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		n = sc.nextInt();
		int same = n;
		
		for(int i = 1; i <= same; i++) {
			 sum += n--;
			 System.out.println("�� ���� " + sum + " �Դϴ�.");
		}
		sc.close();
	}
}
