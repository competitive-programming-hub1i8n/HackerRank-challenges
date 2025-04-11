package org.example.DataStructures.stacks;


import java.io.*;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        AtomicReference<Boolean> isMax = new AtomicReference<>(false);
        operations.parallelStream().forEach(
                (item) -> {
                    String[] operation = item.split(" ");
                    switch (operation[0]){
                        case "1":
                            stack.push(Integer.parseInt(operation[1]));
                            break;
                        case "2":
                            stack.pop();
                            break;
                        case "3":
                            isMax.set(true);
                            Integer maxValue = stack.stream().max(Integer::compareTo).get();
                            maxStack.push(maxValue);
                            break;
                    }
                }
        );
        return maxStack;
    }

}
public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        List<Integer> res = Result.getMax(ops);

        res.forEach(System.out::println);

        bufferedReader.close();
    }
}
