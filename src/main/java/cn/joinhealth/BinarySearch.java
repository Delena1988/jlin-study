package cn.joinhealth;

/**
 * 二分法
 *
 * @author linjian
 * @date 2022/7/14 09:43
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        System.out.println("binarySearch: " + binarySearch(array, 5) + "\n");
        System.out.println("binarySearch2: " + binarySearch2(array, 5) + "\n");
        System.out.println("binarySearch3: " + binarySearch3(array, 5, 0, 3) + "\n");
    }

    /**
     * 左闭右闭的区间写法[left,right]： while(left<=right) left的改变为left=mid+1,right的改变为right=mid-1;
     *
     * @param nums   排序数组
     * @param target 目标值
     * @return
     */
    public static int binarySearch(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("searchInsert left: " + left + ",right: " + right + ",mid: " + mid + ",nums[mid]: " + nums[mid]);
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    /**
     * 左闭右开的区间写法[left,right) : while(left<right) left的改变为left=mid+1,right的改变为right=mid;
     *
     * @param nums   排序数组
     * @param target 目标值
     * @return
     */
    public static int binarySearch2(int[] nums, int target) {
        int len = nums.length;
        //左闭右开所以right为len
        int left = 0, right = len;
        while (left < right) {
            int mid = (left + right) / 2;
            System.out.println("searchInsert2 left: " + left + ",right: " + right + ",mid: " + mid + ",nums[mid]: " + nums[mid]);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    /**
     * 递归
     *
     * @param nums   排序数组
     * @param target 目标值
     * @param left   左角标
     * @param right  右角标
     * @return
     */
    public static int binarySearch3(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        System.out.println("searchInsert3 left: " + left + ",right: " + right + ",mid: " + mid + ",nums[mid]: " + nums[mid]);
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch3(nums, target, left, mid - 1);
        } else {
            return binarySearch3(nums, target, mid + 1, right);
        }
    }
}
