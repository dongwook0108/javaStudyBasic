package chap_09.coffee;

// 주문 번호
public class CoffeeByNumber {

    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + waitingNumber);
    }
}
