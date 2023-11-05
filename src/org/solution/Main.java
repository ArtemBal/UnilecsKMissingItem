package org.solution;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 4, 7, 9, 10 }, 1));
        System.out.println(solution(new int[] { 4, 7, 9, 10 }, 3));
        System.out.println(solution(new int[] { 1, 2, 3, 5 }, 6));
    }

    public static int solution(int[] arr, int k) {
        if (arr.length == 1) return arr[0] + k;

        for (int i = 1; i < arr.length; i++) {
            int numberOfMissed = arr[i] - arr[i - 1] - 1;
            if (numberOfMissed >= k) return arr[i - 1] + k;
            k -= numberOfMissed;
        }
        return arr[arr.length - 1] + k;
    }
}