package chapter4;

// Wrapper Class 
// 기본형 데이터 타입을 참조형 데이터 타입으로 다루고 싶을 때 사용할 수 있는 클래스 
// 기본형 데이터 타입의 데이터에 메서드를 포함해서 포장한 형태

// Wrapper Class의 종류
// byte -> Byte / short -> Short / int -> Integer / long -> Long 
// float -> Float / double -> Double / boolean -> Boolean / char -> Character

// 객체만을 요구하는 상황에서 기본형 데이터 타입을 사용하고 싶을 때 사용할 수 있음
// 기본형 데이터 타입을 변형하는 작업을 수행할 때 Wrapper Class에 포함된 메서드를 사용할 수 있음 

public class WrapperClass {

	public static void main(String[] args) {
		
		// 기본형 데이터 타입을 참조형 데이터 타입으로 변형
		Integer integer = new Integer(10);
		// 참조형 데이터 타입을 기본형 데이터 타입으로 변형 
		int nomalInteger = integer.intValue();
		
		// Java 1.9 부터 new WrappeClass 생성자는 Deprecated (사용하지 않음)으로 지정
		// Java 1.5 부터 오토박싱 / 오토언박싱을 제공
		integer = 20;				// 오토박싱
		nomalInteger = integer;		//오토언박싱
		
		// parse 메서드 
		// 외부로부터 입력을 받을 때 문자열로 숫자를 받는 경우가 있음 
		// 문자열로 숫자를 받을 경우 연산전에 해당 문자열을 숫자 타입으로 변형하기 위해 자주 사용됨
		String numberString = "9876";
		int stringNumber = Integer.parseInt(numberString);
		double stringDouble = Double.parseDouble(numberString);
		
		// toString 메서드
		// 숫자형태로 되어있는 데이터를 문자열로 변형해서 저장 혹은 출력할 때 자주 사용됨
		int stringInt = 10000;
		String intString = Integer.toString(stringInt);
		
	}

}
