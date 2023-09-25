public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        long maxEndingHere = nums[0];
        long maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
