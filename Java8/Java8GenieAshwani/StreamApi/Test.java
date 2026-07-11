import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(l1);

        // WAP to take out list where greater then 20
        List<Integer> collect = l1.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println(collect);

        // WAP to take out final list where we are adding 5 to each element.
        List<Integer> collect2 = l1.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(collect2);

        // Terminal Operations
        // 1. toArray()
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
        Object array[] = s.toArray();
        for (Object object : array) {
            System.out.print(object + " ");
        }

        // 2. count();
        System.out.println();
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);
        long count = s1.count();
        System.out.println(count);

        // 3. for each
        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6);
        s2.forEach(ele -> System.out.print(ele + " "));

        // 4 & 5. min() max()
        System.out.println();
        Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> s4 = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> min = s3.min((o1, o2) -> o1.compareTo(o2));
        Optional<Integer> max = s4.max((o1, o2) -> o1.compareTo(o2));
        System.out.println("min :: " + min.get());
        System.out.println("max :: " + max.get());

        // 6. anyMatch()
        List<Integer> listOfNum = Arrays.asList(22, 33, 44, 55, 66);
        boolean anyMatch = listOfNum.stream().anyMatch(i -> i == 22);
        System.out.println(anyMatch);

        // 7. allMatch()
        List<Integer> list = Arrays.asList(22, 33, 44, 55, 66);
        boolean allMatch = list.stream().allMatch(element -> element > 7);
        System.out.println(allMatch);
    }
}
