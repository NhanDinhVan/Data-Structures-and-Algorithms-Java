package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static HashSet<String> SD = new HashSet<>();
    public static HashSet<String> BPO = new HashSet<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i=1; i<= cases; ++i) {
            String line = scanner.nextLine();
            ArrayList<ArrayList<Integer>> scores = parseInput(line);

            System.out.println("Case " + i + ": " + mediumGrade(scores));
        }
    }

    static String mediumGrade(ArrayList<ArrayList<Integer>> scores) {
        // TODO: Let's rock n roll here
        Double result = 0.00;

        for(int i = 0; i < scores.size(); i++){
            Double score = 0.00;
            ArrayList<Integer> item = scores.get(i);
            for(int j = 0; j < item.size(); j++){
                score += item.get(j);
            }

            double s1 = score / item.size();
            double s2 = score % item.size();

            score = s1 + s2;

            result += score;
        }

        double r1 = result / scores.size();
        double r2 = result % scores.size();

//        score = r1 + r2;

        return String.format("%.2f", result);
    }


    public static ArrayList<ArrayList<Integer>> parseInput(String input) {
        input = input.replace("[[", "[");
        input = input.replace("]]", "]");
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> items = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        while (matcher.find()) {
            String content = matcher.group(1);
            items.add(content);
        }

        for (String item: items) {
            String[] parts = item.split(",");
            ArrayList<Integer> nums = new ArrayList<Integer>();

            for (String part: parts) {
                nums.add(Integer.parseInt(part));
            }
            result.add(nums);
        }
        return result;
    }

//    private static void StaffCounting(String input) {
//        // TODO: Let's Rock 'n Roll here
//        String[] S = input.split(";");
//
//        for(String s : S){
//
//            String[] s1 = s.split(",");
//
//            for(String s2 : s1){
//                System.out.println(s2);
//
//                if(s2.startsWith("SD") && s2.length() == 6) SD.add(s2);
//                if(s2.startsWith("BPO") && s2.length() == 7) BPO.add(s2);
//            }
//        }
//
//        System.out.println("SD: " + SD.size());
//        System.out.println("BPO: " + BPO.size());
//    }
//    static void rotateMatrix(String[][] matrix) {
//        // TODO: Let's rock 'n roll here
//        int m = matrix.length;
//        String[][] colArr = new String[m][m];
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < m; j++){
//                colArr[j][i] = matrix[i][j];
//            }
//        }
//
//        for(String[] col : colArr){
//            col = reverse(col);
//        }
//
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < m; j++){
//                matrix[i][j] = colArr[i][j];
//                if(j == m - 1){
//                    System.out.print(matrix[i][j] + "\n");
//
//                }else{
//                    System.out.print(matrix[i][j] + " ");
//                }
//            }
//        }
//    }
//
//
//
//    public static String[] reverse(String[] s){
//        int i = 0;
//        int j = s.length - 1;
//
//        while(i < j){
//            String tmp = s[i];
//            s[i] = s[j];
//            s[j] = tmp;
//            i++; j--;
//        }
//
////        System.out.println(s.toString());
//        return s;
//    }
}