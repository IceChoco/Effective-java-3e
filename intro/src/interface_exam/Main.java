package interface_exam;

public class Main implements Dog, Cat{//implements: 인터페이스를 상속 받는다.

	public static void main(String[] args){
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("월! 월!");
	}

	@Override
	public void one() {
		System.out.println("One!");
	}

	@Override 
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two!");
		
	}
}
