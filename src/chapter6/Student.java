package chapter6;

public class Student {
	
	private static int serialNum = 10000; //바꾸면 안되서 private으로 선언
	
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	public static int getSerialNum() { //static 메서드에서는 인스터스 변수를 사용할 수 없다.
		int i = 10; // 이건 지역변수 사용가능
		
		i++;
		System.out.println(i);
		
		//studentName = "홍길동"; // 멤버변수, 인스턴스 변수 *생성되지도 않은 인스턴스 변수를 사용하게 되는 것임으로 오류가 남.
		return serialNum; // static 변수, 클래스 변수
		
	}
}
