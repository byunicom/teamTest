package dgkim.P1211.Exception;

public class ArrayExceptionTest {
    static int[] arr = {10,20,30};

    public static void main(String[] args) {
        for(int i=0;i<arr.length+3;i++){
            try {
                System.out.println(arr[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 범위를 확인하세요");
                break;
            }
        }
    }

}
