package chapter6;

public class studentTest1 {
	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.serialNum);
		studentJ.serialNum++;
		
		
		Student studentT = new Student();
		
		System.out.println(studentJ.serialNum);
		System.out.println(studentT.serialNum);
	}		
}
