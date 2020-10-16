package jdbc25.statement;

import java.sql.SQLException;

import jdbc25.service.IConnectImpl;

public class SelectSQL extends IConnectImpl {
	
	@Override
	public void execute() throws Exception {
		connect(ORACLE_URL, "SCOTT", "scott");
		try {
			stmt = conn.createStatement();
			//String selectSql = "SELECT * FROM emp ORDER BY hiredate DESC";
			//String selectWhereSql = "SELECT * FROM emp WHERE empno="+getValue("사원번호");
//			String selectGroupFunction = "SELECT AVG(SAL) FROM emp";
//			String selectWhereLIKE = "SELECT * FROM emp WHERE ename LIKE '%S%'";
//			String selectWhereLIKE = "SELECT * FROM emp WHERE ename LIKE '%'||'S'||'%'";
			String selectWhereLIKE = 
					"SELECT * FROM emp WHERE ename LIKE '%"
							+getValue("찾는 문자열")+"%'";
//			String selectWhereLIKE = 
//					"SELECT * FROM emp WHERE ename LIKE '%'||'"
//							+getValue("찾는 문자열")+"'||'%'";
			
			rs = stmt.executeQuery(selectWhereLIKE);
			
//			/*
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString("JOB");
				//int comm = rs.getInt("comm");
				//값이 없는 경우 0반환해서 0과 null이 구분이 어려움
				String comm = rs.getString("comm")==null?"":rs.getString("comm");
				//java.sql.Date hiredate = rs.getDate(5);
				String hiredate = rs.getString(5).substring(0, 10);
				System.out.println(
						String.format(
								"%-5s%-10s%-10s%-5s%s", 
								empno,ename,job,comm,hiredate));
			}
//			*/
			
			/*
			 if(rs.next()) {
				System.out.println(
						String.format(
								"%-5s%-10s%-10s%-5s%s", 
								rs.getString(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(7)==null?"":rs.getString(7),
								rs.getDate(5)));
			}
			 */
			
			rs.next();
			System.out.println("평균:"+rs.getFloat(1));
			
		} catch (SQLException e) {
			System.out.println("오류 발생:"+e.getMessage());
		} finally {
			close();
		}
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		new SelectSQL().execute();
	}
	
}
