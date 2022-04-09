package month_4;

public class LC28 {
    public static boolean canConstruct(String s, int k) {

        int length = s.length();
        int[] ints = new int[26];
        for (int i = 0; i < length ; i++) {
            ints[s.charAt(i)-'a']++;
        }
        int j = 0;
        int o = 0;
        for (int anInt : ints) {
            if(anInt%2!=0){
                j++;
            }
        }

        return (j<=k&&k<=length)?true:false;
    }

    public static void main(String[] args) {

        System.out.println(canConstruct("cr",7));
    }
}
