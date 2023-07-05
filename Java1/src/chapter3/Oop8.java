package chapter3;

// 다형성
// 하나의 객체 혹은 기능을 다양한 형태로 표현하는 것
// 클래스의 확장, 인터페이스의 확장 및 구현을 통해서 이루어질 수 있음

// Java에서 다루는 다형성에는 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅
// 오버로딩 : 메서드를 하나의 이름으로 여러개 생성하는 것
// 오버라이딩 : 상위 클래스에 정의된 메서드를 재정의 하는 것 

// 업캐스팅 : 자손 클래스의 인스턴스를 부모 클래스의 참조 타입으로 변환 (자동)
// 다운 캐스팅 : 부모 클래스의 인스턴스를 자손 클래스의 참조 타입으로 변환 (명시)
class SmartPhone {
	String telNumber;
	boolean power;
}

class Galaxy extends SmartPhone implements Talk {
	String bixby;

	@Override
	public void voiceTalk(String to, String from) {
		System.out.println(from + "가 " + to + "에게 보이스톡을 시도합니다.");
	}

	@Override
	public void faceTalk(String to, String from) {
		System.out.println(from + "가 " + to + "에게 페이스톡을 시도합니다.");
	}
}

class IPhone extends SmartPhone implements Talk {
	int shiri;

	@Override
	public void voiceTalk(String to, String from) {
		System.out.println("보이스 톡을 호출합니다.");
	}

	@Override
	public void faceTalk(String to, String from) {
		System.out.println("페이스 톡을 호출합니다.");
	}
}

interface Talk {
	void voiceTalk(String to, String from);
	void faceTalk(String to, String from);
}
public class Oop8 {

	public static void main(String[] args) {
		Galaxy galaxy = new Galaxy();
		IPhone iPhone = new IPhone();
		
		System.out.println(galaxy);
		
		galaxy.bixby = "bixby";
		iPhone.shiri = 1;
		
		SmartPhone smartPhone = null;
		SmartPhone smartPhone2 = new SmartPhone();
		
		// 업캐스팅
		smartPhone = galaxy;
//		smartPhone.bixby = "b";
		System.out.println(smartPhone);
		
		smartPhone2 = iPhone;
//		smartPhone2.shiri = 1;
		
		// 다운캐스팅
		Galaxy galaxy2 = (Galaxy) smartPhone;
		IPhone iPhone2 = (IPhone) smartPhone2;
		
		System.out.println(galaxy2);
		System.out.println(galaxy2.bixby);
		System.out.println(iPhone2.shiri);
		
		// 인터페이스를 참조 타입으로 지정한 참조 변수는 
		// 해당 인터페이스를 구현한 클래스의 인스턴스를 받을 수 있음 
		Talk talk = new Galaxy();
		talk.faceTalk("010-1111-1111", "010-2222-2222");
	}

}
