import java.util.*;
import java.util.function.Predicate;

public class Exercise2 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(1),
                new Apple(2),
                new Apple(3),
                new Apple(4)
        );
        List<Apple> filtered = filter(apples , apple -> apple.size > 2);
        for (Apple apple : filtered){
            System.out.println("apple: " + apple.size);
        }
              //........ inner .........//
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.size - o2.size;
//            }
//        });
        Collections.sort(apples, (o1, o2) -> o1.size-o2.size);
    }
    static List<Apple> filter(List<Apple> list, Predicate<Apple> condition){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : list){
            if(condition.test(apple)){
                result.add(apple);
//                System.out.println(apple);
            }
        }
        return result;
    }
}

    class Apple {
        int size;

        public Apple(int size) {
            this.size = size;
        }
    }

