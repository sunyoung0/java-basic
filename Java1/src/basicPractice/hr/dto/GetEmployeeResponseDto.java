package basicPractice.hr.dto;

import basicPractice.hr.entity.EmployeeEntity;

public class GetEmployeeResponseDto {
	
	private String employeeNumber;
	private String name;
	private String address;
	private String birth;
	private String email;
	private String department;
	
	public GetEmployeeResponseDto() {}

	public GetEmployeeResponseDto(EmployeeEntity employeeEntity) {
		this.employeeNumber = employeeEntity.getEmployeeNumber();
		this.name = employeeEntity.getName();
		this.address = employeeEntity.getAddress();
		this.birth = employeeEntity.getBirth();
		this.email = employeeEntity.getEmail();
		this.department = employeeEntity.getDepartment();
	}
	
	public GetEmployeeResponseDto(String employeeNumber, String name, String address, String birth, String email,
			String department) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.email = email;
		this.department = department;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
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
		return "GetEmployeeResponseDto [employeeNumber=" + employeeNumber + ", name=" + name + ", address=" + address
				+ ", birth=" + birth + ", email=" + email + ", department=" + department + "]";
	}
}
