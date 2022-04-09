package month_4;

import java.util.Arrays;

public class LC02 {
//1986. 完成任务的最少工作时间段

/*

    public static int minSessions(int[] tasks, int sessionTime) {
        int res = tasks.length ;
        int sCount = 0 ;
        int tCount = 0 ;
        int[] session = new int[tasks.length];
        backage(sCount,tCount,sessionTime,res,session,tasks);
       // System.out.println("res"+res);
        return res;

    }

    private static void backage(int sCount, int tCount,int sessionTime, int res, int[] session, int[] tasks) {
        if(sCount>res) return;
        if(tCount==tasks.length){
          //  System.out.println(res);
            res=Math.min(res,sCount);
            return;
        }
        for (int i = 0; i < sCount; i++) {
            if(session[i]+tasks[tCount]<=sessionTime){
                session[i]+=tasks[tCount];
                backage(sCount,tCount+1,sessionTime,res,session,tasks);
                session[i]-=tasks[tCount];
            }
        }
        session[sCount]+=tasks[tCount];
        backage(sCount+1,tCount+1,sessionTime,res,session,tasks);
        session[sCount]-=tasks[tCount];
    }
*/
    static int res = 0;

    public static int minSessions(int[] tasks, int sessionTime) {
        //构造一个tasks长的容器数组，其中每个元素代表一个容器，每个容器的最大值是sessionTime
        int[] session = new int[tasks.length];
        res = tasks.length;
        //第几个元素
        int tCount = 0;
        //第几个容器
        int sCount = 0;
        backage(tCount,sCount,sessionTime,tasks,session);
        return res;
    }
    private static void backage(int tCount, int sCount, int sessionTime, int[] tasks, int[] session) {
        //剪枝
        if (sCount > res) return;
        //都判断完了取最小值
        if (tCount == tasks.length) {
            res = Math.min(res, sCount);
            System.out.println(res);
            return;
        }
        //测试新的tasks[tCount]能放到已有的那个容器里 如果能则进行下一个回溯
        for (int i = 0; i < sCount; i++) {
            //看能放到那个已有的容器里
            if (tasks[tCount] + session[i] <= sessionTime) {
                session[i] += tasks[tCount];

                backage(tCount + 1, sCount, sessionTime, tasks, session);
                session[i] -= tasks[tCount];
            }
        }
        //都放不进去，开起一个新的session 再进行下一次回溯
        session[sCount] += tasks[tCount];
        backage(tCount + 1, sCount + 1, sessionTime, tasks, session);
        session[sCount] -= tasks[tCount];
    }

    public static void main(String[] args) {
        System.out.println(minSessions(new int[]{1,2,3},3));
    }



}








