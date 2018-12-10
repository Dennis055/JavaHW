import java.util.Stack;

public class Problem5 {
/*
 * 考點：pattern matching stack
 * 這題相當於考老師說會考的pattern match 
 * 所以直接實作()的pattern matching
 */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;

                char topChar = stack.pop();
                if(c == ')' && topChar != '(')
                    return false;
                if(c == ']' && topChar != '[')
                    return false;
                if(c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}
