package chapter1;

public class Variable {

	public static void main(String[] args) {
		// 변수 
		// 데이터를 저장하는 메모리 공간 
		// 메모리에 공간을 할당하는 행위를 '변수를 선언한다' 라고 함.
		// 할당한 메모리 공간에 데이터를 저장하는 행위를 '변수를 초기화한다' 라고 함.
		
		// 변수 선언 방법
		// 데이터타입 변수명;
		int number;
		
		// 변수 초기화 방법
		// 변수명 = 데이터;
		number = 99;

		// 모든 변수는 사용하기 전에 필수로 초기화 작업이 이루어져야함.
		System.out.println(number);
		
		// 변수 선언과 동시에 초기화하는 방법
		double pie = 3.14;
		
		// 주의점
		// 1. 동일한 변수명으로 중복 선언이 불가능함
		// int number = 20;
		 
		// 2. 변수명에 특수문자 사용이 불가능함($, _ 을 제외)
		// int num!;
		
		// 3. 변수명의 첫글자는 숫자가 올 수 없음
		// int 1number;
		
		// 4. 변수명은 대소문자를 구분함
		// int Number;
		// int NUmber;
		
		// 명명 규칙 
		// 1. Camel Case : 
		// 띄어쓰기 위치를 표현하기 위해 뒤에 오는 단어의 첫글자를 대문자로 표기 
		// 예) java language -> javaLanguage
		
		// 1-1. lowerCamelCase : 첫 글자를 무조건 소문자로 시작하는 것 
		// 1-2. UpperCamelCase : 첫 글자를 무조건 대문자로 시작하는 것 
		
		// 2. Snake Case :
		// 띄어쓰기 위치를 표현하기 위해 _를 사용해서 표기 
		// 예) java language -> java_language
		
		// 2-1. lower_snake_case : 모든 문자를 소문자로 표기하는 것
		// 2-2. UPPER_SNAKE_CASE : 모든 문자를 대문자로 표기하는 것 
		
		// 변수의 명명규칙은 lowerCamelCase를 따름 
		
		// lowerCamelCase - 변수, 메서드
		// UpperCamelCase - 클래스, 인터페이스 
		// lower_snake_case - 안쓰임(종종 javascript에서 변수명명 규칙으로 사용됨) 
		// UPPER_SNAKE_CASE - 상수 
		
		// 상수 
		// 한번 초기화하면 변경할 수 없는 변수
		// final 키워드를 사용
		
		// 선언 방법 
		// final 데이터타입 상수명;
		final int NUMBER;
		
		//초기화 방법
		NUMBER = 100;
		// NUMBER = 101;
		
		// 선언과 동시에 초기화
		final double PIE = 3.14;
		
		int size = 412 * 915;
		
		int GALAXY_S20_WIDTH = 412;
		int GALAXY_S20_HEIGHT = 915;
		
		int size2 = GALAXY_S20_WIDTH * GALAXY_S20_HEIGHT;
		
		
	}

}
