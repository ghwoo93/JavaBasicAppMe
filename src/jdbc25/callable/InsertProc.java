package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;

public class InsertProc extends IConnectImpl {
	
	public InsertProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}
	
	@Override
	public void execute() throws Exception {
		csmt = conn.prepareCall("{call SP_INS_MEMBER(?,?,?,?)}");
		
		csmt.setString(1, getValue("아이디"));
		csmt.setString(2, getValue("비번"));
		csmt.setString(3, getValue("이름"));
		
		csmt.registerOutParameter(4, Types.NVARCHAR);
		
		System.out.println(csmt.execute());
		
		System.out.println("프로시저의 아웃 파라미터 값:"+csmt.getString(4));
		
		close();
	}
	
	public static void main(String[] args) throws Exception {
		new InsertProc().execute();

	}

}
