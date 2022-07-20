//  https://leetcode.com/problems/majority-element/
//  leetcode 169
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int m=nums[0];
        int delta=1;
        for(int i=1;i<nums.length;i++){
            if(m==nums[i]){
                delta++;
            }else{
                delta--;
            }
            if(delta==0){
                m=nums[i];
                delta=1;
            }
        }
        return m;
    }
}
