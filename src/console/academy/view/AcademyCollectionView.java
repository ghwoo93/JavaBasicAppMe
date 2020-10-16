package console.academy.view;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import console.academy.Person;
import console.academy.Student;
import console.academy.Teacher;
import console.academy.service.AcademyDTO;
import console.academy.service.IAcademyService;
import console.academy.service.IAcademyServiceImpl;
public class AcademyCollectionView {
	//멤버상수
	public static final int MAX_PERSON = 3; //최대 인원수
	//멤버변수
	List<Person> person; //add remove clear size
	
	private IAcademyService service;
	
	//생성자
	public AcademyCollectionView() {
		person = new Vector<Person>();
		service = new IAcademyServiceImpl("ACADEMY","ACADEMY");
		DatabaseToCollection();
	}
	private void DatabaseToCollection() {
		try {
			List<AcademyDTO> list = service.selectList(null);
			for(AcademyDTO dto:list) {
				String name = dto.getName();
				int age = Integer.parseInt(dto.getAge());
				String identity = dto.getIdentity();
				if("T".equals(dto.getJob())) {
					person.add(new Teacher(name, age, identity));
				}else {
					person.add(new Student(name,age,identity));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//멤버 메소드
	/*
	 * 1] 메뉴출력용 메소드
	 * 매개변수 : NO
	 * 반환타입 : void
	 */
	public void printMainMenu() {
		System.out.println("==============================메인 메뉴==============================");
		System.out.println("|------ 1:입력 | 2:출력 | 3.수정 | 4.삭제 | 5.검색 | | 9.종료  ------|");
		System.out.println("==================================================================");
		System.out.print("메인 메뉴 번호를 입력하세요.? : ");
	} //---------- printMainMenu Method
	
	/*
	 * 2] 메뉴번호 입력용 메소드
	 * 매개변수 : NO
	 * 반환타입 : int
	 */
	public int getMenuNumber() {
		/*
		 * 문제]
		 * 	메뉴번호를 숫자형식이 아닌 문자열을 입력시 "메뉴 번호는 숫자만..." 라는 메시지를 뿌려주고
		 *  정상적인 숫자형식의 문자열을 입력받을때까지 다시 메뉴번호를 입력받록하여라
		 *  isNumber호출하기
		 */
		Scanner scan = new Scanner(System.in);
		/*
		String inputValue;
		while(true) {
			inputValue = scan.nextLine();
			if(  !(CommonUtilities.isNumber(inputValue)) || inputValue.equals("") )
			{
				System.out.println("메뉴 번호는 숫자만...");
				System.out.print("메인 메뉴 번호를 입력하세요.? : ");
				continue;
			}
			break;
		}
		return Integer.parseInt(inputValue);	
		*/
		int menuNumber;
		while(true) {
			String menuString = scan.nextLine();
			try {
				menuNumber = Integer.parseInt(menuString);
				return menuNumber;
			}catch(Exception e) {
				System.out.println("Menu number is only Integer...");
			}
		}
	} //---------- getMenuNumber Method
	
	/*
	 * 3] 메뉴번호에 따른 분기용 메소드
	 * 매개변수 : int(메인메뉴)
	 * 반환타입 : void
	 */
	public void seperateMainMenu(int mainMenu)
	{
		switch(mainMenu) {
			case 1 : //입력
				while(true){
					//System.out.println("입력받기");
					//서브메뉴 출력
					printSubMenu();
					int subMenu=getMenuNumber(); //1이나 2인경우 입력처리
					if(subMenu==3) break;
					switch(subMenu)
					{
						case 1:
						case 2:setPerson(subMenu);break;
						default:System.out.println("서브메뉴에 없는 번호 입니다.");
					}
				}
				break;
			case 2 : //출력
				printPerson();
				break;
			case 3 : //수정
				undatePerson();
				break;
			case 4:
				deletePerson();
				break;//삭제
			case 5 : //검색
				searchPerson();
				break;
			case 6 :
				savePerson();
				break;//파일저장
			case 9 : //종료
				service.close();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default : System.out.println("메뉴에 없는 번호입니다.");//게임종료
		}
	}
	
	/*
	 * 5] 서브메뉴에 따른 삭생 및 교사 데이타 입력용 메소드
	 * 	매개변수 : int(서브메뉴)
	 * 	반환타입 : void
	 */
	private void setPerson(int subMenu) {
		//정원이 찼는지 여부판단하기
		
		//정원이 안찬 경우 즉 index가 -1이 아닌경우..
		//이름과 나이는 둘다 공통이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		String name= sc.nextLine();
		System.out.print("나이를입력하세요. : ");
		int age=0;
		while(true) {
			try {
				age = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("나이는 숫자만 .....");
			}
		}
		try {
		//학생과 교사를 구분해서 입력받기
		switch(subMenu) {
			case 1: //학생인 경우
				System.out.print("학번을 입력하세요. : ");
				String stNumber = sc.nextLine();
				person.add(new Student(name, age, stNumber));
				service.insert(new AcademyDTO(null, name, stNumber, "S", String.valueOf(age)));
				break;
			default : //교사인경우
				System.out.print("과목을 입력하세요. : ");
				String subject = sc.nextLine();
				person.add(new Teacher(name, age, subject));
				service.insert(new AcademyDTO(null, name, subject, "T", String.valueOf(age)));
			}
		} catch(Exception e) {e.printStackTrace();}
	} //---------- setPerson
	
	/*
	 * 6] 출력용 메소드
	 * 매개변수 : No
	 * 반환타입 : void
	 */
	private void printPerson() {
		/*
		 * 문제]
		 * [학생목록]
		 * ~~~
		 * [교사목록]
		 * ~~~
		 */
		
		System.out.println("[학생/교사 구분해서 출력하여라]");
		System.out.println("[학생 목록]");
		for(Person p : person) {
			if(p instanceof Student)
					p.print();
		}
		System.out.println("[교사 목록]");
		for(Person p : person) {
			if(p instanceof Teacher)
					p.print();
		}
		
		/*
		 * Stringbuffer 2개 만들어서 각각 학생과 교사
		 * 생성자 초기값은 각각 "[00 목록]" 넣어두고
		 * 값 구분해서 각각 넣어두고
		 * 출력할때 syso 한줄로 출력할 수있다.
		 */
		
		
	} //---------- printPerson
	
	/*
	 * 7] 이름으로 검색하는 메소드
	 * 매개변수 : String (수정 / 삭제/ 검색용 타이틀)
	 * 반환타입 : Person
	 */
	private Person findPersonByName(String title) {
		System.out.print(title+"할 이름을 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		for(Person p : person)
			if(name.equals(p.name)) { //이름이 있는경우
				return p;
			}
		//검색된 이름이 없는 경우
		System.out.println(name+"으로(로) 검색된 정보가 없어요. ");
		//검색한 이름이 없는 경우
		return null;
	}
	
	/* 8] 검색용 메소드 */
	private void searchPerson() {
		Person findPerson =  findPersonByName("검색");
		if(findPerson != null) // 찾은 사람의 정보 출력
		{
			System.out.println("[ "+findPerson.name+" 검색결과한 결과] ");
			findPerson.print();
		}
	}
	
	/*
	 * 9] 수정용 메소드
	 */
	
	private void undatePerson() {
		Person updatePerson = findPersonByName("수정");
		try {
			if (updatePerson != null) {
				Scanner sc = new Scanner(System.in);
				// 나이
				System.out.println("수정할 나이를 입력하세요?");
				int age = Integer.parseInt(sc.nextLine());
				updatePerson.age = age;
				// 여기도 예외처리 해야함
				if (updatePerson instanceof Student) {
					System.out.println("수정할 학번을 입력하세요");
					String stNumber = sc.nextLine();
					((Student) updatePerson).stNumber = stNumber;
					service.update(new AcademyDTO(null, updatePerson.name, stNumber, null, String.valueOf(age)));
				} // 안쪽if
				else {
					System.out.println("수정할 과목을 입력하세요");
					String subject = sc.nextLine();
					service.update(new AcademyDTO(null, updatePerson.name, subject, null, String.valueOf(age)));
					((Teacher) updatePerson).subject = subject;
					// ((Student)person).stNumber => person타입을 다운캐스팅
				} // else
				System.out.printf("[%s가 수정되었어요]", updatePerson.name);
				// 수정한 내용 확인
				updatePerson.print();
			} /// 바깥 if
		} catch (Exception e) {
			
		}
	}
	
	private void deletePerson() {
		Person findPerson = findPersonByName("삭제");
		try {
			for(Person p : person) {
				if(findPerson.name.equals(p.name)) {
						person.remove(p);
						service.delete(new AcademyDTO(null, findPerson.name,null,null,null));
					break;
				}
			}
		}
		 catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	
	/*
	 * 4] 서브메뉴 출력용 메소드
	 * 	매개변수 : NO
	 * 	반환타입 : void
	 */
	public void printSubMenu() {
		System.out.println("==============================서브 메뉴==============================");
		System.out.println("|----------------- 1:학생 | 2:교사 | 3.메인메뉴로 이동   -------------------|");
		System.out.println("==================================================================");
		
		System.out.print("서브 메뉴 번호를 입력하세요.? : ");
	} //---------- printMainMenu Method
	
	/*
	 * 컬렉션에 저장된 데이터를 파일에 저장하는 로직
	 * 소스 	: 컬렉션(메모리) - 입력스트림 불필요
	 * 목적지 	: 파일(FileRW.txt) - FileWriter
	 *
	 * 힌트 : 한명 저장시마다 끝에 \r\n추가
	 * 이름:홍길동,나이:20,학번:2017
	 * 이름:홍길동,나이:30,학번:2016
	 * 이름:홍길동,나이:20,과목:자바
	 */
	private void savePerson() {
		/*
		 * 차라리 컬렉션에 반영할때 DB에도 반영하면 좋다.
		 * 그러면 DB저장메뉴은 필요가 없어지게 된다.
		 */
		//파일로 저장할 사람이 없음
		if(person.isEmpty()) {
			System.out.println("데이터베이스에 저장할 사람이 없어요.");
			return;
		}
		try {
			for(Person p : person) {
				if(p instanceof Student) {
					service.insert(new AcademyDTO(null, p.name, ((Student) p).stNumber, "S", String.valueOf(p.age)));
				}
				else {
					service.insert(new AcademyDTO(null, p.name, ((Teacher) p).subject, "T", String.valueOf(p.age)));
				}
			}
		}catch(Exception e) {e.printStackTrace();}
	} //-------- savePerson
} //------ class