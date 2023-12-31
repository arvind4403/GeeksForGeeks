class HappyNumber{

    static int numSquareSum(int n){
        int squareSum=0;
        while (n!=0){
            squareSum +=(n%10)*(n%10);
            n/=10;
        }
        return squareSum;
    }

    static boolean isHappynumber(int n){
        int slow , fast;
        slow =fast=n;
        do{
            slow=numSquareSum(slow);
            fast=numSquareSum(numSquareSum(fast));
        }
        while (slow!=fast);
        return (slow==1);

    }
    public static void main(String[] args){
        int n=15;
        if (isHappynumber(n))
            System.out.println(n +"is a happy number");
        else
            System.out.println(n + "is not a happy number");
    }
}