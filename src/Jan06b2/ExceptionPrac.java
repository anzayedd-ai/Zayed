package Jan06b2;

public class ExceptionPrac {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception occurred");
        }

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }

        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception occurred");
        }
    }
}
