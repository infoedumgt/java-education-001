import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner 객체 생성 (System.in을 통해 콘솔 입력 받음)
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 정수 입력
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 실수 입력
        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        // 출력
        System.out.println("\n[입력 결과]");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");

        // Scanner 닫기
        scanner.close();
    }
}
