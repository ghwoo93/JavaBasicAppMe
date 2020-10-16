package jdbc25.etc;

import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.util.List;
import java.util.Vector;

import jdbc25.service.IConnectImpl;

public class ResultSetMetaDataSQL extends IConnectImpl {
	
	public ResultSetMetaDataSQL() {
		connect(ORACLE_URL, "SCOTT", "scott");
	}
	
	@Override
	public void execute() throws Exception {
		try {
			String sql = getQueryString();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			System.out.println("총 컬럼 수:"+columnCount);
			for(int i=1;i<=columnCount;i++) {
				String columName = rsmd.getColumnName(i);
				int length = columName.length()+2;
				System.out.print(String.format("%-"+length+"s", columName));
			}
			System.out.println("\r\n[자바의 컬럼타입으로 얻기]");
			for(int i=1;i<=columnCount;i++) {
				int columnType = rsmd.getColumnType(i);
				switch(columnType) {
					case Types.VARCHAR:
						System.out.println("오라클의 VARCHAR2");
						break;
					case Types.NVARCHAR:
						System.out.println("오라클의 NVARCHAR2");
						break;
					case Types.CHAR:
						System.out.println("오라클의 CHAR");
						break;
					case Types.NCHAR:
						System.out.println("오라클의 NCHAR");
						break;
					case Types.NUMERIC:
						System.out.println("오라클의 NUMBER");
						break;
					case Types.TIMESTAMP:
						System.out.println("오라클의 DATE");
						break;
					default: System.out.println("오라클의 기타 자료형");
					
				}
			}
			System.out.println("[오라클의 컬럼타입명으로 얻기]");
			for(int i=1;i<=columnCount;i++) {
				String columnTypeName = rsmd.getColumnTypeName(i);
				System.out.println(columnTypeName);
			}
			System.out.println("[컬럼의 널 여부 얻기]");
			for(int i=1;i<=columnCount;i++) {
				int isNull = rsmd.isNullable(i);
				System.out.println(isNull==1?"널 허용":"NOT NULL");
			}
			System.out.println("[컬럼의 크기 얻기]");
			for(int i=1;i<=columnCount;i++) {
				int columnSize = rsmd.getPrecision(i);
				System.out.println("columnSize:"+columnSize);
			}
			//각 컬럼의 자릿수 설정하기
			List<Integer> dashCount = new Vector<Integer>();
			for(int i=1;i<=columnCount;i++) {
				int types = rsmd.getColumnType(i);
				
				int length = rsmd.getPrecision(i);
				
				switch(types) {
				case Types.NCHAR:
				case Types.NVARCHAR:
					dashCount.add(length*2);break;
				case Types.TIMESTAMP:
				case Types.NUMERIC:
					dashCount.add(10);break;
				default:dashCount.add(length);
				}
				String columnName = 
						rsmd.getColumnName(i).length()>dashCount.get(i-1)?
								rsmd.getColumnName(i).substring(0, dashCount.get(i-1)):
									rsmd.getColumnName(i);
				System.out.print(
						String.format(
								"%-"+(dashCount.get(i-1)+1)+"s", columnName));
			}
			System.out.println();
			for(Integer dash:dashCount) {
				for(int i=0;i<dash;i++) System.out.print('-');
				System.out.print(" ");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=columnCount;i++) {
					int type = rsmd.getColumnType(i);
					if(type==Types.TIMESTAMP) {
						System.out.print(String.format("%-11s", rs.getDate(i)));
					}
					else {
						System.out.print(
								String.format(
										"%-"+(dashCount.get(i-1)+1)+"s", rs.getString(i)));
					}
				}
				System.out.println();
			}
		} finally {
			close();
		}
	}

	public static void main(String[] args) throws Exception {
		new ResultSetMetaDataSQL().execute();

	}

}
