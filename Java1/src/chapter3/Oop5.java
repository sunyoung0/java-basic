package chapter3;

// 일반 제어자
// final : 한번 할당된 데이터에 대해서 변경을 불가능하게 하는 제어자
// 클래스, 메서드, 변수에서 사용 가능
final class SuperFinalClass {
	String instanceVariable;
}

// final로 선언된 class는 확장할 수 없음
class SubFinalClass extends SuperFinalClass {
	String extendVariable;
}

class SuperClass {
	
	final void superMethod() {
		System.out.println("슈퍼 메서드");
	}
	
	public void publicMethod() {
		System.out.println("퍼블릭 메서드");
	}
	
	void defaultMethod() {
		System.out.println("디폴트 메서드");
	}
	
}

class subClass extends SuperClass {
	
	final String finalVariable = "final";
	
	// final로 선언된 method의 경우 override 할 수 없음
	@Override
	void superMethod() {
		System.out.println("서브 메서드");
	}
	
	void setFinalVariable(String finalVariable) {
		// final로 선언된 변수의 경우 값을 재할당할 수 없음 
		this.finalVariable = finalVariable;
	}
	
	// 메서드를 오버라이드할 때는 접근 제어자를 좁은 범위로 변경할 수 없음 
	@Override
	private void publicMethod() {
		System.out.println("프라이빗 메서드");
	}
	
	// 메서드를 오버라이드할 때는 접근 제어자를 넓은 범위로 변경할 수 있음
	@Override
	public void defaultMethod() {
		System.out.println("퍼블릭  메서드");
	}
	
}

// static : 해당 멤버(필드 / 메서드)를 JVM의 메서드 영역에 할당하여 모든 곳에서 사용이 가능하도록 하는 제어자
// 클래스로 해당 멤버를 접근 할 수 있도록 함
// 메서드, 변수에서 사용 가능
class StaticClass {
	
	static String staticVariable;
	
	static void setStaticVariable(String arg) {
		staticVariable = arg;
	}
	
}


public class Oop5 {

	public static void main(String[] args) {
		// static으로 선언된 변수 혹은 메서드는 클래스 자체로 접근할 수 있음 
		StaticClass.setStaticVariable("static");
		System.out.println(StaticClass.staticVariable);
	}

}
