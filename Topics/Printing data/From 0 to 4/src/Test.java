import java.util.List;
import java.util.Optional;

public class Test<numbers> {
    public static void main(String[] args) {
        List<Integer> numbers = (List<Integer>) List.of(1, 2, 3);
        int result = numbers.stream().findFirst();
        System.out.println(result);   // put your code here
    }
}
