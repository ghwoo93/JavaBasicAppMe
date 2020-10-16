package console.academy.service;

import java.util.List;

import console.academy.Person;

public interface IAcademyService {
	List<AcademyDTO> selectList(AcademyDTO dto) throws Exception;
	AcademyDTO selectOne(AcademyDTO dto) throws Exception;
	
	int insert(AcademyDTO dto) throws Exception;
	int delete(AcademyDTO dto) throws Exception;
	int update(AcademyDTO dto) throws Exception;
	
	void close();
}
