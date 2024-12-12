package dgkim.P1211.Exception;

public class StringException {
    String str=null;

    public static void main(String[] args) {
        StringException stringException = new StringException();
        // 아래의 주석 풀면 str 에 "test" 라는 값이 담기고, 길이는 4로 표현된다.
        //stringException.str="test";

        try {
            System.out.println(stringException.str.length());
        }catch(NullPointerException e){
            System.out.println("문자열이 null 상태입니다.");
        }
    }
}
