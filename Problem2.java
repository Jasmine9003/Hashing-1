// Time Complexity : O(n)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {

   public boolean isIsomorphic(String s, String t) {

       if(s.length()!=t.length()) return false;

       HashMap<Character,Character> h = new HashMap<>(26);

       for(int i=0;i<s.length();i++){

           if(h.get(s.charAt(i))!=null){

               if(h.get(s.charAt(i))!=t.charAt(i)) return false;

           }

           else h.put(s.charAt(i),t.charAt(i));

       }

       HashMap<Character,Character> h2 = new HashMap<>(26);

       for(int i=0;i<t.length();i++){

           if(h2.get(t.charAt(i))!=null){

               if(h2.get(t.charAt(i))!=s.charAt(i)) return false;

           }

           else h2.put(t.charAt(i),s.charAt(i)); 

   }

       return true;

}

}