package 과제.Lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number1;
            int number2;

            while (true) {
                System.out.println("첫 번째 숫자를 입력하세요. : ");
                number1 = sc.nextInt();
                if (number1 >= 0) {
                    break;
                } else {
                    System.out.println("0을 포함한 양의 정수를 입력해주세요.");
                }
            }

            while (true) {
                System.out.println("두 번째 숫자를 입력하세요. : ");
                number2 = sc.nextInt();
                if(number2 >= 0) {
                    break;
                } else {
                    System.out.println("0을 포함한 양의 정수를 입력해주세요.");
                }
            }

            System.out.println("사칙연산 기호(+,-,*,/)를 입력하세요. : ");
            char operator = sc.next().charAt(0);

            double result = calculator.calculate(number1, number2, operator);
            System.out.println("결과값 : " + result);

            System.out.println("더 계산하시겠습니까? 계속 계산하려면 아무키 + enter 입력 (exit 입력 시 종료)");
            String continueop = sc.next();

            if (continueop.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeop = sc.next();

            if (removeop.equals("remove")){
                calculator.removeresult();
                System.out.println("데이터를 삭제합니다.");
            }

        }
    }
}
