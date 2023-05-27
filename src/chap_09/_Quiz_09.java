package chap_09;


import java.util.ArrayList;

/**
 * 학생별 프로그래밍 언어 자격증 취득정보 관리, 자바 자격증을 보유한 학생 이름 출력
 * 조건
 * 1. ArrayList 이용
 * 2. 학생 1인당 1개로 제한
 */
public class _Quiz_09 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생 ");
        System.out.println("-==========-");
        for (Student student : list) {
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}

class Student {

    public String name;
    public  String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }

}




