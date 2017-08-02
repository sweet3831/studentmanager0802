package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class SearchService implements StudentService {
	  Scanner scan = new Scanner(System.in);

		
		   @Override
			public void execute(Scanner scan) {
	      StudentManager sm = new StudentManager();
	      SearchService ss = new SearchService(); // 버퍼 비우기 위한 메소드 추가
	      while (true) {
	       
	    	  System.out.println("1.이름검색, 2.주소검색");
	         switch (scan.nextInt()) {
	        
	         case 1:
	        	 	System.out.println("검색할 사용자의 이름을 입력하세요.");
	        	 	System.out.println( sm.search(ss.nextLine()));
	        	 	break;
	            
	         case 2:
		            System.out.println("검색할 주소를 입력하세요.");
		            System.out.println( sm.searchad(ss.nextLine()));
		            break;
	      
	         case 0:
	        	 System.out.println("나가기");
				 System.exit(0);
				 break;
				
	         default:
	            System.out.println("똑바로 입력하세요");
	            break;
	         }
	         
	         continue;
	      }

	   }// end of main

	   public int nextInt() {
	      int x = -1;
	      while (true) {
	         try {
	            x = scan.nextInt();
	            scan.nextLine(); // 버퍼 비우기
	            if (x >= 0 && x <= 100)
	               break;
	         } catch (Exception e) {
	         }
	      }
	      return x;
	   }

	   public String nextLine() {
	      String str = "";
	      while (true) {
	         try {
	            str = scan.nextLine();
	            if (str.length() <= 10)
	               break;
	         } catch (Exception e) {
	            System.out.println("알수 없는 에러가 발생하였습니다.");
	         }
	      }
	      return str;
	   }
//	   }
	}
// end of class
