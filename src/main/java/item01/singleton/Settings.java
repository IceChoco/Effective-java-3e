package singleton;

public class Settings {

	private Settings() {};//private: Settings 클래스에서만 사용 가능. 외부 클래스에서 사용하려고 하면 에러 발생.
	
	/* static으로 선언된 것들(정적공간) : 객체가 얼마나 생성되든 메모리의 지정된 공간에 딱 하나만 존재한다. 
	 * 								컴파일 할 때 부터 이 요소가 차지할 메모리 용량을 이미 알 수 있도록 딱 정해져 있기 때문에
	 * 								동적요소들과 대비되는 개념으로 static, 정적이라고 불림
	  */
	private static Settings settings = null;//★★★ 자기 자신인 Settings 타입의 객체를 static으로 생성. null로 초기화 ★★★

	// 정적 팩토리 메소드
	public static Settings getSettings() {
		//1. 다른곳에서 getSettings를 실행하기 전이라면
		if(settings == null){
			settings = new Settings();//Settings 객체를 선언해서 settings 변수에 넣어주고 아래에서 반환
		}
		//2. settings가 이미 만들어진 상태라면 settings를 그대로 반환
		return settings;
	}
	
	private static boolean darkMode = false;
	private static int fontSize = 13;
	
	public static boolean getDarkMode(){//public: 누구든지 이 클래스의 메소드를 호출 가능
		return darkMode;
	}

	public static int getFontSize() {
		return fontSize;
	}
	
	/* static이 아닌 것들(동적공간) : 객체가 생성될 때마다 메모리의 공간을 새로 차지*/
	public void setDarkMode(boolean _darkMode) {
		darkMode = _darkMode;
	}

	public void setFontsize(int _fontSize) {
		fontSize = _fontSize;
	}

}