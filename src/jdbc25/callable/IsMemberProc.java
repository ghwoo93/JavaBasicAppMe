package jdbc25.callable;

import java.sql.Types;

import jdbc25.service.IConnectImpl;

public class IsMemberProc extends IConnectImpl {
	
	public IsMemberProc() {
		super(ORACLE_URL,"JAVA","JAVA");
	}
	
	@Override
	public void execute() throws Exception {
		csmt = conn.prepareCall("{call SP_ISMEMBER(?,?,?)}");
		csmt.setString(1, getValue("아이디"));
		csmt.setString(2, getValue("비번"));
		csmt.registerOutParameter(3, Types.NUMERIC);
		
		csmt.execute();
		
		int flag = csmt.getInt(3);
		if(flag==1) {
			System.out.println("회원님 즐감");
		}else if(flag==0) System.out.println("아이디는 일치하나 비번이 불일치");
		else System.out.println("아이디 불일치");
		
		close();
	}
	
	public static void main(String[] args) throws Exception {
		new IsMemberProc().execute();

	}

}
