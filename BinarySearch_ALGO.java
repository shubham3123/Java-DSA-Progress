public class BinarySearch_ALGO {
    public static int search(int [] arr, int target) {
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high - low) / 2; // potential integer overflow
            
            if (arr[mid] == target ) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1; // target is in the right half
            } else {
                high = mid - 1; // target is in the left half
            }
       
       
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int [] sortedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        System.out.println("Index of target is:- " + search(sortedNumbers, target));
    }







}
