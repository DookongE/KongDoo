package chapter8;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �ݴϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� �����ϴ�.");
	}
}
public class AnimalTest {
	public static void main(String[]  args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		Animal a = new Human();
	}
	
	public void moveAnimal(Animal animal) {
	animal.move();
}
	}