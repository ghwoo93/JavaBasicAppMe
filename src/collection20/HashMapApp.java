package collection20;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import console.academy.Student;

public class HashMapApp {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
		Map map = new HashMap();
		//Object put(키값,value)
		System.out.println(
				"name이라는 키값으로 이전에 저장된 객체:"+map.put("name", "가길동"));
		int age =20;
		map.put("age", age);
		map.put("gender", "남자");
		map.put("address", new String("가산동"));
		System.out.println("저장된 객체 수:"+map.size());
		System.out.println(
				"name이라는 키값으로 이전에 저장된 객체:"+map.put("name", "나길동"));
		System.out.println(
				"name이라는 키값으로 이전에 저장된 객체:"+map.put("name", "가길동"));
		System.out.println("키값 중복 저장 후 객체 수:"+map.size());
		System.out.println("키값을 알때:"+map.get("name"));
		//키값을 모를 때
		//keySet > set 콜렉션 foreach > value = get(얻은키값) 
		Set keys = map.keySet();
		System.out.println("확장포문 적용");
		for (Object key : keys) {
			Object value = map.get(key);
			System.out.println(
					String.format("%s : %s",key,value));
		}
		System.out.println("반복기 적용");
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(
					String.format("%s : %s",key,value));
		}
		//value값만 얻어올 때 values()
		Collection values = map.values();
		System.out.println("[value값들만 얻어오기]");
		for (Object value : values) System.out.println(value);
		
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsKey("tall"));
		System.out.println(map.containsValue("남자"));
		System.out.println(map.containsValue("여자"));
		
		System.out.println("삭제된 객체(value):"+map.remove("gender"));
		System.out.println("삭제후 출력");
		for (Object key : keys) {
			Object value = map.get(key);
			System.out.println(
					String.format("%s : %s",key,value));
		}
		map.clear();
		System.out.println("전체 삭제후 객체 수:"+map.size());
		
		Map table = new Hashtable();
		table.put("센터", "코스모");
		table.put("위치", "가산동");
		table.put("과정", "자바");
		Enumeration em = ((Hashtable)table).keys();
		while(em.hasMoreElements()) {
			Object key = em.nextElement();
			Object value = table.get(key);
			System.out.println(
					String.format("%s : %s",key,value));
		}
		Map<String,Student> maps = new HashMap<String,Student>();
		Student stu1 = new Student("가길동",20,"2020");
		Student stu2 = new Student("나길동",19,"2021");
		Student stu3 = new Student("다길동",18,"2022");
		Student stu4 = new Student("라길동",18,"2016");
		maps.put("학생1", stu1);
		maps.put("학생2", stu2);
		maps.put("학생3", stu3);
		maps.put("학생4", stu4);
		System.out.println("[키값을 알때]");
		maps.get("학생1").print();
		System.out.println("[키값을 모를때]");
		Set<String> kys = maps.keySet();
		for (String key : kys) {
			Student value = maps.get(key);
			System.out.println(String.format("%s :%s",key,value.get()));
		}
		Map<Character,List<Map<String,Object>>> address = 
				new HashMap<Character,List<Map<String,Object>>>();
		
		
	}
}
