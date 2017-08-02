package kosta.student.manage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import kosta.student.vo.Student;

//DBó�� 
//��ũ �� ����Ʈ
//����� ��ȯ��
//���� �������� ������ �ϴ� ��.....
/**
 * Student ���� ������ ó���ϴ� Ŭ���� ����� �Ұ���
 *
 */

// Ŭ���� ����
public class StudentManager {
	// �����ʹ� �ᱹ ����� ���´�.
	// private �ʵ忡 �����ϰ� ������ �޼ҵ� ����� �ش�. //�ʵ� ���� ����
	// �л����� �����ϴ� ����Ʈ = �ϳ���!
	private static List<Student> list = new LinkedList<Student>();

	// static�� �ʱ�ȭ �� �� ����ϴ� ���
	static {
		list.add(new Student(10, "������", "����", "��", "A", 175.0, 20, 30, 1));
		list.add(new Student(20, "������", "����", "��", "A", 175.0, 20, 40, 1));
		list.add(new Student(30, "�ٴٴ�", "���", "��", "B", 180.0, 21, 50, 2));
		list.add(new Student(40, "����", "���", "��", "B", 160.0, 21, 60, 3));
		list.add(new Student(50, "������", "����", "��", "C", 170.0, 22, 70, 3));
		list.add(new Student(60, "�ٹٹ�", "����", "��", "C", 165.0, 23, 80, 4));
		list.add(new Student(70, "����", "����", "��", "A", 178.0, 23, 90, 4));
	}

	// ���⼭ ����ϴ� �ڵ带 ����� �ش�.
	// �Ķ����(�Ű�����) : student�� �ѱ�ڴٴ� ���

	// �޼ҵ� ����
	public static String add(Student s) {
		System.out.println(list.add(s));
		return s.getName() + "�л��� ������ ���������� �ԷµǾ����ϴ�.";
	}

	// �޼ҵ� ����
	// ���������� ��ȯ�� �̸� �Ű�����
	public static List<Student> list() {
		// Collections.sort(list);
		// Collections.sort(list, Compare);
		return list;

	}// list

	// �˻�

	public String search(String name) {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getName().equals(name)) {
				return s.toString();
			}
		}
		return "�˻��� �̸��� �������� �ʽ��ϴ�.";
	}

	public String searchad(String addr) {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getAddr().equals(addr)) {
				return s.toString();
			}
		}
		return "�˻��� �ּҰ� �������� �ʽ��ϴ�.";
	}

	// ��� ������ ó��
	public static List<Student> ChartService() {
		System.out.println("5.1 ������ �׷��� ------------------------------------");
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(t -> t.getGender()));

		List<Student> list1 = map.get("��");
		List<Student> list2 = map.get("��");

		System.out.println(list1);
		System.out.println(list2);

		System.out.println("5.2�ݺ� ���� ���--------------------------------------");
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


