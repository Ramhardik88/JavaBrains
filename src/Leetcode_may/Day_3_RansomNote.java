package Leetcode_may;

import java.util.HashMap;

public class Day_3_RansomNote
{
    public static void main(String[] args) {
        String ransomNote="ram";
        String magazine="kumar";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hash=new HashMap<>();

        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);

        }

        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(!hash.containsKey(ch) || hash.get(ch)<=0){
                return false;
            }
            hash.put(ch,hash.get(ch)-1);
        }
        return true;
    }
}
