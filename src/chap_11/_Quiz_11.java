package chap_11;

/**
 * 문제 - 인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서
 * 발생할 수 있는 문제를 처리하는 프로그램을 작성하시오
 * 조건
 * 1. 발생할 수 있는 문제 - 상품 구매 가능 시간, 상품 매진
 * 2. 사용자 정의 예외 클래스 작성
 * 3. 의도적 발생 및 예외 처리
 *
 */
public class _Quiz_11 {

    public static void main(String[] args) {
        int errorCode = 1;

        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new ProductNotNowException("상품 구매가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new ProductNoBuyException("해당 상품은 매진되었습니다.");
            }
        } catch (ProductNoBuyException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        } catch (ProductNotNowException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        }
    }
}
class ProductNoBuyException extends Exception {
    public ProductNoBuyException(String message) {
        super(message);
    }
}

class ProductNotNowException extends Exception {
    public ProductNotNowException(String message) {
        super(message);
    }
}

