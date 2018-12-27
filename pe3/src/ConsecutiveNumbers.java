import java.util.Scanner;

public class ConsecutiveNumbers {

        public static void main(String[] args){

            System.out.println("Please enter the series:");
            Scanner s1 = new Scanner(System.in);
            String series = s1.nextLine();

            String[] numberSeries = series.split(",");

            int[] numberInt = new int[numberSeries.length];
            for (int i=0; i<numberSeries.length; i++) {
                numberInt[i] = Integer.parseInt(numberSeries[i].trim());
            }

            int flag=0;

            if(numberInt[0]<numberInt[1]) {
                for (int i = 0; i < numberSeries.length - 1; i++) {

                    if (numberInt[i + 1] - numberInt[i] != 1) {
                        flag = 1;
                    }

                }
            }
            else {
                for (int i = 0; i < numberSeries.length - 1; i++) {

                    if (numberInt[i + 1] - numberInt[i] != -1) {
                        flag = 1;
                    }

                }
            }


            if(flag==0)
                { System.out.println(series + " are consecutive numbers\n");
                }
            else
                { System.out.println(series + " non consecutive numbers\n");
                }

        }

}
