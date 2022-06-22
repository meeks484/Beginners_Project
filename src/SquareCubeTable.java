public class SquareCubeTable {
    public static void main(String[] args) {
        buildTable();
    }

    public static void buildTable(){
        int[][] table = new int[11][3];
        for (int i = 0; i < table.length; i++){
            table[i][0]=i;
            table[i][1]=i*i;
            table[i][2]=i*i*i;
            System.out.println(table[i][0]+" "+table[i][1]+" "+table[i][2]);
        }

    }
}
