public class subArraySum {
    void subArraySum(int arr[], int n, int sum){

        for (int i = 0; i< n; i++){
            int currentSum = arr[i];

            if (currentSum==sum){
                System.out.println("sum found at index"+i);
                return;
            }
            else {
                for (int j=i+1; j<n; j++){
                    currentSum+=arr[j];

                    if (currentSum==sum){
                        System.out.println("Sum found index bwt "+i + "and "+j);
                        return;
                    }
                }
            }

        }
        System.out.println("no subarray found");
        return;
    }
    public static void main(String[] args){
        subArraySum arraysum = new subArraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}
