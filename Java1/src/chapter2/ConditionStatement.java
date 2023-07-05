package chapter2;

public class ConditionStatement {

	public static void main(String[] args) {
		// 조건문
		// 주어진 조건에 따라 실행할 코드 블럭을 결정하는 것
		
		// if 문
		// 주어진 논리 표현식이 true이면 if문 뒤의 코드 블럭을 실행
		// if(논리표현식){코드블럭}
		// 코드가 한줄이면 {} 굳이 안써도 됨 
		int age = 13;
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		// else 문
		// if문의 조건이 거짓일 경우 실행되는 코드 블럭을 지정 
		// else문은 단독으로 사용이 불가능
		if(age > 19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
		
		System.out.println("프로그램 종료");
	
		int score = 65;
	
		if(score >= 0) {
			if(score <= 100) {
				if(score > 90) {
					System.out.println("A");
				}else {
					if(score > 80) {
						System.out.println("B");
					}else {
						if(score > 70) {
							System.out.println("C");
						}else {
							if(score >60) {
								System.out.println("D");
							}else {
								System.out.println("F");
							}
						}
					}
				}
			}else {
				System.out.println("점수는 100을 넘을 수 없습니다.");
			}
		}else {
			System.out.println("점수는 양수이여야 합니다.");
		}
		
		////////////////////////////////////////////
		if(score < 0) {
			System.out.println("점수는 양수이여야 합니다.");
			return; 	// 메인 메서드 강제 종료
		}
		if(score > 100) {
			System.out.println("점수는 100을 넘을 수 없습니다.");
			return;
		}
		
		if(score > 90) System.out.println("A");
		else if(score > 80) System.out.println("B");
		else if(score > 70) System.out.println("C");
		else if(score > 60) System.out.println("D");
		else System.out.println("F");
	
		// switch 문
		// 조건에 부합하는 값에 따라서 실행할 코드의 범위를 지정
		// switch(표현식 | 변수){
		// 		case 값 : 
		//     	실행코드 
		//	   	case 값 : 
		//     	실행코드 
		//		default :
		//		실행코드
		// }
		
		// 표현식 | 변수에 해당하는 case의 값을 찾아서 해당 지점부터 코드를 실행
		
		int today = 2;
		
		switch(today) {
		case 1 : 
			System.out.println("월요일");
		case 2 : 
			System.out.println("화요일");
		case 3 : 
			System.out.println("수요일");
			break;
		case 4 : 
			System.out.println("목요일");
		case 5 : 
			System.out.println("금요일");
		default : 
			System.out.println("주말");
		}
		
		
	}

}
