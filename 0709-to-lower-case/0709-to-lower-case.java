class Solution {
    public String toLowerCase(String s) {
        
        String res = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int ascii = (int) c; // 72
            if(65 <= ascii && ascii <= 90)
            {
                ascii = ascii + 32; // 104
                res = res + (char) ascii;
                continue;
            }
            res = res + s.charAt(i);
        }
        return res;
    }
}