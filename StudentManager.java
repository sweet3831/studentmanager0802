package kosta.student.manage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import kosta.student.vo.Student;

//DB처리 
//링크 드 리스트
//여기는 반환형
//정보 꺼내오고 보내고 하는 거.....
/**
 * Student 관련 데이터 처리하는 클래스 입출력 불가능
 *
 */

// 클래스 정의
public class StudentManager {
	// 데이터는 결국 여기로 들어온다.
	// private 필드에 접근하고 싶으면 메소드 만들어 준다. //필드 정보 은닉
	// 학생정보 저장하는 리스트 = 하나만!
	private static List<Student> list = new LinkedList<Student>();

	// static을 초기화 할 때 사용하는 방법
	static {
		list.add(new Student(10, "가가가", "서울", "남", "A", 175.0, 20, 30, 1));
		list.add(new Student(20, "나나나", "서울", "여", "A", 175.0, 20, 40, 1));
		list.add(new Student(30, "다다다", "경기", "남", "B", 180.0, 21, 50, 2));
		list.add(new Student(40, "라라라", "경기", "여", "B", 160.0, 21, 60, 3));
		list.add(new Student(50, "마마마", "대전", "남", "C", 170.0, 22, 70, 3));
		list.add(new Student(60, "바바바", "제주", "여", "C", 165.0, 23, 80, 4));
		list.add(new Student(70, "사사사", "제주", "남", "A", 178.0, 23, 90, 4));
	}

	// 여기서 출력하는 코드를 만들어 준다.
	// 파라미터(매개변수) : student로 넘기겠다는 얘기

	// 메소드 정의
	public static String add(Student s) {
		System.out.println(list.add(s));
		return s.getName() + "학생의 정보가 성공적으로 입력되었습니다.";
	}

	// 메소드 정의
	// 접근제한자 반환형 이름 매개변수
	public static List<Student> list() {
		// Collections.sort(list);
		// Collections.sort(list, Compare);
		return list;

	}// list

	// 검색

	public String search(String name) {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getName().equals(name)) {
				return s.toString();
			}
		}
		return "검색한 이름이 존재하지 않습니다.";
	}

	public String searchad(String addr) {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getAddr().equals(addr)) {
				return s.toString();
			}
		}
		return "검색한 주소가 존재하지 않습니다.";
	}

	// 통계 데이터 처리
	public static List<Student> ChartService() {
		System.out.println("5.1 성별별 그룹핑 ------------------------------------");
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(t -> t.getGender()));

		List<Student> list1 = map.get("남");
		List<Student> list2 = map.get("여");

		System.out.println(list1);
		System.out.println(list2);

		System.out.println("5.2반별 성적 평균--------------------------------------");
		Map<String, Double> map2 = list.stream()
				.collect(Collectors.groupingBy(t -> t.getBan(), Collectors.averagingInt(t -> t.getScore())));

		Double d1 = map2.get("A");
		Double d2 = map2.get("B");
		Double d3 = map2.get("C");

		System.out.println(map2);

//		System.out.println("A" + d1 + "B" + d2 + "C" + d3);

		return list;
	}


}


