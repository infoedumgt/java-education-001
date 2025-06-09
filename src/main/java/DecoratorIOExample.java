import java.io.*;

public class DecoratorIOExample {
    public static void main(String[] args) {
        try {
            // 기반 스트림
            FileInputStream fis = new FileInputStream("./test.txt");

            // 문자 변환 데코레이터
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            // 라인 단위 읽기 기능을 추가한 데코레이터
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // 자원 정리
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 