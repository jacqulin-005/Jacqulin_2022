package practice.demo;

import java.util.HashMap;

public class SubSequenceCount {

        static int findSubarraySum(int arr[], int n, int sum)
        {
            // HashMap to store number of subarrays
            // starting from index zero having
            // particular value of sum.
            HashMap<Integer, Integer> prevSum = new HashMap<>();
            prevSum.put(0,1);
            int res = 0;

            // Sum of elements so far.
            int currSum = 0;

            for (int i = 0; i < n; i++) {

                // Add current element to sum so far.
                currSum += arr[i];
                //calculate the sum that have to be removed
                //so that we can get the desired sum
                int removeSum=currSum-sum;
               // System.out.println("arr["+i+"] ="+ arr[i] +"  Res = "+res+" currSum  =" + currSum  +" removeSum =" +removeSum );
                //get count of occurrences of that sum that
                //have to removed and add it to res value
                if (prevSum.containsKey(removeSum))
                    res += prevSum.get(removeSum);

                // Add currsum value to count of
                // different values of sum.
                prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);

                System.out.println("Occurence Count  ="+res+" currSum  =" + currSum  +" removeSum =" +removeSum );
                System.out.println(prevSum.toString());

            }

            return res;
        }

        public static void main(String[] args)
        {

           // int arr[] = { 10, 2, -2, -20, 10 ,-10};
            int arr[] = {0,0, 1,1,1,1,0,2,0,0,0,-1,1,2,-4 ,6,1,2,0,0};
        	//int arr[] = { 0,0,1,1,2,0};
        	//int arr[] = {1,2,3,0};
            int sum = 2;
            int n = arr.length;
            System.out.println("Num of Sub Seq " +findSubarraySum(arr, n, sum));
        }

}