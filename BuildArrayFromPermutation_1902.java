public class BuildArrayFromPermutation_1902 {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i += 1) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] res = buildArray(new int[]{0, 2, 1, 5, 3, 4});

        for (var ele: res){
            System.out.print(ele + " ");
        }

        System.out.println();

        res = buildArray(new int[]{5, 0, 1, 2, 3, 4});

        for (var ele: res){
            System.out.print(ele + " ");
        }

        System.out.println();

    }
}
