package Apple;
import java.util.Scanner;

public class math {
	public static void main(String[]args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요: ");
		n = sc.nextInt();
		int same = n;
		
		for(int i = 1; i <= same; i++) {
			 sum += n--;
			 System.out.println("총 합은 " + sum + " 입니다.");
		}
		sc.close();
	}
}
