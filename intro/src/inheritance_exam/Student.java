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
		super(name, age, height, weight);//�ڽ��� �θ� ������ �ִ� �����ڸ� �����ϰڴ�.
		this.sudentID = sudentID;
		this.grade = grade;
		GPA = gPA;
	}

	public void show() {
		System.out.println("------------------------------------------------------");
		System.out.println("�л� �̸�:"+ getName());
		System.out.println("�л� ����:"+ getAge());
		System.out.println("�л� Ű:"+ getHeight());
		System.out.println("�л� ������:"+ getWeight());
		System.out.println("�й�:"+ getSudentID());
		System.out.println("�г�:"+ getGrade());
		System.out.println("����:"+ getGPA());
	}
	
}
