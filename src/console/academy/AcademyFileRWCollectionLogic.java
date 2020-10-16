package console.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class AcademyFileRWCollectionLogic {
	public static final int MAX_PERSON=3;//최대인원수
	List<Person> perList;
	
	public AcademyFileRWCollectionLogic() {
		perList = new Vector<Person>();
		fileToCollection();
	}
	/*
	 * 파일(FileRW.txt)에서 데이터를 읽어
	 * perList컬렉션에 객체 저장하자
	 * 데이터 소스:파일-fileReader
	 * 데이터 목적지:컬렉션(메모리)-출력 스트림 불필요
	 */
	private void fileToCollection() {
		BufferedReader br=null;
		try {
			br = new BufferedReader(
					new FileReader("src/console/academy/FileRW.txt"));
			String data;
			while((data=br.readLine())!=null) {
				String[] comma = data.split(",");
				String name = comma[0].split(":")[1].trim();
				int age = Integer.parseInt(comma[1].split(":")[1].trim());
				String extend = comma[2].split(":")[1].trim();
				if(data.indexOf("학번")!=-1)
					perList.add(new Student(name, age, extend));
				else
					perList.add(new Teacher(name, age, extend));
				
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println("파일 읽기시 오류:"+e.getMessage());
		} 
		finally {
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	//메뉴출력용 메소드 매개변수 no 반환타입 void
	public void printMainMenu() {
		System.out.println("====================메인메뉴====================");
		System.out.println("  1.입력 2.출력 3.수정 4.삭제 5.검색 6.파일저장 9.종료");
		System.out.println("==============================================");
		System.out.println("메인 메뉴 번호를 입력하세요?");
	}///printMainMenu
	//메뉴 번호 입력용 메소드 매개변수 no 반환타입 int
	public int getMenuNumber() {
		/*
		 * 메뉴번호는 숫자만 이라는 메시지를 뿌려주고
		 */
		Scanner sc = new Scanner(System.in);
		int menuNumber=-1;
		while(true) {
			try {
				menuNumber = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("Menu number is only integer...");
			}
		}
		return menuNumber;
	}///getMenuNumber
	//메뉴 번호에 따른 분기용 메소드 매개변수 int 반환타입 void
	public void seperateMainMenu(int mainMenu) {
		switch(mainMenu) {
			case 1://입력
				while(true) {
					//서브메뉴 출력
					printSubMenu();
					//서브메뉴번호 입력받기
					int subMenu = getMenuNumber();
					if(subMenu==3) break;
					//1이나 2인 경우 입력처리
					switch(subMenu) {
						case 1:
						case 2:setPerson(subMenu);break;
						default:System.out.println("서브 메뉴에 없는 번호입니다.");
					}
				}////while
				break;
			case 2://출력
				printPerson();
				break;
			case 3://수정
				updatePerson();
				break;
			case 4://삭제
				deletePerson();
				break;
			case 5://검색
				searchPerson();
				break;
			case 6://파일저장
				savePerson();
				break;
			case 9://종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("메뉴에 없는 번호입니다");
				break;
		}
		
	}///seperateMainMenu

	//서브메뉴에 따른 학생 및 교사 데이타 입력용 메소드 매개변수 int 반환타입 void
	private void setPerson(int subMenu) {
		//정원이 찼는지 여부 판단
		if(perList.size()==MAX_PERSON) {//이미 정원이 찼음
			System.out.println("정원이 찼어요 더이상 입력할 수 없어요");
			return;
		}
		//이름과 나이는 둘다 공통
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		int age=0;
		System.out.println("나이를 입력하세요");
		while(true) {
			try {
				age = Integer.parseInt(sc.nextLine());
				break;
			}catch (Exception e) {
				System.out.println("나이는 숫자만");
			}
		}
		//학생과 교사를 구분해서 입력받기
		switch(subMenu) {
			case 1:
				System.out.println("학번을 입력하세요");
				String stNumber = sc.nextLine();
				perList.add(new Student(name, age, stNumber));
				break;
			default: //교사인경우
				System.out.println("과목을 입력하세요");
				String subject = sc.nextLine();
				perList.add(new Teacher(name, age, subject));
		}
	}///setPerson
	//출력용 메소드 매개변수 no 반환타입 void
	private void printPerson() {
		StringBuffer sbT = new StringBuffer("[교사목록]\r\n");
		StringBuffer sbSt = new StringBuffer("[학생목록]\r\n");
		for (Person p : perList) {
			if(p instanceof Student) 
				sbSt.append(p.get()+"\r\n");
			else sbT.append(p.get()+"\r\n");
		}
		//주소+주소가 안되기 때문에 문자열로 바꿔줌
		System.out.println(sbSt.toString()+sbT);
	}////printPerson
	
	//이름으로 검색하는 메소드 매개변수 String(수정/삭제) 반환타입 Person
	private Person findPersonByName(String title) {
		System.out.println(title+"할 이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (Person p : perList) {
			if(p.name.equals(name)) {
				return p;
			}
		}
		//검색된 이름이 없음
		System.out.println(name+"으로(로) 검색된 정보가 없어요");
		return null;
	}
	
	//타입 확인용 메소드
	private Person confirmType(Person person) {
		if(person!=null) {
			if(person instanceof Student) {
				return (Student)person;
			}else {//교사
				return (Teacher)person;
			}
		}
		return null;
	}
	
	//수정용 메소드 //이름은 수정하지 않음
	private void updatePerson() {
		Person findPerson = findPersonByName("수정");
//		if(findPerson!=null) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("수정할 나이를 입력하세요");
//			findPerson.age = Integer.parseInt(sc.nextLine());
//			if(findPerson instanceof Student) {
//				//학번 수정
//				System.out.println("수정할 학번을 입력하세요?");
//				
//			}
//		}
		System.out.println("====================수정메뉴====================");
		Student st=null;
		Teacher t=null;
		if(findPerson!=null) {
			Scanner sc = new Scanner(System.in);
			if(findPerson instanceof Student) {
				st = (Student)findPerson;
				System.out.println(
						"         1.나이 2."+st.getClass().getDeclaredFields()[0].getName());
			}else {//교사
				t = (Teacher)findPerson;
				System.out.println(
						"         1.나이 2."+t.getClass().getDeclaredFields()[0].getName());
			}
		
			System.out.println("==============================================");
			int inputNum = Integer.parseInt(sc.nextLine());
			switch(inputNum) {
				case 1:
					System.out.println("수정할 나이를 입력하시오");
					findPerson.age = Integer.parseInt(sc.nextLine());
					break;
				case 2:
					if(findPerson instanceof Student) {
						System.out.println("수정할 학번을 입력하시오");
						st.stNumber = sc.nextLine();
					}else {
						System.out.println("수정할 과목을 입력하시오");
						t.subject = sc.nextLine();
					}
					break;
			}
		}
	}/////updatePerson
	//삭제용 메소드
	private void deletePerson() {
		Person findPerson = findPersonByName("삭제");
		if(findPerson != null) {
			for (Person p : perList) {
				if(findPerson.name.equals(p.name)) {
					perList.remove(p);
					System.out.println("삭제하였습니다");
					break;
				}
				
			}
			//널 포인트 방지용 어레이 당기기
		}
	}/////deletePerson
	
	//검색용 메소드
	private void searchPerson() {
		Person findPerson = findPersonByName("검색");
		if(findPerson != null) {//찾은 사람의 정보 출력 //null체크
			System.out.println("["+findPerson.name+"으로 검색한 결과]");
			findPerson.print();
		}
	}/////searchPerson
	//서브 메뉴 출력용 메소드 매개변수 no 반환타입 void
	private void printSubMenu() {
		System.out.println("====================서브메뉴====================");
		System.out.println("         1.학생 2.교사 3.메인 메뉴로 이동");
		System.out.println("==============================================");
		System.out.println("서브 메뉴 번호를 입력하세요");
	}
	/*
	 * 컬렉션에 저장된 데이터를 파일로 저장하는 로직
	 * 데이터 소스:컬렉션(메모리)-입력스트림 불필요
	 * 데이터 목적지:파일(FileRW.txt)-FileWriter
	 * 
	 * 
	 */
	private void savePerson() {
		if(perList.isEmpty()) {
			System.out.println("파일로 저장할 사람이 없어요");
			return;
		}
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(
					new FileWriter(
							"src/console/academy/FileRW.txt"),true);
			for (Person per : perList) {
				pw.println(per.get());
			}
			System.out.println("[파일 저장 완료]");
		} catch (IOException e) {
			System.out.println("[파일 저장시 오류:"+e.getMessage()+"]");
		} finally {
			if(pw!=null) pw.close();
		}
	}
}
