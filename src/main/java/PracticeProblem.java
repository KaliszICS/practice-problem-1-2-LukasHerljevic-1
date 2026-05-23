public class PracticeProblem {

    
    public static boolean validIndex(int[] arr, int index) {
        try {
            
            int value = arr[index];
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            
            return false;
        }
    }

    
    public static int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            
            return 0;
        }
    }

    
    public static int safeConvertStringtoInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            
            return 0;
        }
    }
}