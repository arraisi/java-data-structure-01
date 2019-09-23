package com.itsarraisi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        Tree tree = new Tree(5, new Tree(3, new Tree(20, null, null), new Tree(21, null, null)), new Tree(10, new Tree(1, null, null), null));
        Tree tree1 = new Tree(8, new Tree(2, new Tree(8, null, null), new Tree(7, null, null)), new Tree(6,null, null));
//        int i = main.visibleNodes(tree1);
//        System.out.println(i);

        String a = "abdul rahman arraisi";
        char[] chars = a.toCharArray();
        for(int i=0; i<chars.length;i++){
            if (chars[i] == '.'){

            }
        }
        Date today = new Date(); // Fri Jun 17 14:54:28 PDT 2016
        Calendar cal = Calendar.getInstance();
        cal.setTime(today); // don't forget this if date is arbitrary e.g. 01-01-2014

        int month = cal.get(Calendar.MONTH); // 5
        int year = cal.get(Calendar.YEAR);
        String s = String.valueOf(year +"-"+ (month+1) +"-"+ "01");
        System.out.println(s);
    }

    public Boolean oneSwapToOrderArray(int[] A) {

        int count = 0;
        int[]B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++)
        {
            if(A[i] != B[i]) count++;
        }

        if(count > 2) return false;
        return true;

//        Integer countWrongPosition = 0;
//        Integer countSamePosition = 0;
//
//        if (A.length == 2 && A[0] == A[1]) {
//            return true;
//        }
//
//        for (int i = 0; i < A.length; i++) {
//            if (i != A.length - 1) {
//                if (A[i] > A[i + 1]) {
//                    countWrongPosition++;
//                } else if (A[i] == A[i + 1]) {
//                    countSamePosition++;
//                }
//            }
//        }
//        if (countSamePosition > 0 && countWrongPosition == 1) {
//            return true;
//        } else if (countWrongPosition == 0) {
//            return true;
//        }
//        return false;
    }

    public Integer findMinOccurInArray(int[] A, int[] B) {
//        for (Integer a : A) {
//            System.out.print(a + ", ");
//        }
//        System.out.println("Array 1");
//        for (Integer b : B) {
//            System.out.print(b + ", ");
//        }
//        System.out.println("Array 2");
//
        Arrays.sort(A);
        Arrays.sort(B);
//        List<Integer> listA = new ArrayList<Integer>(Arrays.asList(A));
//        List<Integer> listB = new ArrayList<Integer>(Arrays.asList(B));
//        if (A.length > B.length) {
//            System.out.println("A > B");
//            for (Integer a : listA) {
//                if (listB.contains(a)) {
//                    return a;
//                }
//            }
//        } else{
//            System.out.println("B > A");
//            for (Integer b : listB) {
//                if (listA.contains(b)) {
//                    return b;
//                }
//            }
//        }

        Map<Integer, String> map = new HashMap<>();
        if (A.length < B.length){
            for (Integer a : A){
                map.put(a, null);
            }

            for (Integer b : B){
                if(map.containsKey(b)){
                    return b;
                }
            }
        }
        return -1;
    }

    public Integer findValueFromArray(int[] A, Integer X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2 + 1;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;

//        Integer N = A.length;
//        if (N == 0) {
//            return -1;
//        }
//        Integer l = 0;
//        Integer r = N - 1;
//
//        while (l < r) {
//            Integer m = (l + r) % r;
//            if (A[m] == X) {
//                r = m - 1;
//            } else{
//                l = m + 1;
//            }
//        }
//
//        if (A[l] == X) {
//            return l;
//        }
//        return -1;
    }

    public String reverseString(String A) {
        String result = "";
        String[] split = A.split(" ");
        for (int i = 0; i < split.length; i++) {
            StringBuilder a = new StringBuilder();
            a.append(split[i]);
            a.reverse();
            result += a;
            if (i < split.length - 1) {
                result += " ";
            }
        }
        System.out.println(A.length());
        System.out.println(result.length());
        return result;
    }

    public Integer visibleNodes(Tree T) {
        return numVisible(T, Integer.MIN_VALUE);
    }

    public int numVisible(Tree T, Integer maxValue) {
        if (T == null) {
            return 0;
        }

        Integer num = 0;

        if (T.x >= maxValue) {
            num = 1;
            maxValue = T.x;
        }

        return num + numVisible(T.l, maxValue) + numVisible(T.r, maxValue);
    }
}

class Tree {
    public Integer x;
    public Tree l;
    public Tree r;

    public Tree(Integer x, Tree l, Tree r) {
        this.x = x;
        this.l = l;
        this.r = r;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Tree getL() {
        return l;
    }

    public void setL(Tree l) {
        this.l = l;
    }

    public Tree getR() {
        return r;
    }

    public void setR(Tree r) {
        this.r = r;
    }
}