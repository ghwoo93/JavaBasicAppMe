package console.academy.model;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import common.utility.CommonUtilities;
import console.academy.service.AcademyDTO;
import console.academy.service.IAcademyService;
public class AcademyDAO implements IAcademyService{
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement psmt;
	
	private static Properties props = new Properties();
	static {
		
		try {
			props.load(new FileReader("src/jdbc25/config.properties"));
			Class.forName(props.getProperty("driver"));
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 : "+e.getMessage());
		}
	}
	
	public AcademyDAO(String user,String password) {
		try {
			conn = DriverManager.getConnection(props.getProperty("url"),user,password);
			System.out.println("데이터 베이스 연결 성공: ");
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패 : "+e.getMessage());
		}
	}
	@Override
	public List<AcademyDTO> selectList(AcademyDTO dto) throws Exception {
		List<AcademyDTO> records = new Vector<AcademyDTO>();
		String sql = "SELECT * FROM academy ORDER BY acno DESC";
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		while(rs.next()) {
			AcademyDTO academy = new AcademyDTO();
			academy.setAcno(rs.getNString(1));
			academy.setAge(rs.getString(5));
			academy.setIdentity(rs.getString(3));
			academy.setJob(rs.getString(4));
			academy.setName(rs.getString(2));
			records.add(academy);
		}
		return records;
	}
	@Override
	public AcademyDTO selectOne(AcademyDTO dto) throws Exception {
		
		AcademyDTO academy = null;
		
		String sql = "SELECT * FROM academy WHERE acno=?";
		psmt = conn.prepareStatement(sql);
		psmt.setNString(1, dto.getAcno());
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			academy = new AcademyDTO();
			academy.setAcno(rs.getNString(1));
			academy.setAge(rs.getString(5));
			academy.setIdentity(rs.getString(3));
			academy.setJob(rs.getString(4));
			academy.setName(rs.getString(2));
		}
		return academy;
	}
	@Override
	public int insert(AcademyDTO dto) throws Exception {
		String sql = "INSERT INTO academy VALUES(SEQ_ACADEMY.NEXTVAL,?,?,?,?)";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1,dto.getName());
		psmt.setString(2,dto.getIdentity());
		psmt.setString(3,CommonUtilities.isNumber(dto.getIdentity())?"S":"T");
		psmt.setString(4,dto.getAge());
		return psmt.executeUpdate();
		
	}
	@Override
	public int delete(AcademyDTO dto) throws Exception {
		String sql = "DELETE academy WHERE name = ?";
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, dto.getName().trim());
		return psmt.executeUpdate();
	}
	@Override
	public int update(AcademyDTO dto) throws Exception {
		String sql = "UPDATE academy SET age=?,identity=?  WHERE name = ? ";
		psmt = conn.prepareStatement(sql);
		
		psmt.setNString(1, dto.getAge());
		psmt.setNString(2, dto.getIdentity());
		psmt.setNString(3, dto.getName().trim());
		return psmt.executeUpdate();
	}
	@Override
	public void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {}
		
	}
}