package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class DesignerPDFViewer {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maxHeight = 0;
        for (char c : word.toCharArray()){
            int index = c - 'a';
            maxHeight = Math.max(maxHeight, h.get(index));
        }

        return word.length() * maxHeight;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        String word = bufferedReader.readLine();

        int result = designerPdfViewer(h, word);

        System.out.println(result);
        bufferedReader.close();

    }
}
