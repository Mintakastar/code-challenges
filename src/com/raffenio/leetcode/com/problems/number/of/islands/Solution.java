package com.raffenio.leetcode.com.problems.number.of.islands;

class Solution {





    /**
     Runtime   4      ms        Beats    51.33%
     Memory    49.77    MB      Beats   46.19%
     *
     * @param grid
     * @return
     */
    public int numIslandsIfs(char[][] grid) {
        int numIslands = 0;

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++ ){
                if(checkIslandIfs(grid[i][j],  i,  j,  grid)){
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    /*
     *   check if a particular cell is island,
     *   and mark complete island as visited

                  y  x
             grid[i][j]


                    j
            {'1', '1', '0', '0', '0'},
        i   {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}

            cell == '1'  land
            cell == '0'  water
            cell == ' '  visited

     */
    private boolean /*dfs*/ checkIslandIfs(char cell , int i, int j, char[][] grid){
        boolean isIsland=false;

        if(cell == '1'){
            isIsland = true;

            //if valida los rangos

            //mark current cell as visited
            grid[i][j] = ' ';

            //check 4 directions   up, right, down, left

            //check up grid[i-1][j]
            if( (i-1 >= 0) ){
                checkIslandIfs(grid[i-1][j] , i-1, j,grid);
            }

            //check right  grid[i][j+1]
            if( ((j+1) < grid[0].length) ) {
                checkIslandIfs(grid[i][j + 1], i, j + 1, grid);
            }
            //check down grid[i+1][j]
            if( (i+1) < grid.length ) {
                checkIslandIfs(grid[i + 1][j], i + 1, j, grid);
            }

            //check left   grid[i][j-1]
            if(( j-1) >= 0  ){
                checkIslandIfs( grid[i][j-1], i, j-1, grid);
            }
        }else{
            //in case of water or visited cell, return false
            return false;
        }

        return isIsland;
    }



    /**
     * Runtime 17    ms    Beats 6.34%
     * Memory  51.34 MB    Beats 26.47%
     *
     * @param grid
     * @return
     */
    public int numIslandsTryCatch(char[][] grid) {
        int numIslands = 0;

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++ ){
                if(checkIslandTryCatch(grid[i][j],  i,  j,  grid)){
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    /*            y  x
             grid[i][j]


                    j
            {'1', '1', '0', '0', '0'},
        i   {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}

            cell == '1'  land
            cell == '0'  water
            cell == ' '  visited

     */
    private boolean checkIslandTryCatch(char cell , int i, int j, char[][] grid){
        //check if a particular cell is island,
        //and mark complete island as visited
        boolean isIsland=false;

        if(cell == '1'){
            isIsland = true;
            //System.out.println("check complete island");

            //System.out.println("derecha: "+ grid[i][j+1]);
            //System.out.println("abajo: "+   grid[i+1][j]);
            //System.out.println("izq: "+   grid[i][j-1]);
            //System.out.println("arriba: "+   grid[i-1][j]);

            //mark current cell as visited
            grid[i][j] = ' ';

            //check 4 directions   up, right, down, left


            //check up grid[i-1][j]
            try{checkIslandTryCatch(grid[i-1][j] , i-1, j,grid);}
            catch (ArrayIndexOutOfBoundsException e){}

            //check right  grid[i][j+1]
            try{checkIslandTryCatch(grid[i][j+1], i, j+1,grid);}
            catch (ArrayIndexOutOfBoundsException e){}

            //check down grid[i+1][j]
            try{checkIslandTryCatch(grid[i+1][j], i+1, j,grid);}
            catch (ArrayIndexOutOfBoundsException e){}

            //check left   grid[i][j-1]
            try{checkIslandTryCatch( grid[i][j-1], i, j-1, grid);}
            catch (ArrayIndexOutOfBoundsException e){}

        }else{
            //in case of water or visited cell, return false
            return false;
        }

        return isIsland;
    }
}