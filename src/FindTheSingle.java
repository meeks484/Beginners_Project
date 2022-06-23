import java.util.Arrays;

public class FindTheSingle {
    public static void main(String[] args) {
        int[] array ={4,1,2,1,2,4,5};
        System.out.println("Inputs: nums ="+ Arrays.toString(array));
        System.out.println("Output: "+getSingle(array));
    }

    public static int getSingle(int[] nums){
        int result=nums[0];
        //Use XOR to find the single number
        for (int i=1;i<nums.length;i++){
            result=result^nums[i];
        }
        return(result);
    }
}
