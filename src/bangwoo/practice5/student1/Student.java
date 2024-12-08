package bangwoo.practice5.student1;

public class Student {
    private String name;
    private int[] scores;
    private int totalScore;

    public Student(String name, int[] scores) {
        this.scores = scores;
        this.name = name;
    }

    public String getAverageScore() {
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        double average = (double)totalScore / scores.length;
        String formattedValue = String.format("%.2f", average);
        return formattedValue;
    }

    public int[] getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
