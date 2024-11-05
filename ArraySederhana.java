public class ArraySederhana {
    public static void main(String[] args) {
        int[] nums = new int[30];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Elemen ke-" + (i+1) + ": " + nums[i]);
        }
    }
}