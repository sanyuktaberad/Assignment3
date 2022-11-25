public class evenPosition {
    public static void main(String[] args) {
        int [] arr =new int[] {9, 8, 7, 6, 5, 4, 3};
        for (int i = 2; i<arr.length; i = i+2){
            System.out.println("Position of array is "+ i);
            System.out.println("Value of array is "+ arr[i] );
        }
    }
}
