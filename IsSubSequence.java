package DSA;

public class IsSubSequence {
    public static boolean isSubSequence(String s, String t){
        int i=0;
        int j=0;

        while (i<s.length() && j<t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                continue;
            }
            if (s.charAt(i) != t.charAt(j)){
                j++;
                continue;
            }
        }
        if (i==s.length()) return true;

        return false;
    }
    public static void main(String[] args) {
        String s= "axc";
        String t = "ahbgdc";
        System.out.println(isSubSequence(s,t));
    }
}
