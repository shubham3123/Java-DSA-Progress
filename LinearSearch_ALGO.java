public class LinearSearch_ALGO {
    public static int search(int[] arr, int target){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == target){
                return i; // Element Found ? True, return index
            }
        }

        return -1; // Element not found !

    }

    public static void main(String[] args) {
        int [] numbers = {101, 202, 303, 404, 505};
        int target = 202;
        System.out.println("Target Index:- " + search(numbers, target)); 
    }



}
