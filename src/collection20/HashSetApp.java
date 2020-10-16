package collection20;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import console.academy.Student;

public class HashSetApp {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		String strObj1 = "JAVA";
		String strObj2 = new String("WORLD");
		Date dateObj = new Date(new java.util.Date().getTime());
		Integer intObj = new Integer(100);
		Student st1 = new Student("가길동", 17, "2019");
		System.out.println(set.add(strObj1)?"저장성공":"저장실패");
		System.out.println(set.add(strObj2)?"저장성공":"저장실패");
		System.out.println(set.add(dateObj)?"저장성공":"저장실패");
		System.out.println(set.add(intObj)?"저장성공":"저장실패");
		System.out.println(set.add(st1)?"저장성공":"저장실패");
		System.out.println("[중복 저장 전 저장된 객체 수]:"+set.size());
		System.out.println(set.add(strObj1)?"저장성공":"저장실패");
		System.out.println("[중복 저장 후 저장된 객체 수]:"+set.size());
		
		Iterator it = set.iterator();
		System.out.println("[반복기 사용]");
		while(it.hasNext()) {
			Object obj = it.next();
			if(obj instanceof String) System.out.println("String타입:"+obj);
			else if(obj instanceof Date) System.out.println("Date타입:"+obj);
			else if(obj instanceof Integer) System.out.println("Integer타입:"+obj);
			else System.out.println("Student타입:"+((Student)obj).get());
		}
//		it.next();
		
		System.out.println("[확장 포문]");
		for (Object obj : set) {
			if(obj instanceof String) System.out.println("String타입:"+obj);
			else if(obj instanceof Date) System.out.println("Date타입:"+obj);
			else if(obj instanceof Integer) System.out.println("Integer타입:"+obj);
			else System.out.println("Student타입:"+((Student)obj).get());
		}
		String[] mountains = {"비슬산","덕유산","태백산","속리산"};
		System.out.println("[일반  for 문]");
		for (int i = 0; i < mountains.length; i++) {
			System.out.println(mountains[i]);
		}
		System.out.println("[확장  for 문]");
		for(String mountain:mountains) {
			System.out.println(mountain);
		}
		//boolean contains(Object e)
		System.out.println(
				set.contains(strObj1)?"strObj1 있다":"strObj2 없다");
		System.out.println(
				set.contains(100)?"100 있다":"100 없다");
		//본래 new integer한 객체주소를 전달하는데 그 전에 integer객체타입에 100을 가진걸 차즌다
		System.out.println(
				set.contains(new Integer(100))?"100있다":"100없다");
		//위와 동일하게 world가 저장된 객체를 찾는다
		System.out.println(
				set.contains("WORLD")?"WORLD 있다":"WORLD 없다");
		System.out.println(set.remove(strObj1)?"삭제성공":"삭제실패");
		System.out.println(set.remove(strObj2)?"삭제성공":"삭제실패");
		System.out.println("삭제후 저장된 객체수:"+set.size());
		//전체삭제 removeAll()근데 공통으로 다 clear()가지고 있어서 클리어써라
//		set.removeAll(set);
		set.clear();
		System.out.println("전체 삭제후 저장된 객체수:"+set.size());
		//전체 삭제후 저장한 객체는 그대로 있다 set 컬렉션에서만 제거됨
		System.out.println("Student객체:"+st1.get());
		//2]<?>표현 사용 - 해당 타입만 저장가능
		HashSet<Student> set2 = new HashSet<Student>();
		Student stu1 = new Student("가길동",20,"2020");
		Student stu2 = new Student("나길동",19,"2021");
		Student stu3 = new Student("다길동",18,"2022");
		
		System.out.println("반복기 사용");
		set2.add(stu1);set2.add(stu2);set2.add(stu3);
		//제너릭 지정한 타입만 저장 가능
		Iterator<Student> it2 = set2.iterator();
		while(it2.hasNext()) {
			Student st =it2.next();
//			System.out.println(
//					String.format(
//							"이름:%s, 나이:%s, 학번:%s", 
//							st.name,st.age,st.stNumber));
			st.print();
		}
		System.out.println("확장for문");
		for (Student student : set2) student.print();

		System.out.println(set2.contains(stu1));
		System.out.println(set2.contains(new Student("가길동",20,"2020")));
		
//		set2.remove(stu1);
		System.out.println("삭제후 저장된 객체수:"+set2.size());
//		set2.clear();
		System.out.println("전체 삭제후 저장된 객체수:"+set2.size());
		/*
		 * 이름으로 검색
		 * 있으면 검색결과
		 * 없으면 해당학생이 없어요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String searchName = sc.nextLine();
		Iterator<Student> it3 = set2.iterator();
		while(it3.hasNext()) {
			Student st = it3.next();
			if(!st.equals(null)) {
				if(st.name.equals(searchName)) {
					st.print();
					break;
				}
			}
			if(!it3.hasNext()&&!st.name.equals(searchName)) {
				System.out.println("해당되는 이름이 없어요");
				break;
			}
		}
		
//		while(true) {
//			boolean isExist = false;
//			for (Student st : set2) {
//				if(st.name.equals(searchName)) {
//					st.print();
//					isExist = true;
//					break;
//				}
//			}
//			if(!isExist) {
//				System.out.println("해당 학생이 없어요");
//				break;
//			}
//		}
	}
}
