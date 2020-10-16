package jdbc25.prepared;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class InsertSQLMore extends IConnectImpl {
	public InsertSQLMore() {
	}
	
	public InsertSQLMore(String url, String user, String password) {
		connect(url, user, password);
	}
	
	@Override
	public void execute() throws Exception {
//		String sql = "INSERT INTO member VALUES('KIM1','1234','김길동1',SYSDATE)";
		String inparaSQL = "INSERT INTO member VALUES(?,?,?,SYSDATE)";
		psmt = conn.prepareStatement(inparaSQL);
		while(true) {
			psmt.setString(1, getValue("아이디"));
			psmt.setString(2, getValue("비밀번호"));
			psmt.setString(3, getValue("이름"));
			
			try {
				System.out.println(psmt.executeUpdate()+"행이 입력되었어요");
			} catch(SQLException e) {
				System.out.println("입력시 오류:"+e.getMessage());
			} 
		}
	}

	public static void main(String[] args) {
		try {
			new InsertSQLMore(ORACLE_URL,"JDBC","JDBC").execute();
		} catch (Exception e) {
			System.out.println("오류:"+e.getMessage());
		}
	}
}
