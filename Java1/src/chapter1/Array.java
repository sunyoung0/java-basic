package chapter1;

// 배열
// '같은 타입'의 변수가 나열된 형태 
// 배열은 '생성'해서 사용한다 -> 생성해서 사용하는 변수 : 참조 변수 
// 생성은 new 연산자를 이용해서 생성할 수 있음
// 배열 (참조 변수)는 실제 데이터가 저장되는 것이 아니라
// 해당 그룹의 첫번째 메모리 주소가 저장됨

public class Array {

	public static void main(String[] args) {
		// 동일한 그룹의 데이터를 변수로 선언해서 사용할 때 
		int score1;
		int score2;
		int score3;
		int score4;
		int score5;
		
		// 배열 선언
		// 데이터타입[] 배열변수명;
		// 순서대로 나열되어 있는 형태
		int[] scores;
		
		// 배열 생성
		// 배열변수명 = new 데이터타입[길이];
		scores = new int[5];
		System.out.println(scores); 	// 메모리 주소 
		
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		scores[3] = 60;
		scores[4] = 50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		// 배열 길이
		System.out.println(scores.length);
		
		// 배열의 인덱스 범위를 벗어나는 접근을 시도할 때 
		// ArrayIndexOutOfBoundsException이 발생한다.
		// System.out.println(scores[scores.length]);
		// System.out.println(scores[-1]);
		
		// 문자열
		char [] apple = new char[5];
		apple[0] = 'a';
		apple[1] = 'p';
		apple[2] = 'p';
		apple[3] = 'l';
		apple[4] = 'e';
		
		System.out.println(apple);
		
		// 선언과 동시에 생성과 초기화
		char[] banana = new char[] {'b','a','n','a','n','a'};
		System.out.println(banana);
		
		char[] banana2 = {'b','a','n','a','n','a'};
		System.out.println(banana2);
		
		// String
		// 문자의 배열을 조금 더 쉽게 다룰 수 있도록 여러가지 메소드를
		// 포함하고 있는 참조형 데이터 타입
		// String 변수명 = "데이터";
		String carrot = "carrot";
		System.out.println(carrot);
		
		System.out.println("=================================");
		
		String stringVariable1 = new String("안녕하세요");
		System.out.println(stringVariable1);
		
		String stringVariable2 = stringVariable1;
		System.out.println(stringVariable2);
		
		stringVariable1 = new String("반갑습니다.");
		System.out.println(stringVariable1);
		System.out.println(stringVariable2);
		System.out.println("=================================");
		
		
		// String 클래스의 기능 
		// 1. 문자열 연결 - 문자열 + 문자열 / 문자열.concat(연결할 문자열);
		String identityNumber = "900101" + "-";
		System.out.println(identityNumber);
		identityNumber = identityNumber.concat("1122334");
		System.out.println(identityNumber);
		
		// 2. 문자열 비교 - 문자열.equals("비교할 문자열");
		boolean isEqual = identityNumber.equals("900101-1122334");
		System.out.println(isEqual);
		
		// 3. 문자열 길이 - 문자열.length();
		int stringLength = identityNumber.length();
		System.out.println(stringLength);
		
		// 4. 문자열 변환 - 
		// 문자열.toLowerCase(); - 전부 소문자
		// 문자열.toUpperCase(); - 전부 대문자
		String name = "John Doe";
		String lowerName = name.toLowerCase();
		String upperName = name.toUpperCase();
	
		System.out.println(name);
		System.out.println(lowerName);
		System.out.println(upperName);
		
		// 5. 문자 찾기 - 문자열.indexOf(찾을 문자); , 문자열.lastIndexOf(찾을문자);
		int hyphenIndex = identityNumber.indexOf("0");
		System.out.println(hyphenIndex);
		
		int zeroLastIndex = identityNumber.lastIndexOf("0");
		System.out.println(zeroLastIndex);
		
		// 6. 부분 문자열 - 문자열.substring(시작인덱스, 끝인덱스);
		String birthString = identityNumber.substring(0, 6);
		System.out.println(birthString);
		
		System.out.println("=================================");
		
		// 기본형 데이터 타입과 참조형 데이터 타입의 비교 
		// 기본형 데이터 타입은 직접 그 데이터를 가지고 있음
		// 참조형 데이터 타입은 데이터가 저장된 주소를 가지고 있음 
		int basicType1 = 10;
		int basicType2 = basicType1;
		
		System.out.println(basicType1);
		System.out.println(basicType2);
		
		basicType1 = 20;
		
		System.out.println(basicType1);
		System.out.println(basicType2);
		
		char[] refferenceType1 = new char[] {'a', 'b', 'c'};
		char[] refferenceType2 = refferenceType1;
		
		System.out.println(refferenceType1);
		System.out.println(refferenceType2);
		
		refferenceType1[0] = 'z';
		
		System.out.println(refferenceType1);
		System.out.println(refferenceType2);
	
		// 참조형 데이터 타입에서의 null;
		// null : 값이 지정되지 않았다, 참조하는 주소가 없다.
		String nullString = null;
		
		// null 이거나 생성하지 않은 참조형 변수를 사용하려하면 
		// nullPointerException이 발생함 
     	boolean nullEquals = nullString.equals("0");
		
	
	
	}
	
}
