package chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Generic 
// 클래스나 메서드에서 사용할 데이터 타입을 내부에서 지정하는 것이 아니라
// 외부에서 지정하도록 하는 기능
// 사용하는 이유 : 코드의 재사용성을 보장, 타입의 안정성을 보장
class PersonalInfo1 {
	private String name;
	private int age;
	private int weight;
	private int height;
}

class PersonalInfo2 {
	private String name;
	private int age;
	private double weight;
	private double height;
}

class PersonalInfo3 {
	private String name;
	private int age;
	private double weight;
	private int height;
}

class PersonalInfo4 {
	private String name;
	private int age;
	private int weight;
	private double height;
}

class PersonalInfo5 {
	String name;
	int age;
	Object weight;
	Object height;
}

// Generic Class
// 클래스에서 사용할 타입을 클래스 외부에서 받아오는 클래스 
// 선언 방법
// class 클래스명 <매개타입> { ... }
class PersonalInfo<W, H> {
	String name;
	int age;
	private W weight;
	H height;
	
	void setWeight(W weight) {
		this.weight = weight;
	}
	
	W getWeight() {
		return this.weight;
	}
}

// Generic Method
// 메서드에서 사용할 타입을 메서드 외부에서 받아오는 메서드
// 선언 방법 
// 제어자 <매개타입> 반환타입 메서드명(매개변수) { ... }
class Person {
	@Deprecated
	static <T> void method(T args) {
		
	}
}

// 타입 매개변수의 제한
// 기본적으로 타입 매개변수는 모든 참조 타입을 받을 수 있지만
// 타입 매개변수에 제한을 걸어서도 사용할 수 있다
// 이때 extends 키워드를 이용하여 해당 클래스 혹은 인터페이스를 확장 또는 구현한 클래스, 인터페이스만 받도록 할 수 있음
class Student<S extends Collection> {
	String name;
	String StudentNumber;
	String department;
	S scores;
}

public class GenericClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// 속성의 타입을 Object로 지정하여 코드 재사용성 향상
		PersonalInfo5 personalInfo5 = new PersonalInfo5();
		personalInfo5.weight = 10.1;
		personalInfo5.height = 10.15;
	
		// 두개의 타입이 달라서 변형이 안됨 에러
		// int weight = (Integer) personalInfo5.weight;
		
		// 속성 타입을 Generic으로 지정하여 코드의 재사용성 향상과 코드의 안정성 확보
		PersonalInfo<Double, Double> personalInfo = new PersonalInfo<>();
//		personalInfo.weight = 10.1;
//		int weight = personalInfo.weight;
		
		// Generic 메서드를 사용하여 어떠한 타입의 매개변수도 받을 수 있도록 지정 
		Person.method("String");
		Person.method(1);
		
		// 제한된 타입 매개변수를 사용하여 타입 매개변수의 상한선을 걸 수 있음
		Student<List<Integer>> student1 = new Student<>();
		
		// 와일드 카드를 이용한 Generic 사용 
		// extends : 하위인 애들만 받겠다
		PersonalInfo<? extends Object, Integer> personalInfoWild = new PersonalInfo<>();
		// super : 상위인 애들만 받겠다
		PersonalInfo<? super ArrayList, Integer> personalInfoWild2 = new PersonalInfo<>();
		

	}

}
