import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            // if opening bracket, Push In Stack.
            // if Closing bracket. Pop from Stack.
            
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    char top = stack.peek();
                    if(ch == ')' && top == '(' ||
                       ch == '}' && top == '{' ||
                       ch == ']' && top == '[')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}