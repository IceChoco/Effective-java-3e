package inheritance_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("총 몇명의 학생이 존재합니까? ");
		
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
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = br.readLine();
			System.out.print("학생의 나이을 입력하세요 : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("학생의 키를 입력하세요 : ");
			height = Integer.parseInt(br.readLine());
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = Integer.parseInt(br.readLine());
			System.out.print("학생의 학번을 입력하세요 : ");
			sudentID = br.readLine();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = Integer.parseInt(br.readLine());
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = Double.parseDouble(br.readLine());
			
			students[i] = new Student(name, age, height, weight, sudentID, grade, gPA);
		}
		for(int i=0;i<number;i++){
			students[i].show();
		}
	}

}
