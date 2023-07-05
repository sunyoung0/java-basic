package basicPractice;

import java.util.Scanner;

// 사용자로부터 콘솔을 통해 환전하고자 하는 화폐단위를 입력받는다.
// 화폐단위를 입력받은 후 환전할 해당화폐 금액을 입력받는다.
// 해당하는 화폐단위 환율에 따라 환전된 원화 금액을 출력

// 단, 환전하고자 하는 화폐단위가 잘못 입력되면 '잘못된 화폐단위입니다.'를 출력하고 프로그램을 종료한다.
// 또한 환전 금액은 0이하의 수를 받을 수 없으며 정수만 입력받는다.

// 달러(1307.50), 10000 - 13075000
// 엔(9.32), 10000 - 93200
// 위안(183.78), 10000 - 1837800
public class CurrencyExchange01 {

	public static void main(String[] args) {
		
		final double DOLLAR_EXCHANGE_RATE = 1307.5;
		final double YEN_EXCHANGE_RATE = 9.32;
		final double YUAN_EXCHANGE_RATE = 183.78;
		
		
		// 1. 사용자로부터 콘솔창으로 화폐 단위와 해당 금액을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		
		// 1-1. 화폐 단위 입력
		String monetaryUnit = scanner.nextLine();
		if(!monetaryUnit.equals("달러") && 
		   !monetaryUnit.equals("엔") && 
		   !monetaryUnit.equals("위안")) {
		   System.out.println("잘못된 화폐단위입니다.");
		   return;
		}
		
		// 1-2. 화폐 금액 입력
		int inputAmount = scanner.nextInt();
		
		if(inputAmount <= 0) {
			System.out.println("금액은 0보다 커야합니다.");
			return;
		}
		
		// 2. 사용자가 입력한 화폐 단위를 확인
		double resultAmount = inputAmount * 
			   (monetaryUnit.equals("달러") ? DOLLAR_EXCHANGE_RATE :
				monetaryUnit.equals("엔") ? YEN_EXCHANGE_RATE : YUAN_EXCHANGE_RATE);
		
		System.out.println(resultAmount +"원");
		
	}

}
