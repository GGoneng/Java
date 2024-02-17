import java.util.*;

class ScannerEX {
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("두자리 정수를 하나 입력하시오 >");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);

            System.out.println("입력내용 : " + input);
            System.out.printf("num = %d%n", num);
        }
}
