package secondday;

public class ArrayDemo {
    public static void main(String[] args) {
        int size=10;
        double[] myList=new double[size];
        myList[0]=3.4;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        double ta=0;
        for (int i = 0; i <size; i++) {
            ta+=myList[i];
        }
        System.out.println(ta);
    }

}
