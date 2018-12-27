import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of places:");
        int m = sc.nextInt();
        String[] array = new String[m];

        System.out.println("Please enter the places");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < m; i++){

            array[i] = s1.nextLine();


        }
//        for (int i = 0; i < m; i++){
//
//            System.out.println(array[i]);
//
//
//        }


        for (int i = 0; i < m; i++) {
            String string = array[i];
            //System.out.println("Input String : " + string);
            string = string.replaceAll("[AaEeIiOoUu]", "");
            System.out.print("Place Name without Vowels:");
            System.out.println(string);
        }




    }

}
