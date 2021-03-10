import java.util.*;

class GetMaximumProfit {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int numberOfVillages = sc.nextInt();
        int[] profits = new int[numberOfVillages];
        for(int i=0;i<numberOfVillages;i++){
            profits[i]=sc.nextInt();
        }
        int maxprofit = 0;
        // for(int j=0;j<profits.length;j++){
        //     System.out.println(profits[j]);
        // }
        int max = getmaxprofit(profits,numberOfVillages);
        System.out.println(max);
    }
    public static int getmaxprofit(int[] p, int n){
       int i,j,max=0;
       int msis[] = new int[n];

       for(i=0;i<n;i++){
           msis[i]=p[i];
       }

       for(i=1;i<n;i++){
           for(j=0;j<i;j++){
               if(p[i]>p[j] && p[i]%p[j]==0 && msis[i] < msis[j]+p[i]){
                   msis[i] = msis[j]+p[i];
               }
           }
       }
       for(i=0;i<n;i++){
           if(max < msis[i]){
               max = msis[i];
           }
       }
       return max;
    }     
}
