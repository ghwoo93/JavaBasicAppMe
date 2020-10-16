package jdbc25.etc;

import jdbc25.service.IConnectImpl;

public class TransactionSQL extends IConnectImpl {
	
	public TransactionSQL() {
		super(ORACLE_URL,"JDBC","JDBC");
	}
	
	@Override
	public void execute() throws Exception {
		try {
			//자동 커밋이 일어나지 않도록 설정
			conn.setAutoCommit(false);
			String sql = "DELETE member WHERE id=?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getValue("삭제할 아이디"));
			//커밋
			
			System.out.println(psmt.executeUpdate()+"행이 삭제 되었어요");
			
			sql="INSERT INTO member VALUES (?,?,?,SYSDATE)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getValue("아이디"));
			psmt.setString(2, getValue("비번"));
			psmt.setString(3, getValue("이름"));
			
			System.out.println(psmt.executeUpdate()+"행이 생성 되었어요");
			
			conn.commit();
			System.out.println("커밋 되었어요.");
		} catch (Exception e) {
			//롤백
			conn.rollback();
			System.out.println("롤백 되었어요.");
		} finally {
			close();
		}
	}
	
	public static void main(String[] args) throws Exception {
		new TransactionSQL().execute();
	}

}
