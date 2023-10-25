package streamex.ex06;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandGen {
    public static void main(String[] args) {
        // 1 ~ 100사이의 랜덤한 숫자 50개를 List로 구성하세요.

        List<Integer> rlist = new Random().ints(50, 1, 101) // IntStream
                .sorted()
                .boxed() // Stream<Integer>
                .collect(Collectors.toList());

        System.out.println(rlist);

        // 1~100사이의 랜덤한 숫자 50개를 List로 구성하세요.
        List<Integer> rlist2 = new Random().ints(1, 101) // IntStream
                .distinct()
                .limit(50)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(rlist2);
        System.out.println(rlist2.size());
    }
}

