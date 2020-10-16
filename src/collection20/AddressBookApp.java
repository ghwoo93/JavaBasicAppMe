package collection20;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class Address implements Comparable<Address>{
	String name;
	int age;
	String addr;
	String contact;
	
	public Address(
			String name, int age, String addr, String contact) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return String.format(
				"[이름:%s,나이:%d,주소:%s,연락처:%s]", name,age,addr,contact);
	}

	@Override
	public int compareTo(Address target) {
		//이름으로 정렬
		//오름차순
//		return this.name.compareTo(target.name);
		//내림차순
//		return target.name.compareTo(this.name);
		//나이로 정렬
		//오름차순
		//오름차순
//		return this.age-target.age;
		//내림차순
		return target.age-this.age;
	}
	
}

public class AddressBookApp {
	public static void main(String[] args) {
		/*
		1]초성을 Key값-String 혹은 Character		  
		  List계열 컬렉션을 Value값-List<String>
		  Map계열 컬렉션		  
		  Value에는 초성에 해당하는 이름들 저장
		*/
		Map<Character,List<String>> nameAddr =
				new HashMap<Character, List<String>>();
		//1-1]이름 저장용 List계열 컬렉션 객체 생성 및 이름 저장]
		List kieyeok = Arrays.asList("고길동","곽길동","가길동","기길동");
		List nieoun = Arrays.asList("노길동","나길동","남길동");
		//1-3]Map컬렉션(nameAddr)에 이름이 저장된 List계열 컬렉션 저장
		nameAddr.put('ㄱ',kieyeok);
		nameAddr.put('ㄴ',nieoun);
		//1-4-1]키값을 알때
		System.out.println("[키값을 알때]");
		List<String> values=nameAddr.get('ㄱ');
		for(String value:values) System.out.println(value);
		//1-4-2]키값을 모를때
		System.out.println("[키값을 모를때]");
		//1]keySet()으로 Set컬렉션 얻기
		Set<Character> keys= nameAddr.keySet();
		//2]Set컬렉션에 확장 for문 적용
		for(Character key:keys) {
			System.out.println(String.format("[%c로 시작하는 명단]", key));
			//3]get(키값)으로 value얻기
			values=nameAddr.get(key);
			for(String value:values) System.out.println(value);
		}
		/*
		2]초성을 Key값-String 혹은 Character		 
		  List계열 컬렉션을 Value값-List<Map<String,Object>>
		  Map계열 컬렉션		  
		  Value에는 초성에 해당하는 이름,주소,전화번호들 저장
		*/
		Map<Character,List<Map<String,Object>>> address=
				new HashMap<Character, List<Map<String,Object>>>();
		List<Map<String,Object>> kie = new Vector<Map<String,Object>>();
		List<Map<String,Object>> nie = new Vector<Map<String,Object>>();
		
		Map<String,Object> k = new HashMap<String,Object>();
		k.put("name", "고길동");
		k.put("age", 20);
		k.put("addr", "가산동");
		k.put("contacts", "010-1234-5678");
		
		kie.add(k);
		
		k = new HashMap<String,Object>();
		System.out.println(k.getClass());
		k.put("name", "곽길동");
		k.put("age", 30);
		k.put("addr", "서초동");
		k.put("contacts", "011-1234-5678");
		
		kie.add(k);
		
		Map<String,Object> n = new HashMap<String,Object>();
		k.put("name", "나길동");
		k.put("age", 45);
		k.put("addr", "나산동");
		k.put("contacts", "017-1234-5678");
		
		nie.add(n);
		
		n = new HashMap<String,Object>();
		k.put("name", "노길동");
		k.put("age", 35);
		k.put("addr", "석촌동");
		k.put("contacts", "019-1234-5678");
		
		nie.add(n);
		
		address.put('ㄱ', kie);
		address.put('ㄴ', nie);
		
		System.out.println("키값을 알때");
		List<Map<String,Object>> lists = address.get('ㄱ');
		System.out.println("ㄱ으로 시작하는 명단");
		for (Map<String, Object> map : lists) {
			Set<String> set = map.keySet();
			for (String key : set) {
				Object value = map.get(key);
				System.out.print(
						String.format(
								"%s: %-6s",key,map.get(key)));
			}
			System.out.println();
		}
		System.out.println("키값을 모를때");
		keys = address.keySet();
		for (Character key : keys) {
			List list = address.get(key);
			for (Map<String, Object> map : lists) {
				Set<String> set = map.keySet();
				for (String key2 : set) {
					Object value = map.get(key2);
					System.out.print(
							String.format(
									"%s: %-6s",key2,map.get(key2)));
				}
				System.out.println();
			}
		}
		
		System.out.println("Address 클래스를 사용해서 구현");
		Map<Character,List<Address>> addressBook =
				new HashMap<Character,List<Address>>();
		List<Address> kiec = new Vector<Address>();
		List<Address> niec = new Vector<Address>();
		
		kiec.add(new Address("곽길동", 40, "가산동", "010"));
		kiec.add(new Address("고길동", 20, "독산동", "017"));
		kiec.add(new Address("가길동", 30, "천호동", "019"));
		
		niec.add(new Address("노길동", 20, "방배동", "019"));
		niec.add(new Address("나길동", 34, "서초동", "011"));
		niec.add(new Address("너길동", 30, "잠실동", "017"));
		
		addressBook.put('ㄱ', kiec);
		addressBook.put('ㄴ', niec);
		
		keys = addressBook.keySet();
		for (Character key : keys) {
			System.out.println(
					String.format("[%c로 시작하는 명단]", key));
			List<Address> vals = addressBook.get(key);
			Collections.sort(vals);
			for (Address val : vals) {
				System.out.println(val);
			}
		}
		
		
		
	}
}
