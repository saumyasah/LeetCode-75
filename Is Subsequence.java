class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char tt[]=t.toCharArray();
        char ss[]=s.toCharArray();
        if(m<1)
        return true;
        while(i<n)
        {
            if(tt[i]==ss[j])
            j++;
            i++;
            if(m==j)
            return true;
        }
return false;

    }
}


