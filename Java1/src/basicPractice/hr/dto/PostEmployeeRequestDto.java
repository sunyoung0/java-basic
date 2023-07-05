package basicPractice.hr.dto;

// dto : 데이터를 전송하는 용도

public class PostEmployeeRequestDto {

	private String employeeNumber;
	private String name;
	private String address;
	private String birth;
	private String email;
	private String department;
	
	public PostEmployeeRequestDto(){}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "PostEmployeeRequestDto [employeeNumber=" + employeeNumber + ", name=" + name + ", address=" + address
				+ ", birth=" + birth + ", email=" + email + ", department=" + department + "]";
	}
	
	public boolean isValidate() {
		boolean result = this.employeeNumber != null && !this.employeeNumber.isBlank() &&
				this.name != null && !this.name.isBlank() &&
				this.address != null &&	!this.address.isBlank() &&
				this.birth != null && !this.birth.isBlank() &&
				this.email != null && !this.email.isBlank() &&
				this.department != null && !this.department.isBlank();
		return result;
	}
	
}
