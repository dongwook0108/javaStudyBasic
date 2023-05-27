
package chap_11;

/**
 * @Title : TryWithResources
 * @Content : AutoCloseable 인터페이스 구현하면 자동으로 close 구현
 */
public class _05_TryWithResources {

    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("파일을 쓰고 있어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-----------");

        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵 먹고싶다.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일 닫기 !");
    }

    public void write(String line) {
        System.out.println("파일 입력 내용 : " + line);
    }
}