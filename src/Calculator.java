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

            // TODO: Change the if statements below to "else if".
            //  Why? Because if you don't, they will be run even if it is not necessary (think about it, will they ever be true
            // if the if statement above is true? Also, change the if format to look better.

            //Calculate the product or quotient, depending on the operand
            if (operands[i].equals("Mul")){productQuotientGroup *= numbers[i + 1];}
            if (operands[i].equals("Div")){productQuotientGroup = productQuotientGroup / numbers[i + 1];            }
        }

        //add the final "productQuotientGroup" into the result, and return the results.
        result += productQuotientGroup;
        return(result);
    }
}
