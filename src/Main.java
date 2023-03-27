import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
       Predicate<Integer> predicate = new Predicate<Integer>() {
           @Override
           public boolean test(Integer integer) {
               if (integer < 0){
                   return false;
               }
               return true;
           }
       };
       Predicate<Integer> predicate1 = x -> x > 0;
       System.out.println(predicate.test(-100));
       System.out.println(predicate.test(100));

       System.out.println("Задача 2");
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет друг " + s + "!");
            }
        };
        Consumer<String> consumer1 = s -> System.out.println("Привет друг " + s + "!");
        consumer.accept("Иван");
        consumer1.accept("Дмитрий");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble) ;
            }
        };
        Function<Double, Long> function1 = Math::round; //вместо лябда-выражения вызываю статический метод

    }
}