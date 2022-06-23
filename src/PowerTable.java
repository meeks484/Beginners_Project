import static java.lang.Math.pow;

public class PowerTable {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {2,3,4,5,6};
        powerTable(array1,array2);
    }
    public static void powerTable(int[] num1,int[] num2){
        for (int i=0;i<num1.length;i++){
            System.out.println(num1[i]+" "+num2[i]+" "+pow(num1[i],num2[i]));
        }
    }
}
