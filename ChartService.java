package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class ChartService implements StudentService {

	StudentManager sm = new StudentManager();
	
	
	@Override
	public void execute(Scanner scan) {
		
		sm.ChartService();

	}


}

		
	
