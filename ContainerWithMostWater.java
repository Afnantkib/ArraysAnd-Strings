//  https://leetcode.com/problems/container-with-most-water/
//  leetcode 11
public class ContainerWithMostWater {
   
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j){
        int a=height[i];
        int b=height[j];
        int w=j-i;
        ans=Math.max(ans,w*Math.min(a,b));
        if(a<b){
            i++;
        }else if(a>b){
            j--;
        }else{
            i++;
            j--;
        }
        
        }
        
        return ans;
    }
}
