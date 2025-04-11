package org.example.others;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> deque = new ArrayList<>();
        int n = scanner.nextInt();
        int limit = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            deque.add(scanner.nextInt());
        }
        int max = 0;

        iterator(max, 0, limit, n, deque);
        // correct solution
        // new JavaDequeue().solution();
    }
    public static <T> int countUnique(List<T> list){
        return new HashSet<>(list).size();
    }

    public static void iterator(int max, int i, int limit, int n, List<Integer> deque) {
        if (i == n - limit + 1) {
            System.out.println(max);
            return;
        }
        max = Math.max(max, countUnique(deque.subList(i, i + limit)));
        iterator(max, i + 1, limit, n, deque);
    }
    void solution(){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueElements = new HashSet<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int n = scanner.nextInt();
        int limit = scanner.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            deque.add(num);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            uniqueElements.add(num);

            if (deque.size() == limit) {
                maxUnique = Math.max(maxUnique, uniqueElements.size());
                int removed = deque.removeFirst();
                frequencyMap.put(removed, frequencyMap.get(removed) - 1);
                if (frequencyMap.get(removed) == 0) {
                    uniqueElements.remove(removed);
                }
            }
        }

        System.out.println(maxUnique);
    }
}
