package com.ananth;

import java.util.*;

public class SampleLeetCode {
    public static void main(String[] args) {
        int[][] a = new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}};
    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;

        ArrayList<int[]> compressedBalloons = new ArrayList<>();
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        compressedBalloons.add(points[0]);

        for (int i = 1; i < points.length; i++) {
            int[] prev = compressedBalloons.remove(compressedBalloons.size() - 1);
            int[] current = points[i];

            if (current[0] <= prev[1]) {
                prev[1] = Math.min(current[1], prev[1]);
                compressedBalloons.add(prev);
            } else {
                compressedBalloons.add(prev);
                compressedBalloons.add(current);
            }

        }
        return compressedBalloons.size();
    }

    public static String decodeString(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        int times = s.charAt(0) - '0';
        String encodedString = "";
        for (int i = 2; i < s.length(); ) {
            while (s.charAt(i) != ']') {
                encodedString += s.charAt(i);
                i++;
            }
            sb.append(encodedString.repeat(times));
            if (i < s.length()) {
                i++;
                times = s.charAt(i) - '0';
                i = i + 2;
                encodedString = "";
            }
        }

        return sb.toString();
    }

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            System.out.println(map);
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) return false;
            } else {
                map.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }

}
