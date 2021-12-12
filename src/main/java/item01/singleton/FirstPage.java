package singleton;

public class FirstPage {
	//Settings객체의 static 메소드는 이미 메모리의 정적 공간에 자리를 차지하고 있는 상태이기 때문에
	//해당 객체를 new로 생성하지 않고도 클래스에서 바로 불러낼 수 있음
	private Settings settings = Settings.getSettings();
	
	public void setAndPrintSetting(){
		settings.setDarkMode(true); //정적 settings 객체에 값을 넣음
		settings.setFontsize(15);
		
		System.out.println(settings.getDarkMode()+" "+settings.getFontSize());//그 내용들을 출력함
	}
}
