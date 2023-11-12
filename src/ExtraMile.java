public class ExtraMile {
    public static void pairPrinter(Integer[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println( + arr[i] + " + " + arr[j] + " = "+target);
                }
            }
        }
    }
    public static void tripletPrinter(Integer[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i + 1;k<arr.length;k++){
                if (arr[i] + arr[j] + arr[k] == target) {
                    System.out.println( + arr[i] + " + " + arr[j] + " + "+arr[k]+" = "+target);
                }
                }
            }
        }
    }
}
