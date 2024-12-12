package dgkim.P1211.interFace.P5;

public class FileHandler implements ReadWritable {
    @Override
    public String readContent() {
        System.out.println("파일에서 내용을 읽습니다.");
        return "";
    }

    @Override
    public void writeContent(String content) {
        System.out.println(content);
    }

    public static void main(String[] args) {
        ReadWritable readWritable = new FileHandler();
        readWritable.readContent();
        readWritable.writeContent("파일에 내용을 썼습니다.");
    }
}
