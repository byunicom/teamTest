package Practice;

public class Calculator {
    public void add(int a, int b){
        int result = a+b;
        System.out.println("더하기 결과: "+result);
    }

    public void subtract(int a, int b){
        int result = a-b;
        System.out.println("빼기 결과: "+result);
    }

    public void multiply(int a, int b){
        int result = a*b;
        System.out.println("곱하기 결과: "+result);
    }

    public void divide(int a, int b){
        int result = a/b;
        System.out.println("나누기 결과: "+result);
    }
}
