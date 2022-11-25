public class LargestElement {
    public static void main(String[] args) {
        int [] f = {1, 8, 9, 5, 7, 10};
        int max = f[0];
        for (int i = 0; i>f.length; i++){
            if(f[i] > max );{
                max = f[i];
            }
            System.out.println("largest element of the given array is "+ max );
        }
    }
}
