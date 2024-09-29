package net.htlgkr.dreib.wenst.LambdaUebung;

import java.util.Arrays;
import java.util.List;

class HalloJavaMitForEach {
    public void run() {
        System.out.println("=== Beispiel 1: HalloJavaMitForEach ===");

        List<String> liste = Arrays.asList("EVEN", "PRIME", "PALINDROME", "ODD", "NO PRIME");

        //alte Variante
        for (String s : liste) {
            System.out.println(s);
        }

        // mit ForEach-Methode
        liste.forEach((String s) -> System.out.println(s));

        // noch kuerzer
        liste.forEach(System.out::println);
    }
}

