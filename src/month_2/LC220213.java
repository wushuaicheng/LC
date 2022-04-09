package month_2;

public class LC220213 {
  /*  public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            res = Math.max(res, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
*/
  public int maxArea(int[] height){
      int res = 0;
      int area=0;
      int i = 0 ;
      int j = height.length-1;
      while(i<j){
          area = (j-i)*Math.min(height[i],height[j]);
          res=res>area?res:area;
          if(height[i]>height[j]){
              j--;
          }else {
              i++;
          }
      }
      return res;

  }
}
