# 이팩티브 자바 3판 소스코드

다음의 내용은 이팩티브 자바 3판을 읽으며 정리한 소스코드 입니다.

읽고 정리한 내용을 보고싶으시다면 [:book: Effective Java](https://github.com/IceChoco/icechoco.github.io/tree/master/_posts/Java/EffectiveJava)를 참고해주세요.

감사합니다.

---

## 2장 객체 생성과 파괴
* [아이템 1: 생성자 대신 정적 팩터리 메서드를 고려하라](/src/main/java/item01)
* [아이템 2: 생성자에 매개변수가 많다면 빌더를 고려하라](/src/main/java/item02)
* [아이템 3: Private 생성자나 열거 타입으로 싱글턴임을 보증하라](/src/main/java/item03)
* [아이템 4: 인스턴스화를 막으려거든 private 생성자를 사용하라](/src/main/java/item04)
* [아이템 5: 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라](/src/main/java/item05)
* [아이템 6: 불필요한 객체 생성을 피하라](/src/main/java/item06)
* [아이템 7: 다 쓴 객체 참조를 해제하라](/src/main/java/item07)
* [아이템 8: finalizer와 cleaner 사용을 피하라](/src/main/java/item08)
* [아이템 9: try-finally 보다는 try-with-resources를 사용하라](/src/main/java/item09)

## 3장 모든 객체의 공통 메서드
* [아이템 10: equals는 일반 규약을 지켜 재정의하라](/src/main/java/item10)
* [아이템 11: equals를 재정의하려거든 hashcode도 재정의하라](/src/main/java/item11)
* [아이템 12: toString을 항상 재정의하라](/src/main/java/item12)
* [아이템 13: clone 재정의는 주의해서 진행하라](/src/main/java/item13)
* [아이템 14: Comparable을 구현할지 고려하라](/src/main/java/item14)

## 4장 클래스와 인터페이스
* [아이템 16: public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라](/src/main/java/item16)
* [아이템 17: 클래스의 변경가능성을 최소화하라](/src/main/java/item17)
* [아이템 24: 멤버 클래스는 되도록 static으로 만들라](/src/main/java/item24)
