public class Solution {
    public static void main(String[] args) {
        String s = "{[()]"; // Replace with your desired input string
        boolean isValid = new Solution().isValid(s);
        System.out.println(isValid);
    }
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
