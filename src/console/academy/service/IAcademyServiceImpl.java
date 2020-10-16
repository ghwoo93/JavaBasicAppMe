package console.academy.service;

import java.util.List;

import console.academy.model.AcademyDAO;

public class IAcademyServiceImpl implements IAcademyService{
	
	private AcademyDAO dao;
	
	public IAcademyServiceImpl(String user,String password) {
		dao = new AcademyDAO(user, password);
	}

	@Override
	public List<AcademyDTO> selectList(AcademyDTO dto) throws Exception {
		return dao.selectList(dto);
	}

	@Override
	public AcademyDTO selectOne(AcademyDTO dto) throws Exception {
		return dao.selectOne(dto);
	}

	@Override
	public int insert(AcademyDTO dto) throws Exception {
		return dao.insert(dto);
	}

	@Override
	public int delete(AcademyDTO dto) throws Exception {
		return dao.delete(dto);
	}

	@Override
	public int update(AcademyDTO dto) throws Exception {
		return dao.update(dto);
	}

	@Override
	public void close() {
		dao.close();
	}

}
