package month_2;

public class LC220223 {
    /*public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0||target==1) return target-1;
        if(target%2==0) return minMoves(target/2,maxDoubles-1)+1;
        else return minMoves((target-1)/2,maxDoubles-1)+2;

    }*/
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0) return target-1;

        int res = 0;
        while(target>1){
            if(maxDoubles!=0||target%2==0){
                res++;
                target=target/2;
                maxDoubles--;
            }else{
                res++;
                target--;
            }

        }
        return res;

    }
}

