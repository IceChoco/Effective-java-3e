package chapter3.item12;

public class PhoneNumber {
    int areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
	public String toString() {
		return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
	}

    public static void main(String[] args) {
        PhoneNumber pn = new PhoneNumber(123, 456, 7890);
        System.out.println(pn + "에서 오류가 발생했습니다.");
    }
}
