import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleWorldScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 문자열 입력
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();

            // 정수 입력
            System.out.print("나이를 입력하세요: ");
            short age = scanner.nextShort();

            // 실수 입력
            System.out.print("키(cm)를 입력하세요: ");
            double height = scanner.nextDouble();

            // 출력
            System.out.println("\n[입력 결과]");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age + "세");
            System.out.println("키: " + height + "cm");

        } catch (InputMismatchException e) {
            System.out.println("\n❌ 입력 형식이 올바르지 않습니다.");
            System.out.println("→ 나이는 정수, 키는 실수로 입력해야 합니다.");
        } catch (Exception e) {
            System.out.println("\n❌ 알 수 없는 오류가 발생했습니다: " + e.getMessage());
        } finally {
            // Scanner 닫기 (자원 해제)
            scanner.close();
        }
    }
}
