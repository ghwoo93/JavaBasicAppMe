package jdbc25.prepared;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class DeleteSQLMore extends IConnectImpl {
	
	@Override
	public void execute() throws Exception {
		connect(ORACLE_URL, "JDBC", "JDBC");
		String sql = "DELETE member WHERE id=?";
		psmt = conn.prepareStatement(sql);
		while(true) {
			psmt.setString(1, getValue("삭제할 아이디"));
			try {
				System.out.println(
						psmt.executeUpdate()+"행이 삭제되었습니다.");
			} catch(SQLException e) {
				System.out.println("삭제시 오류:"+e.getMessage());
			} 
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		new DeleteSQLMore().execute();

	}

}
