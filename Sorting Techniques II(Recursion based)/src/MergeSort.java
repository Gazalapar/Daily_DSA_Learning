public class MergeSort {
   public static void main(String[] args){
       int[] nums={5,10,3,3,1,0,13};
       mergeSort(nums,0,nums.length-1);
       for(int i:nums){
           System.out.print(i+" ");
       }

   }
    public static void mergeSort(int[] nums,int low, int high){
        if(low>=high)return;
        int m=low+(high-low)/2;
        mergeSort(nums,low,m);
        mergeSort(nums,m+1,high);
        merge(nums,low,m,high);

    }
    public static void merge(int [] nums,int l,int m,int h){
        int [] res=new int[h-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=h){
            if(nums[i]<=nums[j]){
                res[k++]=nums[i++];
            }
            else{
                res[k++]=nums[j++];
            }
        }
        while(i<=m){
            res[k++]=nums[i++];
        }
        while(j<=h){
            res[k++]=nums[j++];
        }
        for(int n=0;n<res.length;n++){
            nums[n+l]=res[n];

        }

    }

}
