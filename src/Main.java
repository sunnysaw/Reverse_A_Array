import java.util.Scanner;
public class Main {
    public static int[] reverseArray(int[] nums) {
        // Your code goes here
        java.util.Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] < nums[j + 1]){
                    int swap = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int num = input.nextInt();
        System.out.println("Enter the element inside array ");
        int[] nums = new int[num];
        for(int i = 0; i < nums.length ; i++){
            nums[i] = input.nextInt();
        }
        int[] arr = reverseArray(nums);
        for(int i = 0; i < nums.length ; i++){
            System.out.print( " " + arr[i]);
        }
    }
}