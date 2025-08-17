class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int place=1;
        int ans=num;
        while(temp>0){
            int digit=temp%10;
            if(digit==6)
                ans=num+3*place;
            temp/=10;
            place*=10;
        }
        return ans;

        // String s=""+num;
        // s=s.replaceFirst("6","9");
        // return Integer.valueOf(s);
    }
}

// public class ExtractDigits {
//     public static void main(String[] args) {
//         int num = 98765;
//         String s = String.valueOf(num);

//         for (int i = 0; i < s.length(); i++) {
//             int digit = s.charAt(i) - '0'; // convert char to int
//             System.out.println(digit);
//         }
//     }
// }


// public class ExtractDigits {
//     public static void main(String[] args) {
//         int num = 98765;

//         // Find divisor = 10000 for 98765
//         int divisor = 1;
//         while (num / divisor >= 10) {
//             divisor *= 10;
//         }

//         // Extract digits from front to end
//         while (divisor > 0) {
//             int digit = num / divisor;   // get front digit
//             System.out.println(digit);

//             num = num % divisor;         // remove that digit
//             divisor /= 10;               // move to next digit
//         }
//     }
// }
