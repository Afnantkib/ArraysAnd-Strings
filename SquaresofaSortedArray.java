//  https://leetcode.com/problems/squares-of-a-sorted-array/
//  leetcode 977
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        //fill new array
        int[]res=new int[nums.length];
        int r=res.length-1;
        int i=0,j=nums.length-1;
        //apply two pointer
        //possibility of larger square holds true at the extreme ends
        //in case the array contains negative as well
        while(r>=0){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[r]=nums[i]*nums[i];
                r--;
                i++;
            }else{
                res[r]=nums[j]*nums[j];
                r--;
                j--;

            }
            
            
        }
        return res;
}
}
