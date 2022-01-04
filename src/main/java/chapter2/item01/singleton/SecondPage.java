package chapter2.item01.singleton;

public class SecondPage {
	//�̹� settings�� firstPage���� ������� �����̱� ������ �̰� �״�� ������ ���Ե�
	private Settings settings = Settings.getSettings();
	
	public void printSettings(){
		System.out.println(settings.getDarkMode()+" "+settings.getFontSize());//�� ������� �����
	}
}
