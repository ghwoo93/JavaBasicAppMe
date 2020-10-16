package console.academy;

import java.util.List;

import console.academy.service.AcademyDTO;
import console.academy.service.IAcademyService;
import console.academy.service.IAcademyServiceImpl;

public class Test {
	public static void main(String[] args) throws Exception {
		IAcademyService service = 
				new IAcademyServiceImpl("ACADEMY", "ACADEMY");
		List<AcademyDTO> list = service.selectList(new AcademyDTO());
		System.out.println(list.size());
	}
}
