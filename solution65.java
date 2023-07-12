import java.util.Arrays;

public class solution65 {

        public int minProductSum(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int sum = 0;
            int length = nums1.length;
            for (int i = 0; i < length; i++)
                sum += nums1[i] * nums2[length - 1 - i];
            return sum;
        }

    public static void main(String[] args) {
        solution65 s65=new solution65();
        System.out.println(s65.minProductSum(new int[]{5,3,4,2},new int[]{4,2,2,5}));
    }

    }


