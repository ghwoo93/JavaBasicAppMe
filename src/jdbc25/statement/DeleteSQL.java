package jdbc25.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQL {
	private Connection conn;
	private Statement stmt;
	
	public DeleteSQL() {
		try {
			//"oracle.jdbc.OracleDriver"
			Class.forName("oracle.jdbc.OracleDriver");
			conn = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@127.0.0.1:1521:orcl", "JDBC", "JDBC");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver loading failed: 드라이버 클래스가 없어요");
		} catch (SQLException e) {
			System.out.println("Database connect failed: 입력한 정보를 확인하세요");
		}
	}
	
	public void execute() {
		try {
			stmt = conn.createStatement();
			try {
				String deleteSQL = "DELETE FROM member WHERE id='PARK'";
				int affected = stmt.executeUpdate(deleteSQL);
				System.out.println(affected+"행이 삭제되었습니다.");
			} catch (SQLException e) {
				System.out.println("DELETE 쿼리문 실패!");
			}
		} catch (SQLException e) {
			System.out.println("Statement 객체 생성 실패");
		} finally {
			close();
		}
	}
	
	public void close() {
		try {
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DeleteSQL().execute();
	}///main
}/////DeleteSQL
