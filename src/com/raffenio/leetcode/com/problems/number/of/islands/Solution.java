package com.raffenio.leetcode.com.problems.number.of.islands;

class Solution {


    /**
     * Runtime 17    ms    Beats 6.34%
     * Memory  51.34 MB    Beats 26.47%
     *
     * @param grid
     * @return
     */
    public int numIslandsVisitAll(char[][] grid) {
        int numIslands = 0;

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++ ){
                // System.out.println("grid[" + i + "][" + j + "] = " + grid[i][j]);
                if(checkIslandVisitAll(grid[i][j],  i,  j,  grid)){
                    numIslands++;
                    //System.out.println("Island found at grid[" + i + "][" + j + "]");
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
    private boolean checkIslandVisitAll(char cell , int i, int j, char[][] grid){
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
            //if(){
                try{checkIslandVisitAll(grid[i-1][j] , i-1, j,grid);}
                catch (ArrayIndexOutOfBoundsException e){
                    //System.out.println("out of bounds up");
                }
            //}


            //check right  grid[i][j+1]
            try{checkIslandVisitAll(grid[i][j+1], i, j+1,grid);}
            catch (ArrayIndexOutOfBoundsException e){
               // System.out.println("out of bounds up");
            }
            //check down grid[i+1][j]
            try{checkIslandVisitAll(grid[i+1][j], i+1, j,grid);}
            catch (ArrayIndexOutOfBoundsException e){
               // System.out.println("out of bounds up");
            }

            //check left   grid[i][j-1]
            try{checkIslandVisitAll( grid[i][j-1], i, j-1, grid);}
            catch (ArrayIndexOutOfBoundsException e){
                //System.out.println("out of bounds up");
            }

        }else{
            //in case of water or visited cell, return false
            return false;
        }

        return isIsland;
    }
}