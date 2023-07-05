package basicPractice.hr.controller.implement;

import java.util.List;

import basicPractice.hr.controller.MainController;
import basicPractice.hr.dto.GetEmployeeListResponseDto;
import basicPractice.hr.dto.GetEmployeeResponseDto;
import basicPractice.hr.dto.PatchEmployeeRequestDto;
import basicPractice.hr.dto.PostEmployeeRequestDto;
import basicPractice.hr.service.MainService;

//MainController의 구현체 
public class MainControllerImplement implements MainController {

	// 의존성 부여 
	private final MainService mainService;
	
	// 의존성을 외부에서 받아옴 
	public MainControllerImplement(MainService mainService) {
		this.mainService = mainService;
	}
	
	@Override
	public void postEmployee(PostEmployeeRequestDto dto) {
		// 필수로 입력해야하는 입력 값이 모두 입력 되었는지 확인
		// isBlank() : 해당 메서드가 빈 값이거나 공백으로만 채워져있는 지 판단하는 것 
		boolean validated = dto.isValidate();
		
		// 만약에 필수 입력이 모두 입력 되지 않았으면 알림 출력 후 메서드 종료 
		if(!validated) {
			System.out.println("모든 값을 입력하세요.");
			return;
		}
		// 입력 값이 모두 입력 되었다면 실제 비즈니스 로직을 실행하여 결과를 반환 받음
		boolean result = mainService.postEmployee(dto);
		
		// 결과를 출력
		String resultMessage = result? "인사 등록에 성공했습니다." : "인사 등록에 실패했습니다.";
		System.out.println(resultMessage);
	}

	@Override
	public void getEmployeeList() {
		
		List<GetEmployeeListResponseDto> result = mainService.getEmployeeList();
		
		for(GetEmployeeListResponseDto item : result) {
			System.out.println(item.toString());
		}
	}

	@Override
	public void getEmployee(String employeeNumber) {
		
		boolean validated = employeeNumber != null && !employeeNumber.isBlank();
		
		if(!validated) {
			System.out.println("사번을 입력하세요.");
			return;
		}
		
		GetEmployeeResponseDto result = mainService.getEmployee(employeeNumber);
		String resultMessage = result != null ? result.toString() : "존재하지 않는 사번입니다.";
		System.out.println(resultMessage);
	}

	@Override
	public void patchEmployee(PatchEmployeeRequestDto dto) {
		boolean validated = dto.isValidate();
		if(!validated) {
			System.out.println("모든 값을 입력해주세요.");
			return;
		}
		
	    boolean result = mainService.patchEmployee(dto);
	    
	    String resultMessage = result ? "수정에 성공했습니다." : "수정에 실패했습니다.";
	    System.out.println(resultMessage);
	}

	@Override
	public void deleteEmployee(String employeeNumber) {
		boolean validated = employeeNumber != null && !employeeNumber.isBlank();
		if(!validated) {
			System.out.println("사번을 입력해주세요.");
			return;
		}
		
		boolean result = mainService.deleteEmployee(employeeNumber);
		String resultMessage = result ? "삭제 성공했습니다." : " 삭제에 실패했습니다.";
		System.out.println(resultMessage);
		
	}

}
