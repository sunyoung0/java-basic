package chapter1;

public class TypeCasting {

	public static void main(String[] args) {
		// 형변환
		// 특정 데이터 타입의 변수 값을 다른 데이터 타입으로 바꾸는 행위
		
		// 자동 형변환
		// 작은 데이터 타입의 변수를 큰 데이터 타입의 변수로 저장할 때
		// 자동으로 형 변환이 일어나는 것
		// 데이터 손실이 없음 
		short shortVariable1 = 100;
		int intVariable1 = shortVariable1;
		
		float floatVariable1 = 3.14F;
		double doubleVariable1 = floatVariable1;
		
		doubleVariable1 = intVariable1;
		
		// char charVariable1 = shortVariable1;
		
		// 강제 형변환
		// 큰 데이터 타입의 변수를 작은 데이터 타입의 변수로 저장할 때
		// 자동으로 형변환이 일어날 수 없기 때문에 명시적으로 형태를 변경해주는 것 
		// 작은데이터타입변수 = (작은데이터타입)큰데이터타입변수
		int intVariable2 = 1000;
		byte byteVariable1 = (byte)intVariable2;
		
		// 오버플로우 발생
		System.out.println(byteVariable1);
		
	}

}
