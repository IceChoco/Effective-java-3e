package singleton;

public class SecondPage {
	//이미 settings가 firstPage에서 만들어진 상태이기 때문에 이걸 그대로 가져다 쓰게됨
	private Settings settings = Settings.getSettings();
	
	public void printSettings(){
		System.out.println(settings.getDarkMode()+" "+settings.getFontSize());//그 내용들을 출력함
	}
}
