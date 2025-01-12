public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // This line will throw the exception
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
            e.printStackTrace();
        }
        //Better Solution
        int index = 2;
        if(index >= 0 && index < arr.length){
            arr[index] = 10;
            System.out.println(arr[index]);
        } else {
            System.err.println("Error: Array index out of bounds.");
        }
    }
}