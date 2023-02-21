import java.util.List;
import java.util.stream.Stream;

public class StreamsTest2 {
    public static void main(String[] args) {
        List<String> myPlaces = List.of("Nepal", "Cairo", "Phuket", "New-York");
        Stream<String> stringStream = myPlaces.stream();
        stringStream.forEach(i -> {
            System.out.println(i.toUpperCase());
        });
    }
}