package jdbc25.etc;

import java.sql.ResultSet;

import jdbc25.service.IConnectImpl;

public class ResultSetType extends IConnectImpl {

	public ResultSetType() {
		connect(ORACLE_URL, "SCOTT", "scott");
	}
	
	@Override
	public void execute() throws Exception {
		String sql = "SELECT * FROM emp ORDER BY sal DESC";
//		psmt = conn.prepareStatement(sql);
		psmt = 
			conn.prepareStatement(
					sql, 
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);
		
		rs = psmt.executeQuery();
		
		System.out.println("커서를 마지막 레코드로 이동:"+rs.last());
		System.out.println("총 레코드 수:"+rs.getRow());
		rs.beforeFirst();
		System.out.println("[연봉이 높은 순]");
		while(rs.next()) {
			System.out.println(
					String.format(
							"%-10s%-7s%-10s%-6s%s", 
							rs.getString(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(6),
							rs.getDate(5)));
		}
		System.out.println("[연봉이 낮은 순]");
		while(rs.previous()) {
			System.out.println(
					String.format(
							"%-10s%-7s%-10s%-6s%s", 
							rs.getString(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(6),
							rs.getDate(5)));
		}
		
		close();
	}
	
	public static void main(String[] args) throws Exception {
		new ResultSetType().execute();
	}

}
