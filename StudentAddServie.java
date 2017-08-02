package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

//입출력은 다 서비스에서 
public class StudentAddServie implements StudentService {


	@Override
	public void execute(Scanner scan) {
		System.out.println("번호/이름/주소/성별/반/키/나이/점수/학년 차례대로 입력하세요.");

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

		//StudentManager의 add메소드 사용 //static 붙어 있으니까 클래스 이름(StudentManager)호출할 수 있다.
		String s=StudentManager.add(stu);
		                           //stu는 스튜던트 객체 이것은 매니저에 갈거 
		System.out.println(stu);
	}
}





