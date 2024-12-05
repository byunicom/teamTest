/**
 * 실습 문제 4: 동물 클래스 정의하기
 * 목표: 여러 개의 객체 생성 및 활용.
 *
 * Animal이라는 클래스를 정의합니다.
 * Animal 클래스에는 아래와 같은 속성을 추가하세요:
 * name (동물 이름)
 * type (동물 종류, 예: 개, 고양이)
 * main 메서드에서 서로 다른 동물을 나타내는 Animal 객체를 3개 생성하고, 이름과 종류를 출력하세요.
 * 예상 출력 예시:
 *
 * 이름: 뽀삐, 종류: 개
 * 이름: 나비, 종류: 고양이
 * 이름: 찡찡이, 종류: 햄스터
 */
package Practice;

public class Exam_241205_4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.dog();
        animal.cat();
        animal.hamster();
    }
}
