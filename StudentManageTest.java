package kosta.student.test;

import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.service.ChartService;
import kosta.student.service.SearchService;
import kosta.student.service.StudentAddServie;
import kosta.student.service.StudentListService;
import kosta.student.service.StudentScoreAddServie;
import kosta.student.service.StudentService;
/**
 * 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년)
   2. 성적정보 추가(번호, 성적입력)
   3. 학생 리스트 출력
		3.1 이름순 오름차순 정렬
		3.2 성적순 내림차순 정렬
		3.3	반별 리스트 출력
    4. 학생 정보 검색
		4.1 주소 검색
		4.2	이름 검색
	5. 통계
		5.1 성별별 그룹핑
		5.2 반별 성적 평균
		5.3	주소별 성적 평균
		5.4 학년별 키 평균
	0. 종료

 *
 */
public class StudentManageTest {


	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Logger logger = Logger.getLogger("StudentProject");
		logger.info("StudentManagerTest");
		
		StudentService s= null;
		StudentManageTest smt = new StudentManageTest(); 
	
		
		
		while(true){
     		 System.out.println("메뉴------------------------------");
             System.out.println("1.학생정보 추가|2.성적정보 추가|3. 학생 리스트 출력|4.학생 정보 검색|5.통계|0.종료");

			switch(scan.nextInt()){
			case 1:
				
				System.out.println(" 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년)");
				s = new StudentAddServie();
				//StudentAddServie클래스의 execute메소드를 호출해라. 
				s.execute(scan);
				break;
				
				
			case 2:
				
				System.out.println(" 2. 성적정보 추가(번호, 성적입력)");
				s = new StudentScoreAddServie();
				s.execute(scan);
				break;
				
			case 3:
				
				System.out.println(" 3. 학생 리스트 출력 "); 
				s= new StudentListService();
				s.execute(scan);
				break;
				
			case 4:
				
				System.out.println(" 4. 학생 정보 검색");
				s = new SearchService();
				s.execute(scan);
				break;
				
			case 5:
				
				System.out.println(" 5. 통계");
				s = new ChartService();
				s.execute(scan);
				break;
				
			case 0:
				
				System.out.println(" 0. 종료");
				System.exit(0);
			    //6.
//				if(scan != null)
//					scan.close();				
//				throw new NullException("학번을 입력하세요");//exception을 일부러 발생시킨다.
				break;
				
			}
			
		}
		
		
	
		
	}//end of main


}//end of class
















