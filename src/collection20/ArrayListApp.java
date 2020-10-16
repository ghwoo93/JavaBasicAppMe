package collection20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import console.academy.Student;

public class ArrayListApp {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("가산");
		list.add("나산");
		list.add("다산");
		list.add(3,"라산");
		list.add(1,"마산");
		System.out.println("중복 저장 전 객체 수:"+list.size());
		System.out.println(list.add("가산")?"중복저장 성공":"중복저장 실패");
		System.out.println("중복 저장 후 객체 수:"+list.size());
		System.out.println("[일반 for문:get(index)]");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		System.out.println("[확장 for문]");
		for (Object object : list) System.out.println(object);
		
		System.out.println("[반복기 사용]");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("[반복기 사용]");
		list.set(4, "하산");
		for (Object object : list) System.out.println(object);
		
		System.out.println(list.contains("다산"));
		
		Object obj = list.remove(1);
		System.out.println("삭제된 객체:"+obj);
		System.out.println((list.remove("하산")?"삭제 성공":"삭제 실패"));
		System.out.println("하산 마산 삭제");
		for (Object object : list) System.out.println(object);
		
		int index = list.indexOf("다산");
		System.out.println("index:"+index);
		
		System.out.println();
		list.remove("가산");
		System.out.println("가산 삭제");
		for (Object object : list) System.out.println(object);
		list.clear();
		System.out.println("전체 삭제 후 객체 수:"+list.size());
		
		List<Student> list2 = new ArrayList<Student>();
		Student stu1 = new Student("가길동",20,"2020");
		Student stu2 = new Student("나길동",19,"2021");
		Student stu3 = new Student("다길동",18,"2022");
		Student stu4 = new Student("라길동",18,"2016");
		
		list2.add(stu1);
		list2.add(stu2);
		list2.add(stu3);
		list2.add(stu4);
		
		list2.add(stu2);
		System.out.println("중복저장 후");
		for (Student st : list2) st.print();
		System.out.println("중복저장된 객체를 주소로 삭제 후");
		list2.remove(stu2);
		for (Student st : list2) st.print();
		System.out.println("일반 for문 get");
		for (int i = 0; i < list2.size(); i++) list2.get(i).print();
		System.out.println("확장for문");
		for (Student s : list2) s.print();
		System.out.println("반복기 사용");
		Iterator<Student> it2 = list2.iterator();
		while (it2.hasNext()) it2.next().print();;
		
		System.out.println("삭제된 객체(학생)의 이름:"+list2.remove(2).name);
		
		/*
		 * 사용자로부터 이름을 입력받아 그 이름으로 검색해서
		 * 인덱스 위치 indexOf 를 알아내서 해당인덱스로
		 * 그객체를 삭제하고 삭제된 객체의 정보 이름 나이 학번을
		 * 출력하여라
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 학생의 이름을 입력?");
		String searchName = sc.nextLine();
		Iterator<Student> it3 = list2.iterator();
		while (it3.hasNext()) {
			Student st =  it3.next();
			if(!st.equals(null)) {
				if(searchName.equals(st.name)) {
					list2.remove(list2.indexOf(st)).print();;
				}
			}
		}
		//java.util.ConcurrentModificationException 뜬다 해결
		
		
		
		
	}
}
