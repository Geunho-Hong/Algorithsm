package CodingTest.Bakejun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class KoreanEnglishMath {
    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Score[] studentList = new Score[N];

        for (int i = 0; i < N; i++) {
            String[] unit = br.readLine().split(" ");

            String name = unit[0];
            int korScore = Integer.parseInt(unit[1]);
            int engScore = Integer.parseInt(unit[2]);
            int mathScore = Integer.parseInt(unit[3]);

            studentList[i] = new Score(name, korScore, engScore, mathScore);

        }

        Arrays.sort(studentList, new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                if (s1.korScore < s2.korScore) {
                    return 1;
                } else if (s1.korScore == s2.korScore) {
                    if (s1.engScore > s2.engScore) {
                        return 1;
                    } else if (s1.engScore == s2.engScore) {
                        if (s2.mathScore > s1.mathScore) {
                            return 1;
                        } else if (s1.mathScore == s2.mathScore) {
                            return s1.name.compareTo(s2.name);
                        }
                    }
                }
                return -1;
            }
        });


        for (Score s : studentList) {
            System.out.println(s.name);
        }
    }

}

class Score {

    String name;
    int korScore;
    int engScore;
    int mathScore;

    public Score(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }

}
