package Practice;
//Calculator 클래스 생성 (클래스명은 대문자로 시작하기로 약속함)
public class Calculator {
    //#1.
    //리턴값의 형태가 존재하지 않으므로 void 로 하였음
    //파라메터(or 인자, 인수)는 2개의 숫자를 받도록 하였음
    public void add(int a, int b){
        //계산결과를 담는 숫자 변수(or 객체)
        int result = a+b;
        System.out.println("더하기 결과: "+result);
    }

    //#2.
    //파라메터로 값을 받아와서, a-b 를 계산한 결과를 result 라는 정수형 변수에 담는다.
    //result 라는 결과를 담은 변수를 호출하였던, main 에 되돌려 주는데
    //되돌려 줄 데이터 형은 아래의 public int subtract... 에서 int 로 지정해주면 정수형으로 리턴하는 것이고
    //String 으로 지정하였으면 문자형으로 반환하는 것이다.
    //여기서는 숫자를 반환하는 것이니 int 로 지정하였다.
    public int subtract(int a, int b){
        int result = a-b;
        //System.out.println("빼기 결과: "+result);
        return result;
    }

    //아래는 #1. 방식으로 표현하였다.
    public void multiply(int a, int b){
        int result = a*b;
        System.out.println("곱하기 결과: "+result);
    }

    public void divide(int a, int b){
        int result = a/b;
        System.out.println("나누기 결과: "+result);
    }
}
