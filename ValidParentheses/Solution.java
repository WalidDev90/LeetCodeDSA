import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if (s.length() % 2 != 0) {
                return false;
            }
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                list.add(c);
            }
            else {
                if (list.isEmpty()) {
                    return false;
                }

                if (c == ')' && list.get(list.size() -1) != '(')
                    return false;

                if (c == '}' && list.get(list.size() -1) != '{')
                    return false;

                if (c == ']' && list.get(list.size() -1) != '[')
                    return false;

                list.remove(list.size() -1);
            }
        }
        return list.isEmpty();
    }
}


