package chap_08;

import chap_07.BlackBoxRefubish;

public class _00_AccessModifireTest {

    public static void main(String[] args) {
        BlackBoxRefubish b1 = new BlackBoxRefubish();
        b1.modelName = "까망이"; // public
//        b1.resolution "FHD"; // default
//        b1.price = "200000"; //private
//        b1.color = "black"; //protected 같은패키지 or 자식
    }
}
