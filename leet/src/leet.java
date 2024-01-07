public class leet{
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int target=9;
        int ans=twoSum(nums,target);
        System.out.println(ans);
    }
    static int[] twoSum(int[] nums, int target) {
        int n=nums.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return{i,j};

                }
            }
        }
        return {};
    }
};


