package inheritance_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�� ����� �л��� �����մϱ�? ");
		
		int number = Integer.parseInt(br.readLine());
				
		Student[] students = new Student[number];
		for(int i=0;i<number;i++){
			String name;
			int age; 
			int height;
			int weight;
			String sudentID;
			int grade;
			double gPA;
			
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = br.readLine();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = Integer.parseInt(br.readLine());
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = Integer.parseInt(br.readLine());
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			sudentID = br.readLine();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = Integer.parseInt(br.readLine());
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = Double.parseDouble(br.readLine());
			
			students[i] = new Student(name, age, height, weight, sudentID, grade, gPA);
		}
		for(int i=0;i<number;i++){
			students[i].show();
		}
	}

}
