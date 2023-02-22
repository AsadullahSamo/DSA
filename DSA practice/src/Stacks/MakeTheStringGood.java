package Stacks;

import java.util.Stack;

public class MakeTheStringGood {

    public static String makeGood(String s) {

        Stack<String> goodString = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (!goodString.isEmpty()) {

                if (String.valueOf(s.charAt(i)).equals(goodString.peek().toUpperCase()) || String.valueOf(s.charAt(i)).toUpperCase().equals(goodString.peek())) {
                    if (goodString.peek().equals(String.valueOf(s.charAt(i)))){
                        goodString.push(String.valueOf(s.charAt(i)));
                    } else {
                        goodString.pop();
                    }
                } else {
                    goodString.push(String.valueOf(s.charAt(i)));
                }
            } else {
                goodString.push(String.valueOf(s.charAt(i)));
            }
        }

        StringBuilder str = new StringBuilder("");
        while (!goodString.isEmpty()){
            str.append(goodString.peek());
            goodString.pop();
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {

        String s = "leEeetcode";
        System.out.println(makeGood(s));
        String s2 = "abBAcC";
        System.out.println(makeGood(s2));
        String s3 = "Pp";
        System.out.println(makeGood(s3));
        String s4 = "kkdsFuqUfSDKK";
        System.out.println(makeGood(s4));
    }
}
