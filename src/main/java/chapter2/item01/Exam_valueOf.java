package chapter2.item01;

public class Exam_valueOf {

	public static boolean valueOf(boolean b){
		return b?Boolean.TRUE: Boolean.FALSE;
	}
	
	public static void main(String[] args) {
		System.out.println(valueOf(true));
		System.out.println(valueOf(false));
	}
}
