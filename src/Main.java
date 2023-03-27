import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    }
}