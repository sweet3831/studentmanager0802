package kosta.student.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

//클래스 당 기능 하나 
//입출력은 다 서비스에서 
//여기서 리스트 호출 

public class StudentListService implements StudentService {
	
	private static final String Map = null;
	//선언 : 타입 StudentManager 이름 sm  /// 객체 할당: new StudentManager();
	StudentManager sm = new StudentManager();
//여기서 스위치 케이스 다시 3개 작성하기
	@Override
	public void execute(Scanner scan) {

		List<Student> list = StudentManager.list();
		//반환형이 있을 때 = 을 사용한다.
		//StudentManager 클래스의 list() 메소드를 사용할 건데
		//반환형이 List<Student>이고 이름은 list라도 만들어 줬다.
		
		
		
		while(true){
		
		    System.out.println("3.1 이름순 오름차순 정렬");
			System.out.println("3.2 성적순 내림차순 정렬");
			System.out.println("3.3	반별 리스트 출력");
			System.out.println("0 나가기");
			
			switch(scan.nextInt()){
			case 1:
				 System.out.println("3.1 이름순 오름차순 정렬");
				 list.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
//				 list.sort((left,right)->left.getName().compareTo(right.getName()));
				 Iterator<Student> slist = list.iterator();
					System.out.println("학생정보 (번호/이름/주소/성별/반/키/나이/점수/학년)");
					System.out.println("-------------------------------------------------");
					while (slist.hasNext()) {
						Student s = slist.next();

						System.out.print(" " + s.getNum() + "  ");
						System.out.print(" " + s.getName() + "  ");
						System.out.print(" " + s.getAddr() + "  ");
						System.out.print(" " + s.getGender() + "  ");
						System.out.print(" " + s.getBan() + "  ");
						System.out.print(" " + s.getHeight() + "  ");
						System.out.print(" " + s.getAge() + "  ");
						System.out.print(" " + s.getScore() + "  ");
						System.out.print(" " + s.getYear() + "  ");

						System.out.println();
					}
				 
				 break;
			
			case 2:
				System.out.println("3.2 성적순 내림차순 정렬------------------------------");
				list.sort((left,right)->right.getScore()-left.getScore());
				//int 기본형이라 메소드가 없다. 그냥 빼기로 한다. 
				 Iterator<Student> slist1 = list.iterator();
					System.out.println("학생정보 (번호/이름/주소/성별/반/키/나이/점수/학년)");
					System.out.println("-------------------------------------------------");
					while (slist1.hasNext()) {
						Student s = slist1.next();

						System.out.print(" " + s.getNum() + "  ");
						System.out.print(" " + s.getName() + "  ");
						System.out.print(" " + s.getAddr() + "  ");
						System.out.print(" " + s.getGender() + "  ");
						System.out.print(" " + s.getBan() + "  ");
						System.out.print(" " + s.getHeight() + "  ");
						System.out.print(" " + s.getAge() + "  ");
						System.out.print(" " + s.getScore() + "  ");
						System.out.print(" " + s.getYear() + "  ");

						System.out.println();
					}
				     
					
					
				break;
			
			case 3:
				System.out.println("3.3반별 리스트 출력");

				Map<String, List<Student>> map = new HashMap<>();

				 Iterator<Student> slist3 = list.iterator();
					System.out.println("학생정보 (번호/이름/주소/성별/반/키/나이/점수/학년)");
					System.out.println("-------------------------------------------------");
					while (slist3.hasNext()) {
						Student s = slist3.next();

						System.out.print(" " + s.getNum() + "  ");
						System.out.print(" " + s.getName() + "  ");
						System.out.print(" " + s.getAddr() + "  ");
						System.out.print(" " + s.getGender() + "  ");
						System.out.print(" " + s.getBan() + "  ");
						System.out.print(" " + s.getHeight() + "  ");
						System.out.print(" " + s.getAge() + "  ");
						System.out.print(" " + s.getScore() + "  ");
						System.out.print(" " + s.getYear() + "  ");

						System.out.println();
					}
				
				
				
				break;
			
			case 0: 
				System.out.println("나가기");
				System.exit(0);
			
			}
		
		
		
		
		
		

	}
	}
}





