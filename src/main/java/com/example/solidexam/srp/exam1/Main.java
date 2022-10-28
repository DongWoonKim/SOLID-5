package com.example.solidexam.srp.exam1;

/**
 * 속성이 잘 못된 경우
 */
public class Main {
    public static void main(String[] args) {

        // 1. SRP(속성)가 잘 못된 예제 - 여자는 군대를 갔다오지 안았을 경우 군번이 없다.
        // 하지만 이를 제한하지 않아 사용될 여지가 있다.
        Person 남자 = new Person();
        Person 여자 = new Person();
        여자.군번 = "123";
        남자.군번 = "321";

        // 2. 개선 -> 사람이라는 공통부분만 추상화 시키고, 군번이라는 특수한 속성 남자라는 클래스에만 적용
        Male   남자2 = new Male();
        Female 여자2 = new Female();
        여자2.나이 = "12";
        남자2.군번 = "321";

    }
}
