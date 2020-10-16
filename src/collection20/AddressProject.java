package collection20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import collection20.*;
import common.utility.CommonUtilities;

/* 1차 개인 프로젝트시 참고 코드*/
public class AddressProject {
	public static void main(String[] args) {
		Map<Character,List<Address>> addressBook = 
				new HashMap<Character,List<Address>>();
		//1]밸류타입을 null로 초기화
		List<Address> valueList = null;
		//사용자입력용 스캐너
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하세요?");
			String name = sc.nextLine();
			if("EXIT".equalsIgnoreCase(name)) break; 
			char key = CommonUtilities.getFirstCharacter(name);
//			System.out.println("초성:"+key);
			if(key == '0') {
				System.out.println("한글 이름이 아닙니다.");
				continue;
			}
			System.out.println("주소를 입력하세요?");
			String addr = sc.nextLine();
			System.out.println("연락처를 입력하세요?");
			String contact = sc.nextLine();
			System.out.println("나이를 입력하세요?");
			int age = Integer.parseInt(sc.nextLine());
			//3]맵컬렉션(addressBook)에 key값이 존재하는지 판단
			if(!addressBook.containsKey(key)) {//해당 키값이 없는 경우
				//address 타입인  list<address>객체 생성
				valueList = new Vector<Address>();
			}else {//키값이 존재한다면
				valueList = addressBook.get(key);
			}
			valueList.add(new Address(name, age, addr, contact));
			addressBook.put(key, valueList);
		}
		Set<Character> inits = addressBook.keySet();
		for (Character init : inits) {
			List initByAddr = addressBook.get(init);
			for (Object addr : initByAddr) {
				System.out.println(addr);
			}
		}
		
		/*
		 * 찾고자 하는 사람을 입력받아서
		 */
		boolean isExist= false;
		while(!isExist) {
			System.out.println("찾는 사람은 누구 입니까?");
			String searchName = sc.nextLine();
			if(!searchName.equals(null)) {
				Character searchKey = 
						CommonUtilities.getFirstCharacter(searchName);
				List<Address> resultList = addressBook.get(searchKey);
				if(addressBook.containsKey(searchKey)) {
					
					for (Address addr : resultList) {
						if(searchName.equals(addr.name)) {
							System.out.println(addr);
							isExist = true;
							break;
						}
					}
					if(!isExist) 
						System.out.println("이름이 존재하지 않아요(키값존재)");
				}else {
					System.out.println("이름이 존재하지 않아요(키값미존재)");
				}
			}
		}
	}
}
