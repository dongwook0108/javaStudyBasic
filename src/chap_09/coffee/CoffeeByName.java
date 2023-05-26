package chap_09.coffee;

public class CoffeeByName {

    public Object name; // Integer, Double 등 다 가능

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + name);
    }
}
