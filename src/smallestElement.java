public class smallestElement {
    public static void main(String[] args) {
        int [] a ={1, 4, 6, 9};
        int smallestElement = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i]< smallestElement){
                smallestElement=a[i];
            }
            System.out.println("Smallest element of an array is "+ a[i]);
        }
    }
}
