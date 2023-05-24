package chap_06;

/**
 * @Title : 메인 메소드
 * @Content : 자바 프로그램 실행 시 가장 먼저 진입 하는 곳
 * 1. Edit Configuration -> + Application -> Program argument 지정 가능
 */
public class _08_MainMethod {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        //1. 도서 조회
        //2. 도서 대출
        //3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다 !");
            }
        } else {
            System.out.println("사용법 : 1 ~ 3 메뉴 중 하나만 선택하세요");
        }

    }

}

