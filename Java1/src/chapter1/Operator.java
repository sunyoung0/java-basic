package chapter1;

public class Operator {

	public static void main(String[] args) {
		// 연산자 
		// 수학적 연산을 하는 산술연산자
		// 변수에 데이터를 할당하는 대입연산자
		// 데이터를 비교하는 비교연산자
		// 논리값을 조합하는 논리연산자
		// 논리 표현식에 따라 다른 결과를 반환하는 삼항연산자
		
		// 1. 산술 연산자 - 산술 연산 결과를 반환하는 연산자
		// +, -, *, /, %, ++, -- 연산자가 존재함
		int number1 = 8, number2 = 3; //같은 데이터 타입일 경우 , 찍고 선언, 초기화 가능하지만 가독성이 떨어짐
		
		// + (더하기 연산자) : 좌항에 우항을 더한 값을 반환, 문자열을 연결할 때 사용됨
		int sum = number1 + number2;
		System.out.println(sum);
		
		// - (뺄셈 연산자) : 좌항에 우항을 뺀 값을 반환
		int diff = number1 - number2;
		System.out.println(diff);
		
		// * (곱셈 연산자) : 좌항에 우항을 곱한 값을 반환
		int product = number1 * number2;
		System.out.println(product);
		
		// / (나눗셈 연산자) : 좌항에 우항을 나눈 값을 반환
		// 정수 / 정수 = 정수 (실수부를 버린) 
		int div = number1 / number2;
		System.out.println(div);
		
		// 좌항과 우항 중에 하나라도 실수이면 실수가 반환 
		double div2 = number1 / (double)number2;
		System.out.println(div2);
		
		// % (나머지 연산자) : 좌항에 우항을 나눈 나머지 값을 반환
		int remainder = number1 / number2;
		System.out.println(remainder);
	
		// 증감 연산자 : 단항연산자,  변수에만 사용 가능, 피연산자에 대한 연산자의 위치에 따라 연산 순서가 다름
		// ++ (증가 연산자) : 피연산자(변수)를 1 증가 시킴
		
		
		// final int NUMBER1 = 8; 	상수는 증가 할 수 없음 
		// NUMBER1++;
		// 8++;
		
		System.out.println(number1++);
		System.out.println(number1);
		System.out.println(++number1);
		
		// -- (감소 연산자) : 피연산자(변수)를 1 감소 시킴
		System.out.println(number1--);
		System.out.println(--number1);
	
		System.out.println("====================================");
		
		// 2. 대입 연산자 
		// 좌항(변수)에 값을 할당하는 데 사용하는 연산자
		// 이항 연산자이지만 연산의 결과가 따로 존재하진 않음
		// 좌항은 반드시 변수이어야 함
		
		// 일반 대입 연산자 (=) : 좌항(변수)에 우항의 연산 결과를 대입
		int number3 = 10;
		
		// 복합 대입 연산자 : 특정 연산 수행 결과를 좌항에 다시 할당함
		// +=, -=, *=, /=, %= 등이 존재함 
		
		// += : 좌항에 우항을 더한 값을 좌항에 대입 (좌항 = 좌항 + 우항)
		number3 += 3; 	// number3 = number3 + 3;
		System.out.println(number3);
		
		// -= : 좌항에 우항을 뺀 값을 좌항에 대입 (좌항 = 좌항 - 우항)
		number3 -= 9;
		System.out.println(number3);
		
		// *= : 좌항에 우항을 곱한 값을 좌항에 대입 (좌항 = 좌항 * 우항)
		number3 *= 2;
		System.out.println(number3);
				
		// /= : 좌항에 우항을 나눈 값을 좌항에 대입 (좌항 = 좌항 / 우항)
		number3 /= 3;
		System.out.println(number3);
				
		// %= : 좌항에 우항을 나눈 나머지 값을 좌항에 대입 (좌항 = 좌항 % 우항)
		number3 %= 2;
		System.out.println(number3);
				
		System.out.println("====================================");
		
		// 비교 연산자
		// 좌항과 우항을 비교하고 그 비교 연산의 결과를 논리 값으로 반환
		int number4 = 4;
		int number5 = 5;
		// == (동등 비교 연산자) : 좌항이 우항과 같은지를 비교, 같으면 true 아니면 false
		boolean result = number4 == number5;
		System.out.println(result);
		
		// != (부등 비교 연산자) : 좌항이 우항과 다른지를 비교, 다르면 true 아니면 false 
		result = number4 != number5;
		System.out.println(result);
		
		// > (크다 비교 연산자) : 좌항이 우항보다 큰지 비교, 크다면 true 아니면 false
		result = number4 > number5;
		System.out.println(result);
		
		// < (작다 비교 연산자) : 좌항이 우항보다 작은지 비교, 작다면 true 아니면 false
		result = number4 < number5;
		System.out.println(result);
		
		// >= (크거나 같다 비교 연산자) : 좌항이 우항보다 크거나 같은지 비교, 크거나 같다면 true 아니면 false
		result = number4 >= number5;
		System.out.println(result);
		
		// <= (작거나 같다 비교 연산자) : 좌항이 우항보다 작거나 같은지 비교, 작거나 같다면 true 아니면 false
		result = number4 <= number5;
		System.out.println(result);
		
		System.out.println("====================================");
		
		// 논리 연산자 
		// 논리 표현식을 조작하는데 사용하는 연산자
		// 논리값을 조합하거나 반전을 시킴
		
		// && (논리 AND 연산자) : 좌항과 우항의 표현식이 모두 true일 때 true를 반환
		boolean trueFlag = true;
		boolean falseFlag = false;
		
		result = trueFlag && trueFlag;
		System.out.println(result);
		
		result = trueFlag && falseFlag;
		System.out.println(result);
		
		int tmpNumber =1;
		
		// AND 연산일 경우 fasle값이 오고 && 오면 그 뒤의 식(값)을 확인하지 않음
		result = falseFlag && (++tmpNumber > 0);
		System.out.println("tmpNumber : "  + tmpNumber); 	// 여기서 tmpNumber가 2가 되야하지만 그대로 1임
		
		// || (논리 OR 연산자) : 좌항과 우항 중 하나라도 true이면 true를 반환
		result = trueFlag || trueFlag;
		System.out.println(result);
		
		result = falseFlag || trueFlag;
		System.out.println(result);
		
		result = falseFlag || falseFlag;
		System.out.println(result);
		
		// OR 연산일 경우 true값이 오고 || 오면 그 뒤의 식(값)을 확인하지 않음
		result = trueFlag || (++tmpNumber < 0);
		System.out.println("tmpNumber : " + tmpNumber);
		
		// ! (논리 NOT 연산자) : 우항의 논리 값을 반전 시킴, true면 false, false면 true를 반환 
		result = !trueFlag;
		System.out.println(result);
		
		System.out.println("====================================");
		
		// 삼항 연산자 
		// 피연산자가 세 개인 연산자
		// 특정 조건에 따라 반환되는 결과가 다른 연산자 
		// 논리 표현식 ? true일 때 반환될 연산 결과 : false일 때 반환될 연산 결과 
		int score = 100;
		String grade = 
					score > 90 ? "A" : 
					score > 80 ? "B" : 
					score > 70 ? "C" :
					score > 60 ? "D" : "F";
		System.out.println(grade);
		
		
	}

}
