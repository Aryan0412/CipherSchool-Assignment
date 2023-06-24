package Lecture12_CipherSchools;

public class Sudoku {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        Sudoko(grid, 0, 0);

    }

    public static void Sudoko(int[][] grid, int cr, int cc) {

//After successfull placement --> change the row
        if(cc == grid.length) {
            cr++;
            cc = 0;
        }
// When succesfully placed --> print
        if(cr == grid.length) {
            Display(grid);
            return;
        }
        // First Case
        if(grid[cr][cc]!=0) {
            Sudoko(grid,cr,cc+1);
        }
        else {

            for (int i = 1; i <= 9; i++) {

                if (isitpossible(grid, i, cr, cc) == true) {
                    grid[cr][cc] = i; //Placing the number in cell
                    Sudoko(grid,cr,cc+1); //Recursion Function Call
                    grid[cr][cc] = 0; // Backtracking
                }
            }
        }

    }
    public static boolean isitpossible(int [][] grid,int val,int row,int col) {

        int c = 0;
        while(c<grid.length) {
            if(grid[row][c]==val) {
                return false;
            }
            c++;
        }
        int r = 0;
        while(r < grid.length) {
            if(grid[r][col]==val) {
                return false;
            }
            r++;
        }

        // For 3*3 matrix
        r = row - row%3;
        c = col - col%3;
        for(int i = r; i < r+3;i++) {
            for(int j = c;j<c+3;j++) {
                if(grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;

    }




    public static void Display(int [][] grid) {
        for(int i = 0; i < grid.length;i++) {
            for(int j = 0; j < grid[0].length;j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
