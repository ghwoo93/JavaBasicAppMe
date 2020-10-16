package collection20;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import console.academy.Student;

public class VectorApp {
	public static void main(String[] args) {
		List<Student> vec = new Vector<Student>();
		Student stu1 = new Student("가길동",20,"2020");
		Student stu2 = new Student("나길동",19,"2021");
		Student stu3 = new Student("다길동",18,"2022");
		Student stu4 = new Student("라길동",50,"2016");
		
		vec.add(stu1);
		vec.add(stu2);
		vec.add(stu3);
		vec.add(stu4);
		
		System.out.println("일반for문");
		for (int i = 0; i < vec.size(); i++) vec.get(i).print();
		System.out.println("확장for문");
		for (Student s : vec) s.print();
		System.out.println("반복기");
		Iterator<Student> it = vec.iterator();
		while(it.hasNext()) it.next().print();
		/*
		 * 열거형으로 꺼내오기:
		 * elements()메소드로 Enumeration타입얻기
		 * 
		 */
		System.out.println("열거형");
		Enumeration<Student> em = ((Vector)vec).elements();
		while(em.hasMoreElements()) em.nextElement().print();
		
		/*
		 * vec컬렉션에 저장된 student
		 * 나이가 높은순으로 재 배채후
		 * 출력하여라
		 * get set사용
		 */
		System.out.println("나이순");
		for (int i = 0; i < vec.size()-1; i++) {
			Student tempSt = null;
			for (int j = i+1; j < vec.size(); j++) {
				if(vec.get(i).age < vec.get(j).age) {
					tempSt = vec.get(i);
					//작은값을 뒤로 이동시켜야하니까
					//지워지면 안되는 작은 값을 템프로 따로빼서
					//저장을 하고
					//그 뒤에 큰값을 작은 값이 있던 자리에
					//셋팅 후에
					//작은 값을 작은 값이 있던 자리에 셋팅
					vec.set(i, vec.get(j));
					vec.set(j, tempSt);
				}
			}
		}
		System.out.println("재배치 후");
		for (Student s : vec) s.print();
	}
}
