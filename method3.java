  class method3 {
    static int arr[] = {10, 30, 49, 56, 83, 87};

    public static int largest() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int largest = largest();
        System.out.println("largest in given array is : " + largest);
    }
}
