package month_3;

import java.util.HashMap;
import java.util.Map;

public class LC14 {
    //535. TinyURL 的加密与解密
   /* Map<Integer, String> map = new HashMap<>();
    int i = 0;
    public String encode(String longUrl) {
        map.put(i, longUrl);
        return "http://tinyurl.com/" + i++;
    }
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
    */

    int i = 1;
    Map<String, String> map = new HashMap<>();
    String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String getString(){
        StringBuilder stringBuilder = new StringBuilder();
       while (i>0){
           i--;
           stringBuilder = new StringBuilder();
           stringBuilder.append(chars.charAt(i%62));
           i=i/62;
       }
       return stringBuilder.toString();
    }
   public String encode(String longUrl) {
       String string = getString();
       map.put(string, longUrl);
       return "http://tinyurl.com/" +string;
   }
    public String decode(String shortUrl) {
        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
    }
}
