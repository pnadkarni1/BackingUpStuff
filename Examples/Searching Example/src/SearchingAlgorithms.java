public class SearchingAlgorithms {

    public static void main(String[] args) {

        int [] nums = {7, 21, 29, -19, 53, 1, -25};

        System.out.println("Linear");
        System.out.println(linearSearch(nums, 1));
        System.out.println(linearSearch(nums, 55));

        System.out.println("\nIterative Binary\n");
        System.out.println(iterartiveBinary(nums, -19));
        System.out.println(iterartiveBinary(nums, 59));

        System.out.println("\nRecursive Binary\n");
        System.out.println(recursiveBinary(nums, 21));
        System.out.println(recursiveBinary(nums, -7));
    }
    private static int recursiveBinary(int[] nums, int target) {
        return recBinary(nums, 0, nums.length, target);
    }
    private static int recBinary(int[] nums, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }else if (nums[mid] < target) {
            return recBinary(nums, mid + 1, end, target);
        }else {
            return recBinary(nums, start, mid, target);
        }
    }
    private static int iterartiveBinary(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return -1;
    }
    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
