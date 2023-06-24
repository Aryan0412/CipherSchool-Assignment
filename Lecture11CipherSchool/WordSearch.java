package Revision;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length;i++) {
            for(int j = 0;j < board[0].length;j++) {
                if(board[i][j]==word.charAt(0)) {
                    boolean ans = Search(board,i,j,word,0);
                    if(ans == true) {
                        System.out.println(ans);
                        return ans;
                    }
                }
            }
        }
        return false;
    }
    public static boolean Search(char[][] maze, int cr, int cc, String word, int idx) {
        if(idx == word.length()) {
            return true;
        }

        if(cc<0 || cr < 0 || cc>=maze[0].length || cr>=maze.length || maze[cr][cc]!=word.charAt(idx)) {
            return false;
        }
        maze[cr][cc] = '*';

        int [] row = {0,1,0,-1};
        int [] column = {1,0,-1,0};
        for(int i = 0;i < row.length;i++) {
            boolean ans = Search(maze,cr+row[i],cc+column[i],word,idx+1);
            if(ans == true) {
                return true;
            }
        }
        maze[cr][cc]=word.charAt(idx);
        return false;


    }
}
