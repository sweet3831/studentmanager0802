package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class SearchService implements StudentService {
	  Scanner scan = new Scanner(System.in);

		
		   @Override
			public void execute(Scanner scan) {
	      StudentManager sm = new StudentManager();
	      SearchService ss = new SearchService(); // ���� ���� ���� �޼ҵ� �߰�
	      while (true) {
	       
	    	  System.out.println("1.�̸��˻�, 2.�ּҰ˻�");
	         switch (scan.nextInt()) {
	        
	         case 1:
	        	 	System.out.println("�˻��� ������� �̸��� �Է��ϼ���.");
	        	 	System.out.println( sm.search(ss.nextLine()));
	        	 	break;
	            
	         case 2:
		            System.out.println("�˻��� �ּҸ� �Է��ϼ���.");
		            System.out.println( sm.searchad(ss.nextLine()));
		            break;
	      
	         case 0:
	        	 System.out.println("������");
				 System.exit(0);
				 break;
				
	         default:
	            System.out.println("�ȹٷ� �Է��ϼ���");
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
	            scan.nextLine(); // ���� ����
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
	            System.out.println("�˼� ���� ������ �߻��Ͽ����ϴ�.");
	         }
	      }
	      return str;
	   }
//	   }
	}
// end of class
