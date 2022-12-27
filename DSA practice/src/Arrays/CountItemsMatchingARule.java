/**
                    Problem Description
 You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

 The ith item is said to match the rule if one of the following is true:

 ruleKey == "type" and ruleValue == typei.
 ruleKey == "color" and ruleValue == colori.
 ruleKey == "name" and ruleValue == namei.
 Return the number of items that match the given rule.

 Example 1:
 Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 Output: 1
 Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

 Example 2:
 Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
 Output: 2
 Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */

package Arrays;
import java.util.ArrayList;
import java.util.List;
public class CountItemsMatchingARule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)){
                                      count++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }    // end of countMatches() method

    public static void main(String[] args) {

        List<String> firstItems = new ArrayList<>();
        firstItems.add("phone");
        firstItems.add("blue");
        firstItems.add("pixel");

        List<String> secondItems = new ArrayList<>();
        secondItems.add("computer");
        secondItems.add("silver");
        secondItems.add("phone");

        List<String> thirdItems = new ArrayList<>();
        thirdItems.add("phone");
        thirdItems.add("gold");
        thirdItems.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(firstItems);
        items.add(secondItems);
        items.add(thirdItems);

        String keyRule = "type", keyValue = "phone";

        System.out.println(countMatches(items, keyRule, keyValue));
    }
}
