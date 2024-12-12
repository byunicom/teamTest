package dgkim.P1211.Exception;

public class ChangeTypeException {
    String numStr = "123a";

    public static void main(String[] args) {
        ChangeTypeException changeTypeException = new ChangeTypeException();

        //아래의 주석을 해제하면 숫자로된 문자만 입력되면 정상 출력되는 것을 확인할 수 있다.
        //changeTypeException.numStr="123";

        try {
            System.out.println(Integer.parseInt(changeTypeException.numStr));
        }catch(NumberFormatException e){
            System.out.println("숫자가 아닌 값은 정수로 변환할 수 없습니다.");
        }
    }
}
