package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;

public class FunctionCall extends IConnectImpl {

	public FunctionCall() {
		super(ORACLE_URL,"SCOTT","scott");
	}
	
	@Override
	public void execute() throws Exception {
		String sql = "{?=call TO_ASTERISK(?)}";
		csmt = conn.prepareCall(sql);
		csmt.setString(2, getValue("문자"));
		csmt.registerOutParameter(1, Types.VARCHAR);
		System.out.println(csmt.execute());
		
		System.out.println("함수 반환값:"+csmt.getString(1));
		
		close();
		
	}
	
	public static void main(String[] args) throws Exception {
		new FunctionCall().execute();

	}

}
