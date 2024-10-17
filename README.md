# sparta_calculator

<Lv.1 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기>


*양의 정수(0포함)를 입력받기
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.println("첫번째 숫자를 입력하세요.");
int number1 = sc.nextInt();

System.out.println("두번째 숫자를 입력하세요.");
int number2 = sc.nextInt();

-Scanner 를 사용하여 양의 정수 2개(0포함)를 전달 받을 수 있다.
scanner, system.in을 사용해서 사용자가 값을 입력할 수 있게 함.
scanner를 사용하기 위해 import.java.util.Scanner를 입력함.
System.out.prinln을 통해 값을 입력하라는 문구를 띄워줌.

-양의 정수는 각각 하나씩 전달 받는다.
int를 사용해서 정수 타입으로 저장하는 건 알겠는데, 양의 정수만 입력할 수 있게 하는 방법은 모르겠음 -> 질문하기
int number1,2 를 선언을 먼저 한 후에 while문과 if문을 사용해서 양의 정수인 조건에만 break;가 되게 해주고, 아닌 경우에는 조건을 만족할 때까지 if 문을 반복하도록 하기
while문을 쓰기 전에  int 선언을 해야 밑에서 가져와서 쓸 때 에러가 안뜸.
while 문 안에서도 띄울 문구와 스캐너는 먼저 써야함.
---우리가 값을 직접 입력한 후에 값이 스캐너에 들어가기 때문
---양의 정수인지 판별한 후에 스캐너에 들어가게 하기 위함
int number1;

while(true){
    System.out.print("첫번째 숫자를 입력하세요.");
    number1 = sc.nextInt();

    if(number1 >=0){
        break;
    }else {
        System.out.println("0을 포함한 양의 정수를 입력하세요");
    }
}

-양의 정수는 적합한 타입으로 선언한 변수에 저장한다.
숫자를 입력하는 거니까 int 타입을 사용해서 변수 저장
*사칙연산 기호(+,-,*,/)를 입력받기
System.out.println("사칙연산 기호를 입력하세요.");
char operator = sc.next().charAt(0);

-Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있다.
-사칙연산 기호를 적합한 타입으로 선언한 변수에 저장한다.(charAt(0))
sc.next()는 string 타입으로 입력을 받는데 charAt()을 사용하여 문자를 입력받음.
charAt(0) :  입력한 첫번째 글자를 표시
operator에 사칙연산 변수를 문자타입으로 저장
System.out.prinln을 통해 기호를 입력하라는 문구를 띄워줌.
*위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
-키워드 : if, switch
switch (operator) {
    case '+' :
        result = number1 + number2;
        break;
    case '-' :
        result = number1 - number2;
    case '*' :
        result = number1 * number2;
    case '/' :
        if(number2 == 0){
            System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
        }else {
        result = number1 / number2;
        }
        break;
    default : System.out.prinln("잘못 입력하였습니다.");
}

-사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행한다.
-입력받은 연산 기호를 구분하기 위해 제어문을 사용한다.
switch-case 문을 이용하여 +,-,*,/ 각각에 맞는 연산기호를 입력하면 연산이 되게 함.
break;를 사용해서 조건을 만족하면 반복문 종료되도록 함.

-연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력한다.
---나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.
switch-case 문 안에 if 문을 활용하여 나눗셈 연산에서 분모가 0이 입력될 수 없도록 함.
number2가 0이면 "나눗셈 연산에서 분모에 0이 입력될 수 없습니다." 라는 문구가 뜨게하고,
 0이 아니라면 나눗셈을 진행하게 함.

그리고 사칙연산을 잘못 입력했을 경우 default를 통해 "잘못입력하였습니다." 라는 문구가 뜨게 함.
*반복문을 사용하되, 반복의 종료를 알려주는 "exit" 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기
-키워드 : 무한으로 반복, 수정하기(처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
while(true){
    연산 코드
 
    System.out.println("결과값:" + result);

    System.out.println("더 계산하시겠습니까?(exit 입력 시 종료)");
    String continueop = sc.next();

    if(continueop.equals("exit")){
        System.out.println("계산을 종료합니다.");
        break;
    }
}

-반복문을 사용한다.(예를 들어 for, while...)
while(true)를 사용해 조건이 일치할 경우 반복하도록 함.
while 안에 위에 쓴 사칙연산 코드를 전부 넣어야함
조건을 만족할 경우 연산의 결과값이 나오게 하고, 그 후에 exit을 누르면 종료 아닌 경우 다시 계산 반복

exit을 입력하면 무한으로 계산....헷갈림
exit를 입력해야하니까 문자열인 String으로  연산을 계속 할건지에 대한 continueop를 스캐너에 적은 후에
equals로 boolean 값을 판별 true면 종료, false면 계속

종료하는 방법...?-> 물어보기
for, while, switch에서만 break가 쓰이는 줄 알았는데 그냥 간단하게 break;를 쓰면 되는 거였다...!
