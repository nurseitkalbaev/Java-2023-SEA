package module303;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String fullName = "Kalbaev Nurseit Mamanazirovich";
        String[][] twoDimensionalFullName = {{}};
        twoDimensionalFullName = parseTwoDimensionalString(fullName);

        for(int i= 0; i < twoDimensionalFullName.length; i++){

            for(int j = 0;j < twoDimensionalFullName[i].length; j++){
                if(twoDimensionalFullName[i][j] == null){
                    continue;
                }
                System.out.print(" "+twoDimensionalFullName[i][j]);
            }

            System.out.println(" ");
        }
    }
    public static String[][] parseTwoDimensionalString(String str){
        String[][] result = new String[3][20];
        String[] name = str.split(" ");
        for(int i = 0; i < name.length; i ++ ){
            for(int j = 0; j < name[i].length();j++){
                result[i][j] = String.valueOf(name[i].charAt(j));
            }
        }


        return result;
    }

}
