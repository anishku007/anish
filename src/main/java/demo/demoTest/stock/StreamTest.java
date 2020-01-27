package demo.demoTest.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
    public static Integer merge(int no) {
         int i=1;
        return i++;
    };
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(25);
        l.add(40);
        l.add(55);
        l.add(70);
        System.out.println(l);
        //count even number in list
        Long count = l.stream().filter(c -> c % 2 == 0).count();
        List<Integer> evenList = l.stream().filter(c -> c % 2 == 0).collect(Collectors.toList());
        List<Integer> intlist = l.stream().map(e -> merge(e)).collect(Collectors.toList());

        List<String> list = new ArrayList<>();
        Map<Integer, Integer> m = l.stream().collect(Collectors.toMap(k -> k, c -> c));
        list.add("Mohan");
        list.add("Sohan");
        list.add("pahesh");
        Map<Character, String> map = list.stream().filter(f -> !f.isEmpty()).collect(Collectors.toMap(c -> c.charAt(0), s -> s));
        map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(intlist);
        System.out.println(evenList);
        System.out.println(map);
        System.out.println(m);
    }

}
