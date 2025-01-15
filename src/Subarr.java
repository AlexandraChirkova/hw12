public class Subarr {
    public static void main(String[] args) {
        Subarr subarr = new Subarr();

        int[] arr1 = {1, 4, 2, 5, 3};
        System.out.println(subarr.sumOddLengthSubarrays(arr1));

        int[] arr2 = {1, 2};
        System.out.println(subarr.sumOddLengthSubarrays(arr2));

        int[] arr3 = {10, 11, 12};
        System.out.println(subarr.sumOddLengthSubarrays(arr3));

    }

    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int length = 1; length <= n; length += 2) {

            for (int start = 0; start <= n - length; start++) {
                int subarraySum = 0;
                for (int i = start; i < start + length; i++) {
                    subarraySum += arr[i];
                }
                totalSum += subarraySum;
            }
        }
        return totalSum;
    }
}
