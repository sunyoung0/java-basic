package basicPractice.hr.repository;

import java.util.ArrayList;
import java.util.List;

import basicPractice.hr.entity.EmployeeEntity;

public interface EmployeeRepository {

	List<EmployeeEntity> employeeList = new ArrayList<>();
	
	// 저장
	boolean save(EmployeeEntity employEntity);
	
	// 삭제
	boolean delete(EmployeeEntity employeeEntity);

	// 조회
	List<EmployeeEntity> findAll();
	EmployeeEntity findByEmployeeNumber(String employeeNumber);
	
}
