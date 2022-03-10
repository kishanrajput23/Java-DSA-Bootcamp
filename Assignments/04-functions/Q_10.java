class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int rev=0, sum=0, X=N;
        
        while (X>0) {
            sum += X%10;
            X /= 10;
        }
        
        X = sum;
        while (X>0) {
            rev = rev*10 + X%10;
            X /= 10;
        }
        
        if (rev==sum) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
