package ifexample;

public class Switchcase {
	public static void main(String[] args) {
		int ranking = 1;
		String medaColor;
		
		switch(ranking) {
			case 1: medaColor = "G";
					break;
			case 2: medaColor = "S";
					break;
			case 3: medaColor = "B";
					break;
			default: 
					medaColor = "A";
					
		}
		System.out.println(ranking + "�� �޴��� ������ " + medaColor + "�Դϴ�.");
	}
}
