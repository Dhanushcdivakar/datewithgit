// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[]nums,int target) {

        int[]ans={-1,-1};
        int start =search(nums,target, findStartIndex: true);
        int end =search(nums,target, findStartIndex: false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    //to find the mid elements
    static int search(int[]nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans=mid;
                if(findStartIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

