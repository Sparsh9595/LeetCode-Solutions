class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!st.isEmpty())
                    ans += c;
                st.push(c);
            } else {
                st.pop();
                if (!st.isEmpty())
                    ans += c;
            }
        }

        return ans;
    }
}