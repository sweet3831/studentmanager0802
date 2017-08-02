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
 * 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
   2. �������� �߰�(��ȣ, �����Է�)
   3. �л� ����Ʈ ���
		3.1 �̸��� �������� ����
		3.2 ������ �������� ����
		3.3	�ݺ� ����Ʈ ���
    4. �л� ���� �˻�
		4.1 �ּ� �˻�
		4.2	�̸� �˻�
	5. ���
		5.1 ������ �׷���
		5.2 �ݺ� ���� ���
		5.3	�ּҺ� ���� ���
		5.4 �г⺰ Ű ���
	0. ����

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
     		 System.out.println("�޴�------------------------------");
             System.out.println("1.�л����� �߰�|2.�������� �߰�|3. �л� ����Ʈ ���|4.�л� ���� �˻�|5.���|0.����");

			switch(scan.nextInt()){
			case 1:
				
				System.out.println(" 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)");
				s = new StudentAddServie();
				//StudentAddServieŬ������ execute�޼ҵ带 ȣ���ض�. 
				s.execute(scan);
				break;
				
				
			case 2:
				
				System.out.println(" 2. �������� �߰�(��ȣ, �����Է�)");
				s = new StudentScoreAddServie();
				s.execute(scan);
				break;
				
			case 3:
				
				System.out.println(" 3. �л� ����Ʈ ��� "); 
				s= new StudentListService();
				s.execute(scan);
				break;
				
			case 4:
				
				System.out.println(" 4. �л� ���� �˻�");
				s = new SearchService();
				s.execute(scan);
				break;
				
			case 5:
				
				System.out.println(" 5. ���");
				s = new ChartService();
				s.execute(scan);
				break;
				
			case 0:
				
				System.out.println(" 0. ����");
				System.exit(0);
			    //6.
//				if(scan != null)
//					scan.close();				
//				throw new NullException("�й��� �Է��ϼ���");//exception�� �Ϻη� �߻���Ų��.
				break;
				
			}
			
		}
		
		
	
		
	}//end of main


}//end of class
















