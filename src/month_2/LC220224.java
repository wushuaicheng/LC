package month_2;

public class LC220224 {
    public int countCharacters(String[] words, String chars) {
        int[] exp = new int[26];
        int res = 0;

        for (char c : chars.toCharArray())  exp[c-'a']++;
        a:for (String word : words) {
            int[] i = new int[26];
            for (char c : word.toCharArray()) i[c-'a']++;
            for(int j = 0 ; j < 26 ; j++){
                if(exp[j]<i[j]) continue a;

            }
            res+=word.length();
        }
        return res;
    }


}
