package chapter2.item01.singleton;

public class Settings {

	private Settings() {};//private: Settings Ŭ���������� ��� ����. �ܺ� Ŭ�������� ����Ϸ��� �ϸ� ���� �߻�.
	
	/* static���� ����� �͵�(��������) : ��ü�� �󸶳� �����ǵ� �޸��� ������ ������ �� �ϳ��� �����Ѵ�. 
	 * 								������ �� �� ���� �� ��Ұ� ������ �޸� �뷮�� �̹� �� �� �ֵ��� �� ������ �ֱ� ������
	 * 								������ҵ�� ���Ǵ� �������� static, �����̶�� �Ҹ�
	  */
	private static Settings settings = null;//�ڡڡ� �ڱ� �ڽ��� Settings Ÿ���� ��ü�� static���� ����. null�� �ʱ�ȭ �ڡڡ�

	// ���� ���丮 �޼ҵ�
	public static Settings getSettings() {
		//1. �ٸ������� getSettings�� �����ϱ� ���̶��
		if(settings == null){
			settings = new Settings();//Settings ��ü�� �����ؼ� settings ������ �־��ְ� �Ʒ����� ��ȯ
		}
		//2. settings�� �̹� ������� ���¶�� settings�� �״�� ��ȯ
		return settings;
	}
	
	private static boolean darkMode = false;
	private static int fontSize = 13;
	
	public static boolean getDarkMode(){//public: �������� �� Ŭ������ �޼ҵ带 ȣ�� ����
		return darkMode;
	}

	public static int getFontSize() {
		return fontSize;
	}
	
	/* static�� �ƴ� �͵�(��������) : ��ü�� ������ ������ �޸��� ������ ���� ����*/
	public void setDarkMode(boolean _darkMode) {
		darkMode = _darkMode;
	}

	public void setFontsize(int _fontSize) {
		fontSize = _fontSize;
	}

}