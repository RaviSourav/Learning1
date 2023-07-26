package org.example.test;

public class IntervalMerger {
    public static int[][] checkInterval(int[][] interval, int[] newInterval)
    {
        int[][] newMerge = new int[5][2];
        for(int i=0;i<newInterval.length;i++)
        {
            for(int j=0;j<interval.length;i++)
            {
                for(int k=0;k<interval[i].length;k++)
                {
                    if(newInterval[i]>=interval[j][k] && newInterval[i]<=interval[j][interval.length-1])//j=0,k=0
                    {
                        if(newInterval[newInterval.length-1]>=interval[j][k] && newInterval[newInterval.length-1]<=interval[j][interval.length-1])
                        {
                            interval[j][interval.length-1] = Math.max(interval[j][interval.length-1],newInterval[newInterval.length-1]);
                        }
                    }
                    else if(newInterval[newInterval.length-1]>=interval[j+1][interval.length-1] && newInterval[newInterval.length-1]>=interval[j][k] && newInterval[newInterval.length-1]<=interval[j][interval.length-1])
                    {

                    }
                }
            }
        }
        return newMerge;
    }

    //Input: intervals = [[1,3],[6,9]], newInterval = [2,5] Output: [[1,5],[6,9]] //Max = 3,5 = 5
    //[[1,3],[6,9]], newInterval = [2,7] Output: [[1,9]]
    //[[1,7],[6,9]]
    // Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8] Output: [[1,2],[3,10],[12,16]]
    public static void main(String[] args) {

    }
}
