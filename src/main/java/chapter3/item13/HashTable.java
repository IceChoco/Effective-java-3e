package chapter3.item13;

public class HashTable implements Cloneable {
    private Entry[] buckets; // 복잡한 가변 필드

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;     //지금 키
            this.value = value; // 지금 값
            this.next = next;   // 다음 원소
        }

        //재귀 - 비권장
//        Entry deepCopy() {
//            return new Entry(key, value, next == null ? null : next.deepCopy());
//        }

        //반복문 - 권장
        Entry deepCopy() {
            // 첫번째 인덱스의 deepCopy가 호출되면,
            // Entry 값이 똑같은 result라는 Entry 생성
            Entry result = new Entry(key, value, next);
            // p는 result와 같은 주소값을 참조. 즉, p.next로 값을 수정하면 result.next도 바뀜
            for(Entry p = result; p.next != null; p = p.next) {
               p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }
    }
    @Override
    public HashTable clone() throws CloneNotSupportedException {
        try {

            HashTable result = (HashTable)super.clone();
            // 2. buckets 필드를 새로운 buckets 배열로 초기화
            result.buckets = new Entry[buckets.length];
            // 3.원본 테이블에 담긴 모든 버킷을 순회
            for (int i = 0; i < buckets.length; i++) {
                //버킷이 비어있지 않으면, 그 인덱스의 버킷을 deepCopy함
                if(buckets[i] != null) {
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }
            return result;
        } catch ( CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}