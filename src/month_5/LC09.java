package month_5;

import java.lang.reflect.Array;
import java.util.Arrays;

//79. 单词搜索
public class LC09 {
    static  boolean res = false;
    public static boolean exist(char[][] board, String word) {
        boolean[][] b = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)) {
                    b[i][j]=true;
                    if(dfs(board,word,0,i,j,b)) return true;
                    b[i][j]=false;
                }
            }
        }
        return false;


    }
    private static boolean dfs(char[][] board, String word, int index, int i, int j,boolean[][] b) {
        if(index==word.length()-1) {
            return true;
        }
        if(1<=i&&board[i-1][j]==word.charAt(index+1)&&b[i-1][j]!=true) {
            b[i-1][j]=true;
            if(dfs(board,word,index+1,i-1,j,b)) return true;
            b[i-1][j]=false;
        }
        if(i<board.length-1&&board[i+1][j]==word.charAt(index+1)&&b[i+1][j]!=true){
            b[i+1][j]=true;
            if(dfs(board,word,index+1,i+1,j,b)) return true;
            b[i+1][j]=false;
        }
        if(1<=j&&board[i][j-1]==word.charAt(index+1)&&b[i][j-1]!=true) {
            b[i][j-1]=true;
            if(dfs(board,word,index+1,i,j-1,b)) return true;
            b[i][j-1]=false;
        }
        if(j<board[0].length-1&&board[i][j+1]==word.charAt(index+1)&&b[i][j+1]!=true){
            b[i][j+1]=true;
            if(dfs(board,word,index+1,i,j+1,b)) return true;
            b[i][j+1]=false;
        }
        return false;

    }


    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));
    }
}
