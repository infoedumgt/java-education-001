import java.util.Scanner;는 Java에서 사용자로부터 입력을 받기 위한 클래스를 사용하기 위해 선언하는 import 문입니다. 아래에 단계별로 설명드릴게요.

✅ 1. import java.util.Scanner;의 의미
java.util → 자바 표준 라이브러리의 유틸리티 패키지 (컬렉션, 날짜, 입력 등 포함)

Scanner → 키보드, 파일, 문자열 등 입력 소스에서 데이터를 읽어오는 클래스

즉,

java
복사
편집
import java.util.Scanner;
는 Scanner 클래스를 사용하겠다는 선언입니다.

✅ 2. Scanner 클래스 사용 예시
java
복사
편집
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Scanner 객체 생성 (표준 입력 System.in 사용)
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();  // 문자열 입력

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();       // 정수 입력

        System.out.println("안녕하세요, " + name + "님. 나이는 " + age + "살이군요!");

        scanner.close();  // 리소스 해제 (권장)
    }
}
✅ 3. Scanner 주요 메서드
메서드	설명
nextLine()	한 줄 전체 문자열 입력
next()	공백 전까지의 단어 입력
nextInt()	정수 입력
nextDouble()	실수 입력
hasNext()	다음 입력이 있는지 확인
close()	Scanner 종료 (권장)

✅ 4. Scanner를 쓰기 위해 import가 필요한 이유
Java는 모든 클래스를 자동으로 불러오지 않습니다.
java.lang 패키지에 있는 기본 클래스(String, Math 등)를 제외하면, 명시적으로 import 해야 사용 가능합니다.

✅ 요약
항목	설명
Scanner	입력을 받을 수 있게 해주는 클래스
java.util	Scanner가 포함된 표준 유틸리티 패키지
import java.util.Scanner;	Scanner를 사용하기 위한 선언
사용처	사용자 입력 (키보드), 파일, 문자열 등

필요하시면 Scanner로 파일 읽기, 배열 입력 받기, 실시간 처리 예제 등도 드릴 수 있습니다.