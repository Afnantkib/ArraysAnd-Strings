//  https://leetcode.com/problems/next-greater-element-iii/
//  leetcode 556

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        
        char []arr=(n+"").toCharArray();
        
        int i=arr.length-1;
        while(i>0){
        if(arr[i-1]>=arr[i]){
            i--;
        }else{
            break;
        }
            
        }
        
        if(i==0){
            return -1;
        }
        int idx=i-1;
        int j=arr.length-1;
        while(j>idx){
            if(arr[j]<=arr[idx]){
                j--;
            }else{
                break;
            }
        }
        
        char temp=arr[idx];
        arr[idx]=arr[j];
        arr[j]=temp;
        //reverse from i to end;
        j=arr.length-1;
        while(i<j){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
            
        }
        
        String res=new String(arr);
        
        long lval=Long.parseLong(res);
        
        return (lval>Integer.MAX_VALUE?-1:(int)lval);
        
}
}
