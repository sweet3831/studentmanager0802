package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

//������� �� ���񽺿��� 
public class StudentAddServie implements StudentService {


	@Override
	public void execute(Scanner scan) {
		System.out.println("��ȣ/�̸�/�ּ�/����/��/Ű/����/����/�г� ���ʴ�� �Է��ϼ���.");

		int num = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		String addr = scan.nextLine();
		String gender = scan.nextLine();
		String ban = scan.nextLine();
		double height = scan.nextDouble();
		int age = scan.nextInt();
		int score = scan.nextInt();
		int year = scan.nextInt();

		Student stu = new Student();

		stu.setNum(num);
		stu.setName(name);
		stu.setAddr(addr);
		stu.setGender(gender);
		stu.setBan(ban);
		stu.setHeight(height);
		stu.setAge(age);
		stu.setScore(score);
		stu.setYear(year);

		//StudentManager�� add�޼ҵ� ��� //static �پ� �����ϱ� Ŭ���� �̸�(StudentManager)ȣ���� �� �ִ�.
		String s=StudentManager.add(stu);
		                           //stu�� ��Ʃ��Ʈ ��ü �̰��� �Ŵ����� ���� 
		System.out.println(stu);
	}
}





