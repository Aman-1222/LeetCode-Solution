class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int ans[]=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}
    
        
        
        //         // StringBuilder str = new StringBuilder();
//         // int carry=0;
//         // if(digits[digits.length-1]+1>9){
//         //     carry=1;
//         //     str.append(0);
//         // }
//         // else str.append(digits[digits.length-1]+1);
//         // for(int i=digits.length-2;i>=0;i--){
//         //     if(digits[i]==9 && carry==1){
//         //         carry=1;
//         //         str.append(0);
//         //     }
//         //     else{
//         //         str.append(digits[i]+carry);
//         //         carry=0;
//         //     }
//         // }
//         // if(carry==1) str.append(1);
//         // int[] ans=new int[str.length()];
//         // for(int i=0;i<ans.length;i++)
//         //     ans[i]=str.charAt(str.length()-1-i)-'0';
//         // return ans;
//     }
// }