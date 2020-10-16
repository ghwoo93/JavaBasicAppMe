package jdbc25.statement;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class UpdateSQLMore extends IConnectImpl{
	
	
	public UpdateSQLMore() {}
	
	public UpdateSQLMore(String url, String user, String password) {
		super(url,user,password);
	}
	

	@Override
	public void execute() throws Exception {
		connect(ORACLE_URL, "JDBC", "JDBC");
		
		stmt = conn.createStatement();
		
		while(true) {
			String updateSql = 
					"UPDATE member SET name='"
							+getValue("이름")+"',pwd='"
							+getValue("비밀번호")+"' WHERE id='"
							+getValue("아이디")+"'";
			try{
			System.out.println(stmt.executeUpdate(updateSql)+"행이 수정 되었어요");
			} catch (SQLException e) {
				System.out.println("수정시 오류:"+e.getMessage());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new UpdateSQLMore().execute();
	}
}
