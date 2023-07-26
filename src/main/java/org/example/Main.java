package org.example;
import java.util.*;

public class Main {

    public static int maxOperations(int[] nums, int k) {

        int count = 0;
        List<Integer> a  = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            a.add(nums[i]);
        for(int i=0;i<a.size();i++)
        {
            if(a.contains(k-a.get(i)) && (a.indexOf(k-a.get(i))!=a.lastIndexOf(k-a.get(i)) || (k-a.get(i)!=a.get(i))) )
            {
                int temp = k-a.get(i);
                a.remove(Integer.valueOf(a.get(i)));
                 System.out.println(a+" "+a.size());
                a.remove(Integer.valueOf(temp));
                 System.out.println(a+" "+a.size());
                count++;
            }
        }
        return count;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4};
        System.out.println(maxOperations(a,5));;
    }

}


