package chap_11;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Title : Throws
 * @Content :
 */
public class _08_Throws {

    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인메서드에서 처리할게 ~");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("text.txt");
//            throw new IOException("파일 쓰기 실패");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("메소드 내에서 해결함");
//        }

        FileWriter writer = new FileWriter("text.txt");
        throw new IOException("파일 쓰기 실패");
    }

}


