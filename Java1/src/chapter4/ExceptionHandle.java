package chapter4;

// 예외
// 프로그램이 실행 중에 발생하는 예상치 못한 상황
// 대부분의 경우 개발자의 실수나 입력에 대한 검증을 처리하지 않을 경우 발생 

// 언체크 예외, 체크 예외
// 언체크 예외 : 런타임 시점에서 확인 가능한 예외, 컴파일러가 예외처리를 강요하지 않음 
// 체크 예외 : 컴파일 시점에서 확인 가능한 예외, 컴파일러가 예외처리를 강요함 

// 에러의 종류
// 에러 : 개발자가 조취를 취할 수 없는 수준의 문제 (천재지변, 전원부족, 메모리부족, JVM 문제)
// 컴파일 에러 : 컴파일 문법을 준수하지 않았을 때 발생하는 문제 
// 런타임 에러 : 프로그램이 실행 중에 발생하는 문제 
// 로직 에러 : 실행은 되지만 의도하지 않은 결과가 나오는 문제 
// 예외 

public class ExceptionHandle {

	public static void main(String[] args) {

		// 1. NullPointerException : Null을 참조하는 변수로 작업을 할 때 발생 
		// String comment = null;
		// comment.equals("안녕하세요");
		
		// 2. ArrayIndexOutOfBoundsException : 배열의 인덱스 번위를 초과하는 접근을 할 때 발생 
		// int[] numbers = new int[] {1, 2, 3};
		// int number = numbers[3];
	
		// 3. ArithmeticException : 잘못된 수학 연산을 진행했을 때 발생
		// int result = 10 / 0;
		
		// 예외 처리
		// 1. try - catch - finally 구문 사용
		// try {예외가 발생할 가능성이 있는 코드 }
		// catch(예외1클래스명 참조변수){ 예외1이 발생했을 때의 처리하는 코드 }
		// catch(예외2클래스명 참조변수){ 예외2가 발생했을 때의 처리하는 코드 }
		// finally { 예외가 발생하든 안하든 실행되는 코드 }
		
		try {
			
			String comment = null;
			// comment.equals("안녕하세요");
		
			int number = 10 / 0;
		} catch (NullPointerException exception) {
			System.out.println("Null을 참조합니다.");
		} catch(ArithmeticException exception){
			System.out.println("잘못된 수학 연산입니다.");
		} finally {
			System.out.println("무조건 실행됩니다.");
		}
		
		///////////////////////////////////////////////////
		
		// 2. multi-catch 구문
		// try { 예외가 발생할 가능성이 있는 코드 }
		// catch (예외1클래스 | 예외2클래스 참조변수) {예외1 또는 예외2가 발생했을 때 실행할 코드}
		try {
			String comment = null;
			comment.equals("안녕하세요");
		} catch (NullPointerException | ArithmeticException exception) {
			System.out.println("동시에 처리하는 예외입니다.");
		}
		
		// 3. 다형성을 이용한 Exception 클래스 사용 
		try {
			String comment = null;
			comment.equals("안녕하세요");
		} catch (Exception exception) {
			// 발생한 예외의 메세지를 출력하는 구문
			exception.printStackTrace();
			System.out.println("모든 예외에 대한 처리");
		}
		
		
		// 4. 예외가 발생하지 않도록 미리 조건문 등을 이용해서 대처
		String comment = null;
		if(comment != null) comment.equals("안녕하세요");
		
		///////////////////////////////////////////////////
		System.out.println("프로그램 정상 종료");
		
		// 예외 던지기(예외 강제 발생)
		// throw new 예외클래스("메세지");
		try {
			throw new Exception("강제 발생");
		} catch (Exception exception) {
			exception.printStackTrace();
		}	
		
		// throws 키워드가 적용된 메서드를 호출할 때는 
		// 반드시 예외처리를 적용해줘야 함
		try {
			throwsException();
		} catch (Exception exception) {

		}
	}
	
	// throws 키워드
	// 해당 메서드에서 발생하는 예외를 호출부로 떠넘기는 키워드 
	private static void throwsException() throws Exception {
		
		String comment = null;
		comment.equals("안녕하세요");
		
	}
	
	
}
