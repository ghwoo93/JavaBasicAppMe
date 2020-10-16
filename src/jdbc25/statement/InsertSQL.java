package jdbc25.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSQL {
	//멤버변수
	private Connection conn;
	private Statement stmt;
	//생성자
	public InsertSQL() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@127.0.0.1:1521:orcl","JDBC","JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : 드라이버 클래스가 없어요.");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 : url,user,pw를 확인하세요.");
		}
	}
	
	private void execute() {
		try {
			stmt = conn.createStatement();
			String insertSql = 
					"INSERT INTO member(id,pwd,name) VALUES('PARK','1234','박길동')";
			try {
				int affected = stmt.executeUpdate(insertSql);
				System.out.println(affected+"행이 입력되었어요.");
			} catch(SQLException e) {
				System.out.println("INSERT 쿼리 문 실행 오류:"+e.getMessage());
			}
		} catch (SQLException e) {
			System.out.println("Statement 객체 생성 실패");
		} finally {
			close();
		}
	}
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InsertSQL().execute();
	}
}
