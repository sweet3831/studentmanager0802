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

//Ŭ���� �� ��� �ϳ� 
//������� �� ���񽺿��� 
//���⼭ ����Ʈ ȣ�� 

public class StudentListService implements StudentService {
	
	private static final String Map = null;
	//���� : Ÿ�� StudentManager �̸� sm  /// ��ü �Ҵ�: new StudentManager();
	StudentManager sm = new StudentManager();
//���⼭ ����ġ ���̽� �ٽ� 3�� �ۼ��ϱ�
	@Override
	public void execute(Scanner scan) {

		List<Student> list = StudentManager.list();
		//��ȯ���� ���� �� = �� ����Ѵ�.
		//StudentManager Ŭ������ list() �޼ҵ带 ����� �ǵ�
		//��ȯ���� List<Student>�̰� �̸��� list�� ����� ���.
		
		
		
		while(true){
		
		    System.out.println("3.1 �̸��� �������� ����");
			System.out.println("3.2 ������ �������� ����");
			System.out.println("3.3	�ݺ� ����Ʈ ���");
			System.out.println("0 ������");
			
			switch(scan.nextInt()){
			case 1:
				 System.out.println("3.1 �̸��� �������� ����");
				 list.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
//				 list.sort((left,right)->left.getName().compareTo(right.getName()));
				 Iterator<Student> slist = list.iterator();
					System.out.println("�л����� (��ȣ/�̸�/�ּ�/����/��/Ű/����/����/�г�)");
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
				System.out.println("3.2 ������ �������� ����------------------------------");
				list.sort((left,right)->right.getScore()-left.getScore());
				//int �⺻���̶� �޼ҵ尡 ����. �׳� ����� �Ѵ�. 
				 Iterator<Student> slist1 = list.iterator();
					System.out.println("�л����� (��ȣ/�̸�/�ּ�/����/��/Ű/����/����/�г�)");
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
				System.out.println("3.3�ݺ� ����Ʈ ���");

				Map<String, List<Student>> map = new HashMap<>();

				 Iterator<Student> slist3 = list.iterator();
					System.out.println("�л����� (��ȣ/�̸�/�ּ�/����/��/Ű/����/����/�г�)");
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
				System.out.println("������");
				System.exit(0);
			
			}
		
		
		
		
		
		

	}
	}
}





