package chapter3;

// 인터페이스
// 구현해야하는 기능에 대한 명세를 하는 타입
// 추상메서드와 정적 변수로 구성이 되어있음
// 인터페이스의 경우 클래스에서 구현하여 사용할 수 있음
// 클래스의 확장과 다르게 다중 구현을 실현할 수 있음

// 인터페이스 선언 방법
// 접근제어자 interface 인터페이스명 { }
interface Mathematical {
	
	// 인터페이스에는 public static final의 상수형의 변수만 가질 수 있음
	public static final double PIE = 3.14;
	
	// 인터페이스에는 public abstract의 추상 메서드만 가질 수 있음 
	public abstract double plus(double a, double b);
	
}

interface FourFundamentalArithmetic {
	
	public abstract double plus(double a, double b);
	public abstract double minus(double a, double b);
	
}

// 인터페이스를 확장하여 새로운 인터페이스를 만들 때는 extends를 사용
// 인터페이스의 경우 두개 이상의 다중 상속이 가능
interface Statistic extends Mathematical, FourFundamentalArithmetic {
	
	public abstract double getAverage(double[] doubleArray);
	
}

// 인터페이스 구현
// 구현할 클래스에서 implements 키워드를 사용하여 인터페이스를 구현할 수 있음
// 일반적으로 특정 인터페이스를 구현한 클래스의 이름은 
// '인터페이스명Impl', '인터페이스명Implement' 
// 클래스에서 인터페이스를 구현할 때는 다중 구현이 가능 
class MathematicalImplement implements Mathematical, FourFundamentalArithmetic {

	@Override
	public double plus(double a, double b) {
		double result = a + b;
		return result;
	}

	@Override
	public double minus(double a, double b) {
		double result = a - b;
		return result;
	}
	
}

public class Oop7 {

	public static void main(String[] args) {
		
	}

}
