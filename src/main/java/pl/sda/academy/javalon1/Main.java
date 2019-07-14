package pl.sda.academy.javalon1;

import pl.sda.academy.javalon1.nbp.dto.currencies.Currency;
import pl.sda.academy.javalon1.service.subpackage.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = C.list;
        list = new ArrayList();
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.add("4");
        new Predicate<Currency>() {
            @Override
            public boolean test(Currency currency) {
                return currency.getCode().length() > 3;
            }
        };

        Predicate<Currency> pred = x -> x.getCode().length() > 3;

        Predicate<Currency> pred2 = (Currency currency) -> currency.getCode().length() > 3;

        Optional<Long> reduce = Stream.of("11", "222", "3333", "44444")
                .filter(x -> x.length() > 2)
                .peek(System.out::println)
                .map(x -> x + x)
                .peek(System.out::println)
                .map(Long::valueOf)
                .peek(System.out::println)
                .map(x -> x + x)
                .peek(System.out::println)
                .reduce((x, y) -> {
                    return x = x + y;
                });
        System.out.println(reduce.get());

        Optional<Double> reduceResult = IntStream.range(1, 1000).boxed()
                .filter((Integer x) -> x % 2 != 0)
                .map(x -> (double) 1 / x)
                .reduce((x, y) -> x = x + y);
        Double value = reduceResult.orElse(-1.0);
        System.out.println(value);

    }

}
