public class sample {
    public static void main(String[] args) {
        int []nums={2,0,4,7,3,4,5,6};
        int target=7;
        int ans=linearSearch(nums, target);

                System.out.println(ans);


            }

            static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;



    }
}
