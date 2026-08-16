public class CountEvenOdd {
    int[] arr = {20,40,60,80,120};
    int e = 0; // Counter for even numbers
    int o = 0; // Counter for odd numbers

    void function() {
        for (int i = 0; i < arr.length; i++) {
            // Check the actual array element instead of 'n'
            if (arr[i] % 2 == 0) { 
                e++; // Increment even counter
            } else {
                o++; // Increment odd counter
            }
        }
        System.out.println("Even numbers: " + e);
        System.out.println("Odd numbers: " + o);
    }

    public static void main(String args[]) {
        CountEvenOdd c = new CountEvenOdd();
        c.function();
    }
}
