public class Calculator {

    public static void main(String[] args) {
        float[] numArray = {2,5,8,5,10};
        String[] operArray = {"+","*","/","-"};
        float results = Calculate(numArray, operArray);
        System.out.println(results);
    }
    public static float Calculate(float[] numbers,String[] operands){
        float[] result = new float[operands.length];
        float[] multResult = new float[operands.length];
        String[] multOper = new String[operands.length-1];
        float[] divResult = new float[operands.length-1];
        String[] divOper = new String[multOper.length-1];
        float[] addResult=new float[multOper.length-1];
        String[] addOper = new String[divOper.length-1];
        int instances=0;

            for (int i = 0; i < operands.length; i++) {
                if (operands[i].equals("*")) {
                    instances++;
                    multResult[i] = numbers[i] * numbers[i + 1];
                    if (i!=operands.length-1){multOper[i] = operands[i + 1];}
                } else {
                    multResult[i] = numbers[i+instances];
                    if (i!=operands.length-1){multOper[i]=operands[i+instances];}
                }
            }
            instances=0;
            for (int i = 0; i < multOper.length;i++){
                if (multOper[i].equals("/")){
                    instances++;
                    divResult[i]=multResult[i]/multResult[i+1];
                    if (i!=multOper.length-1){divOper[i]=multOper[i+instances];}
                } else {
                    divResult[i]=multResult[i+instances];
                    if (i!=multOper.length-1){divOper[i]=multOper[i+instances];}
                }
            }
            instances=0;
            for (int i=0; i<divOper.length;i++){
                if (divOper[i].equals("+")){
                    instances++;
                    addResult[i]=divResult[i]+divResult[i+1];
                    if (i!=divOper.length-1){addOper[i]=divOper[i+instances];}
                } else{
                    addResult[i]=divResult[i+instances];
                    if (i!=divOper.length-1){addOper[i]=divOper[i+instances];}
                }
            }
        return(addResult[1]-addResult[0]);
    }
}
