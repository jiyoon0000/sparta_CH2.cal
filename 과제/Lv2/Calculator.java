package 과제.Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results = new ArrayList<>();

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public Integer calculate(int number1, int number2, char operator) {
        Integer result = 0;

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
                    return 0;
                } else {
                    result = number1 / number2;
                }
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
                return 0;
        }
        results.add(result);
        return result;
    }

    public void removeresult() {
        if(!results.isEmpty()){
            results.remove(0);
        }else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}