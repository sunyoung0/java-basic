package chapter3;

// 추상 클래스
// 추상 메서드가 포함되어 있는 클래스 
// 추상 메서드 : 선언부만 정의가 되어있고 구현부는 작성되지 않은 메서드 
// 추상 클래스로는 인스턴스를 생성할 수 없음, 반드시 추상 클래스를 확장해서 사용해야함
// 추상 클래스를 확장한 하위 클래스는 반드시 추상 메서드를 오버라이드 한 후 구현해야함 

// 추상 클래스를 선언하는 방법
// 접근제어자 abstract class 클래스명 { }
abstract class Animal {
	
	int legCount;
	boolean hasWing;
	
	Animal(int legCount, boolean hasWing){
		this.legCount = legCount;
		this.hasWing = hasWing;
	}
	
	// 추상 메서드를 선언하는 방법
	// 접근제어자 abstract 반환타입 메서드명 (파라미터);
	abstract void eat();
}

// 추상 클래스를 확장한 클래스는 추상 클래스에서 선언된 추상 메서드를 
// 반드시 오버라이드 하여 '구현' 해야 함
class Dog extends Animal {

	Dog(int legCount, boolean hasWing) {
		super(legCount, hasWing);
	}

	@Override
	void eat() {
		System.out.println("잡식입니다.");
	}
	
}

public class Oop6 {

	public static void main(String[] args) {
		
		// 추상 클래스로 선언된 클래스는 그 자체로 인스턴스를 생성할 수 없음 
		Animal animal = new Animal();
		Dog dog = new Dog(4, false);
		
		Animal dog2 = new Dog(4, false);
		
		dog.eat();
		
	}

}
