package com.raffenio.leetcode.com.problems.best.time.to.buy.and.sell.stock.ii;

public class BestTimeToBuyAndSellStockiiSolution {

    /**
     *
    EXPLANATION

     buy when low the lowest before rise again
     sell when high the highest before drop again

     --- [7,1,5,3,6,4]
     ---------------------------------
     7 -  *
     6 -  *       *
     5 -  *   *   *
     4 -  *   *   * *
     3 -  *   * * * *
     2 -  *   * * * *
     1 -  * * * * * *
     -----------------------------------
     --- [7,1,5,3,6,4]
          B S B S H
           -1+5-3+6    = 7


         EXTRA WRONG CASES I got
         prices = [1,2]   expected = 1


     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
            //buy when low the lowest before rise again
            int lowest= Integer.MAX_VALUE;
            int higest=-1;
            int i=0;
            boolean imBuying=true;
            int stoks=0;

            while(i<prices.length){
                /*if(imBuying){System.out.println("<<<-----------");}else{System.out.println("----------->>>"); }*/
                //System.out.println("i "+i+" price: "+prices[i]+" imBuying: "+imBuying);

                if(imBuying){
                    //het the lower price
                    if(prices[i]<=lowest){
                        lowest =  prices[i];
                        //System.out.println("i "+i+" price: "+prices[i]+" imBuying: "+imBuying+" lowest: "+lowest);
                        i++;
                    }else{
                        //buy day before
                        i--;
                        stoks += -prices[i]; //negative 'coz is buying
                        //System.out.println("i "+i+" price: "+prices[i+1]+" imBuying: "+imBuying+" day Before(LOWEST): "+prices[i] + "   stoks: "+stoks +"  FOUND LOWEST" );
                        imBuying = false;
                        higest = prices[i];
                        lowest= Integer.MAX_VALUE;
                    }
                }else{//im selling
                    //try to get the higset price
                    if(prices[i]>=higest){
                        higest =  prices[i];
                        //System.out.println("i "+i+" price: "+prices[i]+" imBuying: "+imBuying+" higest: "+higest);
                        i++;
                    }else{
                        //sell day before
                        i--;
                        stoks += prices[i]; //postive 'coz is selling
                        // System.out.println("i "+i+" price: "+prices[i+1]+" imBuying: "+imBuying+" day Before(HIGEST): "+prices[i] + "   stoks: "+stoks  +"  FOUND HIGHEST" );
                        imBuying = true;
                        lowest = prices[i];
                        higest= 0;
                    }

                    //if last day , and I haven't sold and still highest price, then sell
                    if(i == prices.length && !imBuying){
                        stoks += prices[i-1]; //postive 'coz is selling
                        // System.out.println("i "+i+" price: "+prices[i-1]+" imBuying: "+imBuying+" day Before(HIGEST): "+prices[i-1] + "   stoks: "+stoks  +"  FOUND HIGHEST" );
                        imBuying = true;
                    }
                }

            }
            return stoks <0 ? 0 : stoks; // no negative cases
        }
}
