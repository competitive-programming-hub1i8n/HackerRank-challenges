package org.example.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            lines.add(line);
        }
        execute(lines);

    }
    static void execute(List<String> lines){
        Function<String, String> extractTag = x -> {
            return String.join("", x.split("<([a-zA-Z]+)>((?:(?!</\\1>).)*)</\\1>\n"));
        };
        lines.forEach(x -> System.out.println(extractTag.apply(x)));
    }
}
