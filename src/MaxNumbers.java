public class MaxNumbers {
    public static void main(String[] args) {
        int[] array = {3,5,2,5,5,5,0};
        maxNumber(array);
    }

    public static void maxNumber(int arrayIn[]){
        int max=0;
        int instances = 0;

        //Loop through all numbers to find the largest number. Record how many times it has been found.
        for (int i=0; i<arrayIn.length; i++){
            //Check if the number matches the current maximum number.
            if (arrayIn[i]==max){
                instances++;
                //Check if the number is greater than the current maximum number, reset the instances.
            }else if (arrayIn[i]>max){
                max=arrayIn[i];
                instances=1;
            }
        }
        System.out.println("The Largest number is "+max);
        System.out.println("The occurrence count of hte largest number is "+instances);
    }
}
