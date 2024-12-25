package org.example.a_javaBase.b;

public class ReverseSentenceWithoutWords {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        String[] strArr = str.split(" ");

        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
