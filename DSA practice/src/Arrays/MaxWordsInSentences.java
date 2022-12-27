package Arrays;

public class MaxWordsInSentences {

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i=0; i<sentences.length; i++){
            int counter = 1;
            for (int j=0; j< sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    counter++;
                }
            }
            if(counter>maxWords) {
                maxWords = counter;
            }
        }
        return maxWords;
    }

    public static void main(String[] args) {

        String [] sentencesSet1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentencesSet1));
        String [] sentencesSet2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentencesSet2));

    }     // end of main() method
}

