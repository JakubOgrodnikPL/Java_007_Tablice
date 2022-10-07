import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String[] myArray = new String[4];
        myArray[0] = "Zbyszek";
        myArray[1] = "Karol";
        myArray[2] = "Bartek";
        myArray[3] = "Stefan";

        String[] myArray2 = new String[]{"Zbyszek", "Roman", "Karol"};

        System.out.println(myArray[1]);
        System.out.println(myArray[3]);
        System.out.println(myArray2[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("array [" + i + "]" + myArray[i]);
        }
        for(String element : myArray2){
            System.out.println("Next element: " + element);
        }

        System.out.println(Arrays.toString(myArray));
    }
}