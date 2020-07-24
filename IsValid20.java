public class IsValid20 {
    public  boolean isValid(String s){
        if(s.length()==0)
            return true;
        char []stack=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case('('):{stack[index++]=s.charAt(i);break;}
                case('['):{stack[index++]=s.charAt(i);break;}
                case('{'):{stack[index++]=s.charAt(i);break;}
                case(')'):{if(index>=1 && stack[index-1]=='(') index--;else return false; break;}
                case(']'):{if(index>=1 && stack[index-1]=='[') index--;else return false; break;}
                case('}'):{if(index>=1 && stack[index-1]=='{') index--;else return false; break;}
            }
        }
        if(index==0)
            return true;
        else
            return false;
    }
}
