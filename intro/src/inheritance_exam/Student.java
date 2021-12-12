package inheritance_exam;

public class Student extends Person {
	
	private String sudentID;
	private int grade;
	private double GPA;
	
	public String getSudentID() {
		return sudentID;
	}
	public void setSudentID(String sudentID) {
		this.sudentID = sudentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public Student(String name, int age, int height, int weight, String sudentID, int grade, double gPA) {
		super(name, age, height, weight);//자신의 부모가 가지고 있는 생성자를 실행하겠다.
		this.sudentID = sudentID;
		this.grade = grade;
		GPA = gPA;
	}

	public void show() {
		System.out.println("------------------------------------------------------");
		System.out.println("학생 이름:"+ getName());
		System.out.println("학생 나이:"+ getAge());
		System.out.println("학생 키:"+ getHeight());
		System.out.println("학생 몸무게:"+ getWeight());
		System.out.println("학번:"+ getSudentID());
		System.out.println("학년:"+ getGrade());
		System.out.println("학점:"+ getGPA());
	}
	
}
