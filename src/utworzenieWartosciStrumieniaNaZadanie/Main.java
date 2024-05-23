package utworzenieWartosciStrumieniaNaZadanie;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        List<BigDecimal> liczby = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(liczby);
    }
}
