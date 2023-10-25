package streamex.ex05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student  implements Comparable<Student>{
    private String name;
    private int score;
    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
