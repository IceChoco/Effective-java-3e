package item10;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;
    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }
    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }
    @Override public boolean equals(Object o) {
        if (o == this) // 1 자기 자신의 참조인지 확인
            return true;
        if (!(o instanceof PhoneNumber)) // 2 올바른 타입인지 확인
            return false;
        PhoneNumber pn = (PhoneNumber)o; // 3 올바른 타입으로 형변환, instanceof가 성공했으면 이것은 100퍼센트!
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode; // 4 핵심 필드들이 일치하는지 검사
    }
}