package basicPractice;

import java.util.Scanner;

public class CurrencyExchange02 {

	public static void main(String[] args) {
		// 실제는 달러 - 1307.5가 하나의 그룹인데 하나는 String 하나는 int라서 타입이 달라서 배열로 다룰 수 없음 
		// 구조체인 class로 다룰 수 있음
		
		// 메서드 안에 적은것은 지역변수 
		final String[] MONETARY_UNIT_LIST = {"달러", "엔", "위안"};
		final double[] EXCHANGE_RATE_LIST = {1307.5, 9.32, 183.78};
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("화폐 단위를 입력하세요.('종료' 입력 시 프로그램 종료)");
			
			String inputMonetaryUnit = scanner.nextLine();
			//입력값에 대한 검증처리 
			if(inputMonetaryUnit.equals("종료")) break;
			
			// 없는 값을 찾을 때 이용
			boolean existedMonetaryUnit = false;
			
//			for(String monetaryUnit : MONETARY_UNIT_LIST) {
//				if(monetaryUnit.equals(inputMonetaryUnit)) {
//					existedMonetaryUnit = true;
//					break; // 반복문은 최소한으로 돌릴 수 있게
//				}
//			}
			
			// 선언 및 초기화하는 부분을 밖으로 뺄 수 있음 
			int index = 0;
			for(; index < MONETARY_UNIT_LIST.length; index++) {
				if(MONETARY_UNIT_LIST[index].equals(inputMonetaryUnit)) {
					existedMonetaryUnit = true;
					break;
				}
			}
						
			if(!existedMonetaryUnit) {
				System.out.println("잘못된 화폐단위입니다.");
				continue;
			}
			
			System.out.println("금액을 입력하세요. (금액은 0보다 큰 정수이어야합니다.)");
			int inputAmount = scanner.nextInt();
			if(inputAmount <=0) {
				System.out.println("금액은 0보다 커야합니다.");
				continue;
			}
			
			double resultAmount = inputAmount * EXCHANGE_RATE_LIST[index];
			
			System.out.println(resultAmount + "원");
			
			scanner.close();			
		}
		
		System.out.println("프로그램 종료!!");
		
	}

}
