package kosta.student.exceptions;

public class NullException extends RuntimeException{

	public NullException(String msg){
		super(msg);//부모(RuntimeException)의 생성자 호출
	}
}
