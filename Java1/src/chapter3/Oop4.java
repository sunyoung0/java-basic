package chapter3;

// 외부 패키지에 선언된 클래스를 사용하기 위해서는 import 키워드로
// 해당 클래스에 불러와야함
import chapter3etc.ExampleClass1;
// 접근 제어자
// 클래스의 필드와 메서드에 대한 접근을 제한하는 것

// public : 같은 프로젝트 내부의 모든 패키지에서 접근이 가능
// protected : 같은 패키지 내부의 모든 클래스에서 접근이 가능하고 해당 클래스를 상속받은 다른 패키지의 클래스에서 접근이 가능 
// default (지정하지 않음) : 같은 패키지 내부의 모든 클래스에서 접근이 가능
// private : 같은 클래스 내부에서만 접근이 가능
public class Oop4 {

	public static void main(String[] args) {
		
		ExampleClass1 exampleClass1 = new ExampleClass1();
		ExampleClass2 exampleClass2 = new ExampleClass2();
		
		User user = new User("Jhon", 20, "email@email.com");
		
		// chapter3etc 패키지에 선언된 ExampleClass1의 publicVariable 필드는
		// 접근 제어자가 public이기 때문에 어떤 패키지에서도 접근이 가능
		exampleClass1.publicVariable = "public";
		
		// chapter3etc 패키지에 선언된 ExampleClass1의 protectedVariable 필드는
		// 접근 제어자가 protected이기 때문에 외부 패키지에서 접근이 불가능
		exampleClass1.protectedVariable = "protected";
		exampleClass2.protectedVariable = "protected";
		
		// 같은 패키지에 선언된 ExampleClass2의 protectedVariable2 필드는
		// 접근 제어자가 protected이기 때문에 접근이 가능
		exampleClass2.protectedVariable2 = "protected";
		
		// chapter3etc 패키지에 선언된 ExampleClass1의 defaultvariable 필드는
		// 접근 제어자가 default이기 때문에 외부 패키지에서는 접근이 불가능
		exampleClass1.defaultVariable = "default";
		exampleClass2.defaultVariable = "default";
	
		// 같은 클래스에 선언된 Example2의 defaultVariable2 필드는
		// 접근 제어자가 default이기 때문에 접근이 가능
		exampleClass2.defaultVariable2 = "default";
	
		// chapter3etc 패키지에 선언된 ExampleClass1의 privateVariable 필드는
		// 접근 제어자가 private이기 때문에 외부 클래스에서는 접근이 불가능
		exampleClass1.privateVariable = "private";
		exampleClass2.privateVariable = "private";
		
		// 같은 패키지에 선언된 ExampleClass2의 privateVariable2 필드는
		// 접근 제어자가 private이기 떄문에 같은 패키지 내부라해도 접근이 불가능 
		exampleClass2.privateVariable2 = "private";
		
		System.out.println(user.getName());
		
	}

}

class ExampleClass2 extends ExampleClass1 {
	
	protected String protectedVariable2;
	String defaultVariable2;
	private String privateVariable2;
	
	ExampleClass2(){
		// ExampleClass1에 protected로 지정되어 있는 protectedVariable은
		// 해당 클래스가 ExampleClass1을 상속받았기 때문에 접근 가능
		super.protectedVariable = "protected";
		
		// exampleClass1에 default로 지정되어 있는 defaultVariable은 
		// 해당 클래스가 ExampleClass1을 상속 받았더라고 접근이 불가능
		super.defaultVariable = "default";
		
		// private으로 지정되어 있는 privateVariable2는 
		// 해당 클래스 내에서만 접근이 가능
		this.privateVariable2 = "private";
	}
	
	void print() {
		System.out.println(super.protectedVariable);
	}
	
}

class User {
	
	// 필드의 접근 제어자를 private로 지정하여
	// 해당 클래스로 생성된 인스턴스의 필드 값의 무결성을 보장할 수 있음
	// 클래스의 구성 필드를 숨길 수 있음
	private String name;
	private int age;
	private String email;
	
	User() {}
	
	// 클래스의 필드의 접근 제어자를 private으로 지정하면
	// 데이터를 초기화하기 위해 모든 필드의 값을 받는 생성자를 만들어 주어야 한다
	User(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	// 클래스의 필드의 접근 제어자가 private으로 지정되어 있다면
	// 특정 필드의 데이터를 반환하는 public 접근 제어자의 getter 메서드가 필요함 
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}
	 
	// 클래스의 필드의 접근 제어자가 private로 지정되어 있다면 
	// 특정 필드의 데이터를 변경해주는 public 접근 제어자의 setter 메서드가 필요함 
	// setter 메서드의 경우는 완벽한 무결성을 보장하기 위해서는 사용을 지양해야함
	// 다만, 빈 생성자를 통해서 인스턴스를 생성하고 추후에 초기화를 하는 인스턴스이라면 
	// setter 메서드가 반드시 필요함
	// 인스턴스의 데이터가 변경이 이루어져야한다면 특정 필드에 대한 setter 메서드만 만들어주는 것이 좋음
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

class Board {

	private int boardNumber;
	private String boardTitle;
	private String boardContent;
	private String boardWriteDatetime;
	private String boardWriterId;
	private int boardViewCount;
	private int boardLikeCount;
	private int boardCommentCount;
	
	public Board(int boardNumber, String boardTitle, String boardContent, String boardWriteDatetime,
			String boardWriterId, int boardViewCount, int boardLikeCount, int boardCommentCount) {
		this.boardNumber = boardNumber;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriteDatetime = boardWriteDatetime;
		this.boardWriterId = boardWriterId;
		this.boardViewCount = boardViewCount;
		this.boardLikeCount = boardLikeCount;
		this.boardCommentCount = boardCommentCount;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriteDatetime() {
		return boardWriteDatetime;
	}

	public void setBoardWriteDatetime(String boardWriteDatetime) {
		this.boardWriteDatetime = boardWriteDatetime;
	}

	public String getBoardWriterId() {
		return boardWriterId;
	}

	public void setBoardWriterId(String boardWriterId) {
		this.boardWriterId = boardWriterId;
	}

	public int getBoardViewCount() {
		return boardViewCount;
	}

	public void setBoardViewCount(int boardViewCount) {
		this.boardViewCount = boardViewCount;
	}

	public int getBoardLikeCount() {
		return boardLikeCount;
	}

	public void setBoardLikeCount(int boardLikeCount) {
		this.boardLikeCount = boardLikeCount;
	}

	public int getBoardCommentCount() {
		return boardCommentCount;
	}

	public void setBoardCommentCount(int boardCommentCount) {
		this.boardCommentCount = boardCommentCount;
	}

	@Override
	public String toString() {
		return "Board [boardNumber=" + boardNumber + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriteDatetime=" + boardWriteDatetime + ", boardWriterId=" + boardWriterId
				+ ", boardViewCount=" + boardViewCount + ", boardLikeCount=" + boardLikeCount + ", boardCommentCount="
				+ boardCommentCount + "]";
	}

	
	
}