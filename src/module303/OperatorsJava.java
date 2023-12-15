package module303;

public class OperatorsJava {
    public static void main(String[] args) {
        double a = 100, b= 10.1;
        double v ;

        v = a + b;

        v = a- b;

        v = a*b;

        v = a%b;

        System.out.println(v);

        int c = 3, d = 4;
        boolean r;

        //instanceof

        Animal myAnimal = new Animal();
        System.out.println(myAnimal instanceof Object);

        r = ((a < b) && (c > d) ) && (a < b) || (c < d);

//        int x = 2;
//        int y = 3;
//        int result = x++;
//        System.out.println("y : "+y +" result : " +  result +" x : "+ x);
//


    }



}
