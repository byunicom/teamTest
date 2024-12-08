package bangwoo.practice5.student;

public class Student {
    private String name;
    private int[] scores;
    private int totalscore = 0;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public int getAverageScore() {
        for (int i = 0; i < scores.length; i++) {
            totalscore += scores[i];
        }

        int avg = totalscore / scores.length;

        return avg;
    }

    public String getName() {
        return name;
    }

    public String getScores() {

        String scoresStr = "";

        for(int i = 0 ; i < scores.length; i++){
            if( i == scores.length-1 ){
                scoresStr += Integer.toString(scores[i]) ;
            } else {
                scoresStr += Integer.toString(scores[i]) + "," ;
            }
        }
        return scoresStr;
    }
}
