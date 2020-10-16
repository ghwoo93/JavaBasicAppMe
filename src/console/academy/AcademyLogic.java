package console.academy;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class AcademyLogic {
	public static final int MAX_PERSON=3;//최대인원수
	Person[] perArr;
	
	public AcademyLogic() {
		perArr = new Person[MAX_PERSON];
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
		String input="";
		while(true) {
			input=sc.nextLine();
//			if(CommonUtilities.isNumber(input) && input.length()!=0) {
//			if(CommonUtilities.isNumber(input) && !input.equals("")) {
			if(!CommonUtilities.isNumber(input) || input.equals("")) {
				System.out.print("메뉴번호는 숫자만....");
			}else {
				break;
			}
		}
		return Integer.parseInt(input);
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
		int index = -1;//채워지지 않은 Person형 배열의 인덱스를 저장할 편수
		for (int i = 0; i < MAX_PERSON; i++) {
			if(perArr[i]==null) {
				index=i;
				break;
			}
		}
		if(index==-1) {//이미 정원이 찼음
			System.out.println("정원이 찼어요 더이상 입력할 수 없어요");
			return;
		}
		//정원이 안찬 경우 즉 index가 -1이 아닌 경우
		//이름과 나이는 둘다 공통
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(sc.nextLine());
		//학생과 교사를 구분해서 입력받기
		switch(subMenu) {
			case 1:
				System.out.println("학번을 입력하세요");
				String stNumber = sc.nextLine();
				perArr[index] = new Student(name, age, stNumber);
				break;
			default: //교사인경우
				System.out.println("과목을 입력하세요");
				String subject = sc.nextLine();
				perArr[index] = new Teacher(name, age, subject);
		}
	}///setPerson
	//출력용 메소드 매개변수 no 반환타입 void
	private void printPerson() {
		//학생 교사 구분 없이
//		for (int i = 0; i < perArr.length; i++) {
//			if(perArr[i]!=null) perArr[i].print();
//		}
		StringBuffer sbT = new StringBuffer("[교사목록]\r\n");
		StringBuffer sbSt = new StringBuffer("[학생목록]\r\n");
		for (int i = 0; i < perArr.length; i++) {
			if(perArr[i]!=null) {
				if(perArr[i] instanceof Student) 
					sbSt.append(perArr[i].get()+"\r\n");
				else sbT.append(perArr[i].get()+"\r\n");
			}
		}
		//주소+주소가 안되기 때문에 문자열로 바꿔줌
		System.out.println(sbSt.toString()+sbT);
	}////printPerson
	
	//이름으로 검색하는 메소드 매개변수 String(수정/삭제) 반환타입 Person
	private Person findPersonByName(String title) {
		System.out.println(title+"할 이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for (int i = 0; i < perArr.length; i++) {
			if(perArr[i] !=null) {
				if(perArr[i].name.equals(name)) {
					return perArr[i];
				}
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
					findPerson.age = Integer.parseInt(sc.nextLine());
					break;
				case 2:
					if(findPerson instanceof Student) {
						st.stNumber = sc.nextLine();
					}else {
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
			for (int i = 0; i < perArr.length; i++) {
				if(findPerson.name.equals(perArr[i].name)) {
					perArr[i]= null;
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
}
