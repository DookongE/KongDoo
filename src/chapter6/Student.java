package chapter6;

public class Student {
	
	private static int serialNum = 10000; //�ٲٸ� �ȵǼ� private���� ����
	
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	public static int getSerialNum() { //static �޼��忡���� �ν��ͽ� ������ ����� �� ����.
		int i = 10; // �̰� �������� ��밡��
		
		i++;
		System.out.println(i);
		
		//studentName = "ȫ�浿"; // �������, �ν��Ͻ� ���� *���������� ���� �ν��Ͻ� ������ ����ϰ� �Ǵ� �������� ������ ��.
		return serialNum; // static ����, Ŭ���� ����
		
	}
}
