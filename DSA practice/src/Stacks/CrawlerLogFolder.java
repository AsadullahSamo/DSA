package Stacks;

import java.util.Stack;

public class CrawlerLogFolder {

    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int i=0;
        while (i<logs.length){
            if (logs[i].equals("../")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else if(logs[i].equals("./")){
              i++;
              i--;
            } else {
                stack.push(logs[i]);
            }
            i++;
        }
        return stack.size();
    }

    public static void main(String[] args) {

        String [] logs1 = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs1));
        String [] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs2));
        String [] logs3 = {"d1/","../","../","../"};
        System.out.println(minOperations(logs3));
    }
}
