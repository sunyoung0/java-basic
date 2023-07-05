package chapter3;

// 상속 
// 하나의 클래스가 다른 클래스의 속성과 메서드를 이어받는 것
// 상속해주는 클래스를 super class / parent class 라고 함 (상위, 부모, 조상 클래스)
// 상속받는 클래스를 sub / child class 라고 함 (하위, 자식, 자손 클래스)

// 상속을 통해 코드의 중복을 제거하여 유지 보수성을 향상 시킬 수 있음

// 상속을 하는 방법
// 접근제어자 class 자식클래스명 extends 부모클래스명 { 필드, ..., 메서드, ...}

class Human {
	String name;
	String address;
	String telNumber;
	
	// 생성자는 상속하지 못함 
	Human() {}
	
	Human(String name, String address, String telNumber) {
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		System.out.println("telNumber : " + telNumber);
	}
	
}

// 직업군에 관련된 클래스 3개
class Police extends Human {
	String classes;
	
	Police() { }
	
	Police(String name, String address, String telNumber, String classes) {
		// super()를 이용해서 부모 클래스의 생성자를 호출할 수 있음 
		super(name, address, telNumber);
		this.classes = classes;
	}
	
	void print() {
		// super 키워드를 통해서 부모 클래스를 지칭할 수 있음 
//		System.out.println("name : " + super.name);
//		System.out.println("address : " + super.address);
//		System.out.println("telNumber : " + super.telNumber);
		super.print();
		System.out.println("classes : " + this.classes);
	}
}

// class의 상속은 단일 상속만 지원함
// 다중 상속을 허용했을 때 발생가능한 다이아몬드 문제의 원인을 제거할 수 있음
// 다이아몬드 문제 : 두개 이상의 클래스를 상속했을 때 각 클래스가 동일한 이름의 속성 혹은
// 메서드를 가지고 있다면 어떤 속성 혹은 메서드를 호출할 지 모호해지는 문제 
//	class DutyPolice extends Police, Developer {
//		int periodMonth;
//	
//		void print() {
//			System.out.println("name : " + this.name);
//			System.out.println("address : " + this.address);
//			System.out.println("telNumber : " + this.telNumber);
//			System.out.println("classes : " + this.classes);
//		}
//	}

class Developer extends Human {
	String position;
	
	// 오버라이딩
	// 상위 메서드에 정의되어 있는 메서드를 재정의 하는 것
	// 오버라이딩을 통해서 코드의 중복 제거 / 메서드의 유연성을 확보할 수 있음
	// 또한 오버라이딩을 통해서 다형성을 구현할 수 있음
	
	// 오버라이딩의 조건
	// 메서드 이름, 반환타입, 매개변수의 타입 / 갯수 / 조합이 상위 클래스의 메서드와 같아야 함
	// 상위 클래스에서 final로 정의된 메서드는 오버라이딩할 수 없다 
	// 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드 보다 좁게 변경할 수 없다
	
	// @Override : 컴파일러한테 아래에 오는 메서드는 상위클래스의 메서드를 오버라이딩한 것이라고 알려주는 것 
	@Override
	void print() {
		System.out.println("name : " + this.name);
		System.out.println("address : " + this.address);
		System.out.println("telNumber : " + this.telNumber);
		System.out.println("position : " + this.position);
	}
}

class SalesMan extends Human {
	int salesAmount;
}

public class Oop3 {

	public static void main(String[] args) {
		
		Police police = new Police();
		police.address = "부산광역시";
		police.classes = "상경";
		
		Police otherPolice = new Police("Jhon", "부산광역시", "010-1111-1111", "상경");
		
		System.out.println(otherPolice.name);
		
		Developer developer = new Developer();
		developer.name = "Michle";
		developer.address = "서울특별시";
		developer.telNumber = "010-2222-2222";
		developer.position = "back-end";
		
		developer.print();
	}

}
