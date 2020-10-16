package console.academy;

import console.academy.view.AcademyCollectionView;

public class AcademyApp {
	public static void main(String[] args) {
//		AcademyLogic logic = new AcademyLogic();
		//파일 저장 추가 fileReader/fileWriter
//		AcademyFileRWCollectionLogic logic = new AcademyFileRWCollectionLogic();
		//objectinputstream objcectoutputstream
//		AcademyObjectCollectionLogic logic = 
//				new AcademyObjectCollectionLogic();
		AcademyCollectionView logic = new AcademyCollectionView(); 
		while(true) {
			//1메인메뉴
			logic.printMainMenu();
			//2메인메뉴 번호 입력받기
			int mainMenu = logic.getMenuNumber();
			//3메인메뉴에 따른 분기
			logic.seperateMainMenu(mainMenu);
		}
		
	}
}
