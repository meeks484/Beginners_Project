public class Calculator {

    public static void main(String[] args) {
        float[] numberArray = {2,5,8,5,2,15,-7};
        String[] operandArray = {"Add","Mul","Div","Sub","Sub","Mul"};
        float results = calculate(numberArray, operandArray);
        System.out.println(results);
    }
    public static float calculate(float[] numbers,String[] operands){

        float productQuotientGroup = numbers[0]; //Represents the product or quotient of a group of numbers
        float result = 0;

        //Loop through each number, add, subtract, multiply or divide based on the operand
        for (int i = 0; i< numbers.length; i++) {

            // Check if end of array
            if (i == operands.length){break;}

            //If the operand is "Add" or "Sub", then add the productQuotientGroup into "result", and then
            //  re-initialize the productQuotientGroup variable based on the operand
            if (operands[i].equals("Add") || operands[i].equals("Sub")) {
                result += productQuotientGroup;
                productQuotientGroup=operands[i].equals("Add") ? numbers[i+1] : -numbers[i+1];


            }
            //Calculate the product or quotient, depending on the operand
            else if(operands[i].equals("Mul")){productQuotientGroup *= numbers[i + 1];}
            else if(operands[i].equals("Div")){productQuotientGroup = productQuotientGroup / numbers[i + 1];}

        }

        //add the final "productQuotientGroup" into the result, and return the results.
        result += productQuotientGroup;
        return(result);
    }
}
