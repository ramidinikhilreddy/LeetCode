class Solution {
    public void reverseString(char[] s) {
        int n =s.length;
       int a = 0;
        int b = n-1;
        while(a<=b)
        {
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
    }
}