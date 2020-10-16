package jdbc25.prepared;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class SelectSQL extends IConnectImpl{
	
	
	
	public SelectSQL() {
		super(ORACLE_URL,"SCOTT","scott");
	}

	@Override
	public void execute() throws Exception {
//		String sql = "SELECT ename,TRIM(TO_CHAR(sal,'L99,999')) sal,"
//				+ "job,TO_CHAR(hiredate,'YYYY.MM.DD') hiredate "
//				+ "FROM emp "
//				+ "ORDER BY hiredate DESC";
//		String selectWhereSQL = "SELECT ename,TRIM(TO_CHAR(sal,'L99,999')) sal,"
//				+ "job,TO_CHAR(hiredate,'YYYY.MM.DD') hiredate "
//				+ "FROM emp "
//				+ "WHERE ename LIKE '%'||'"+getValue("찾는 문자열")+"' "
//				+ "ORDER BY hiredate DESC";
//		String selectWhereSQL = "SELECT ename,TRIM(TO_CHAR(sal,'L99,999')) sal,"
//				+ "job,TO_CHAR(hiredate,'YYYY.MM.DD') hiredate "
//				+ "FROM emp "
//				+ "WHERE ename LIKE '%'||? "
//				+ "ORDER BY hiredate DESC";
		String selectWhereSQL = "SELECT ename,TRIM(TO_CHAR(sal,'L99,999')) sal,"
				+ "job,TO_CHAR(hiredate,'YYYY.MM.DD') hiredate "
				+ "FROM emp "
				+ "WHERE ename LIKE '%'|| ? ||'%'"
				+ "ORDER BY hiredate DESC";
		
		psmt = conn.prepareStatement(selectWhereSQL);
		
		psmt.setString(1, getValue("찾는 문자열"));
		try {
			rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(
						String.format(
								"%-8s%-8s%-10s%s", 
								rs.getString(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4)));
			}
		} catch(SQLException e) {
			System.out.println("조회 쿼리 실행 오류:"+e.getMessage());
		} finally {
			close();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		new SelectSQL().execute();
	}
}
