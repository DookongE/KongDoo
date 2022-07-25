package Apple;

public class furit {
	public static void main (String[]args) {
		int pear  = 5;
		int apple = 6;
		int orange = 7;
		
		int total = pear + apple + orange;
		
		float hour = total/24f;
		System.out.println("과수원에서 하루에 생산되는 과일의 총 갯수는 " + total + " 개 입니다.");
		System.out.println("과수원에서 시간당 생산하는 과일의 갯수는 " + hour + " 개 입니다.");
	}
}

