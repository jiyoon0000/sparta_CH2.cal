package 과제.Lv1;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number1;
            int number2;

            while (true) {
                System.out.print("첫번째 숫자를 입력하세요 : ");
                number1 = sc.nextInt();
                if(number1 >= 0) {
                    break;
                }else {
                    System.out.println("0을 포함한 양의 정수를 입력해주세요.");
                }
            }

            while (true) {
                System.out.print("두번째 숫자를 입력하세요 : ");
                number2 = sc.nextInt();
                if(number2 >= 0) {
                    break;
                }else{
                    System.out.println("0을 포함한 양의 정수를 입력해주세요.");
                }
            }

            System.out.println("사칙연산 기호(+,-,*,/)를 입력하세요. : ");
            char operator = sc.next().charAt(0); //연산기호 입력해서 변수에 저장

            double result = 0;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = number1 / number2;
                    }
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
                System.out.println("결과값 : " + result);

                System.out.println("더 계산하시겠습니까? 계속 계산하려면 아무키 + enter 입력 (exit 입력 시 종료)");
                String continueop = sc.next();

                if (continueop.equals("exit")) {
                    System.out.println("계산을 종료합니다.");
                    break;
                }
            }
    }
}
