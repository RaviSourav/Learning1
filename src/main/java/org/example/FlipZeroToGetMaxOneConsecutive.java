package org.example;
import java.util.*;


    class FlipZeroToGetMaxOneConsecutive {
        public static int longestOnes(int[] nums, int k) {
            int i = 0, j;
            for (j = 0; j < nums.length; ++j) {
                if (nums[j] == 0) k--;
                System.out.println("j: "+j+" i: "+i+" k: "+k);
                if (k < 0 && nums[i++] == 0) k++;
                System.out.println("j: "+j+" i: "+i+" k: "+k);
            }
            return j - i;
        }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
            int k = 2;
            int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
            System.out.println(longestOnes(nums, k));
        }
}
