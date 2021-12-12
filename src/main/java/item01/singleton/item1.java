package singleton;

public class item1 {

	public static final Boolean TRUE = new Boolean(true);

	public static final Boolean FALSE = new Boolean(false);

	public static boolean valueOf(boolean b){
		return b? TRUE: FALSE;
	}

	public static void main(String[] args) {
		System.out.println(Boolean.valueOf(true));
		System.out.println(Boolean.valueOf(false));

		String a = new String("A");
		String b = new String("A");

		System.out.println(a == b);      //주소값 비교
		System.out.println(a.equals(b)); //주소 안에 들어 있는 값 비교
	}
}