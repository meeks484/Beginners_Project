public class YearConverter {
    public static void main(String[] args) {
        int minutes = 3456789;
        convert(minutes);
    }
    public static void convert(int minutes){
        final int Minutes_In_Year=525600;
        final int Minutes_In_Day=1440;

        //Use divide to get years, and mod to extract the remainder minutes, and convert that into days.
        int years = minutes/Minutes_In_Year;
        int days = (minutes%Minutes_In_Year)/Minutes_In_Day;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}
