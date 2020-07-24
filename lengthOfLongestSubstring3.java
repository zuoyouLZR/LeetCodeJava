import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lengthOfLongestSubstring3 {
    public int lengthOfLongestSubstring(String s){
        if(s.length()==0)
            return 0;
        int []d=new int[s.length()];
        int l=0,r=0;
        Set<Character> set=new HashSet<>();

        while(l<s.length()){
            while(r<s.length() && !set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            d[l]=r-l;
            set.remove(s.charAt(l));
            l++;
        }
        int max=d[0];
        for(int i=1;i<d.length;i++)
            if(max<d[i])
                max=d[i];
        return max;
    }
}
