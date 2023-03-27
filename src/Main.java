import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
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
        System.out.println("Задача 3");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble) ;
            }
        };
        System.out.println(function);
        Function<Double, Long> function1 = Math::round; //вместо лябда-выражения вызываю статический метод
        System.out.println("Задача 4");
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
        System.out.println(supplier1);

        System.out.println("Задача 5");
        Function<Integer, Integer> function2 = x -> Math.round(x);
        Function<Integer, Double> function3 = x -> Math.pow(x, 2);
        System.out.println(ternaryOperator(predicate1, function2, function3));

    }
}