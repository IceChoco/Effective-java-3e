package chapter2.item01.singleton;

public class FirstPage {
	//Settings��ü�� static �޼ҵ�� �̹� �޸��� ���� ������ �ڸ��� �����ϰ� �ִ� �����̱� ������
	//�ش� ��ü�� new�� �������� �ʰ� Ŭ�������� �ٷ� �ҷ��� �� ����
	private Settings settings = Settings.getSettings();
	
	public void setAndPrintSetting(){
		settings.setDarkMode(true); //���� settings ��ü�� ���� ����
		settings.setFontsize(15);
		
		System.out.println(settings.getDarkMode()+" "+settings.getFontSize());//�� ������� �����
	}
}
