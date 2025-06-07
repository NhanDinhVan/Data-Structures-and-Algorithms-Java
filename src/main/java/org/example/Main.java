package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    public static HashSet<String> SD = new HashSet<>();
//    public static HashSet<String> BPO = new HashSet<>();
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int cases = Integer.parseInt(scanner.nextLine());
//        for (int i=1; i<= cases; ++i) {
//            String line = scanner.nextLine();
//            ArrayList<ArrayList<Integer>> scores = parseInput(line);
//
//            System.out.println("Case " + i + ": " + mediumGrade(scores));
//        }
//    }
//
//    static String mediumGrade(ArrayList<ArrayList<Integer>> scores) {
//        // TODO: Let's rock n roll here
//        Double result = 0.00;
//
//        for(int i = 0; i < scores.size(); i++){
//            Double score = 0.00;
//            ArrayList<Integer> item = scores.get(i);
//            for(int j = 0; j < item.size(); j++){
//                score += item.get(j);
//            }
//
//            double s1 = score / item.size();
//            double s2 = score % item.size();
//
//            score = s1 + s2;
//
//            result += score;
//        }
//
//        double r1 = result / scores.size();
//        double r2 = result % scores.size();
//
////        score = r1 + r2;
//
//        return String.format("%.2f", result);
//    }
//
//
//    public static ArrayList<ArrayList<Integer>> parseInput(String input) {
//        input = input.replace("[[", "[");
//        input = input.replace("]]", "]");
//        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
//        Matcher matcher = pattern.matcher(input);
//
//        ArrayList<String> items = new ArrayList<String>();
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        while (matcher.find()) {
//            String content = matcher.group(1);
//            items.add(content);
//        }
//
//        for (String item: items) {
//            String[] parts = item.split(",");
//            ArrayList<Integer> nums = new ArrayList<Integer>();
//
//            for (String part: parts) {
//                nums.add(Integer.parseInt(part));
//            }
//            result.add(nums);
//        }
//        return result;
//    }

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

//    public static List<Integer> test(List<List<Integer>> inputs){
//        List<Integer> ans = new ArrayList<>();
//        HashMap<Integer, int[]> map = new HashMap<>();
//        int max = Integer.MIN_VALUE;
//        int fMax = 0;
//        int scMax = 0;
//
//        for(int i = 0; i < inputs.size(); i++){
//            List<Integer> list = inputs.get(i);
//            for(int j = 0; j < list.size(); j++){
//                map.putIfAbsent(list.get(j), new int[3]);
//                if(j == 0){
//                    map.get(list.get(j))[0]+=3;
//                    map.get(list.get(j))[1]++;
//                }else if(j == 1){
//                    map.get(list.get(j))[0]+=2;
//                    map.get(list.get(j))[2]++;
//                }else if(j == 2)
//                    map.get(list.get(j))[0]++;
//
//                if(map.get(list.get(j))[0] > max){
//                    max = map.get(list.get(j))[0];
//                    fMax = map.get(list.get(j))[1];
//                    scMax = map.get(list.get(j))[2];
//                }else if (map.get(list.get(j))[0] == max){
//                    fMax = Math.max(fMax, map.get(list.get(j))[1]);
//                    scMax = Math.max(scMax, map.get(list.get(j))[2]);
//                }
//
//            }
//        }
//
//        for(Map.Entry<Integer, int[]> entry : map.entrySet()){
//            if(entry.getValue()[0] == max && entry.getValue()[1] == fMax && entry.getValue()[2] == scMax){
//                ans.add(entry.getKey());
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine()); // số lượng giám khảo
//        List<List<Integer>> inputs = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] parts = sc.nextLine().split(" ");
//            List<Integer> vote = new ArrayList<>();
//            for (String p : parts) {
//                vote.add(Integer.parseInt(p));
//            }
//            inputs.add(vote);
//        }
//
//        List<Integer> result = test(inputs);
//        for (int id : result) {
//            System.out.print(id + " ");
//        }
//    }

//    public static String getValidNumbers(String text) {
//        // write your code here
//        String[] s =  text.split(", ");
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        for(int i = 0; i < s.length; i++){
//            int max = 0;
//            int cur = 0;
//            String str = s[i];
//            for(int j = 0; j < str.length(); j++){
//                if(str.charAt(j) >= '0' && str.charAt(j) <= 9){
//                    cur = cur * 10 + (str.charAt(j) - '0');
//                } else {
//                    max = Math.max(max, cur);
//                    cur = 0;
//                }
//            }
//            pq.add(max);
//
//        }
//        StringBuilder ans = new StringBuilder();
//
//        while(!pq.isEmpty()){
//            ans.append(pq.poll()+", ");
//        }
//
//        return ans.toString().substring(0, s.length-1);
//    }
//    public static void main(String[] args) {
//
//    }
}