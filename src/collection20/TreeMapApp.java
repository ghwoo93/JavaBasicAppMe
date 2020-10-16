package collection20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapApp {
	public static void main(String[] args) {
		String[] stringArray = {"홍길동","가길동","도길동","나길동","마길동"};
		Arrays.sort(stringArray);//in-place 방식
		System.out.println("[배열 정렬후 출력]");
		for (String ele : stringArray) System.out.println(ele);
		System.out.println(Arrays.toString(stringArray));
		/*
		 * Ar
		 */
		int searchIndex = Arrays.binarySearch(stringArray, "길동");
		System.out.println("searchIndex"+searchIndex);
		
		List<Integer> list = Arrays.asList(200,150,35,1004);
		for (Integer e : list) System.out.println(e);
		Collections.sort(list);
		System.out.println("[컬렉션 요소 정렬후 출력]");
		for (Integer e : list) System.out.println(e);
		
		//리스트 계열 컬렉션을 배열로 변환:리스트계열 컬렉션.toArray()
		Object[] objArr = list.toArray();
		System.out.println("리스트를 배열로 변환 후 출력");
		System.out.println(Arrays.toString(objArr));
		
		TreeMap map = new TreeMap();
		map.put('ㄷ', "도길동");
		map.put('ㅎ', "하길동");
		map.put('ㅁ', "마길동");
		map.put('ㅂ', "바길동");
		map.put('ㄱ', "고길동");
		System.out.println("오름 차순으로 출력 - 디폴트");
		Set keys = map.keySet();
		for(Object key:keys) {
			Object value = map.get(key);
			System.out.println(String.format("%s : %s", key,value));
		}
		System.out.println("내름 차순으로 출력 - 디폴트");
		keys = map.descendingKeySet();
		for(Object key:keys) {
			Object value = map.get(key);
			System.out.println(String.format("%s : %s", key,value));
		}
		
	}
}
