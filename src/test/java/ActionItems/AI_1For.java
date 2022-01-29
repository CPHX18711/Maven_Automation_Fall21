package ActionItems;

public class AI_1For {

    public static void main(String[] args) {


        //create a String dynamic array for zipcode
        String[] zipcode = new String[4];
        zipcode[0] = "11221";
        zipcode[1] = "11212";
        zipcode[2] = "10007";
        zipcode[3] = "10008";



        //integer dynamic array
        int[] streetNumber = new int[4];
        streetNumber[0] = 355;
        streetNumber[1] = 326;
        streetNumber[2] = 593;
        streetNumber[3] = 963;


        for (int i = 0; i < zipcode.length; i++) {
            //print statement
            System.out.println("My zipcode is " + zipcode[i] + " and my street number " + streetNumber[i]);
        }//end of for loop





    }//end of main method
}//end of java class

