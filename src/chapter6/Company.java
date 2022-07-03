//싱글톤 패턴 *이 방식은 사회에서도 많이 사용하고 있으니 잘 익혀두도록 하자!!
package chapter6;

public class Company {
	
	private static Company instance = new Company();
	
	private Company(){}
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
