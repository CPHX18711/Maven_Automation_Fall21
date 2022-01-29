package ActionItems;

public class AI_2arry_loop_Conidtional {

    public static void main(String[] args) {

        //create a dynamic array for 4 different cities, iterate through the value but only print when city is
//either Brooklyn or manhattan
        String[] cities = new String[4];
        cities[0] = "queens";
        cities[1] = "manhattan";
        cities[2] = "bronx";
        cities[3] = "Brooklyn";

        int i = 0;
        while(i <cities.length) {
            //two if conditions
            if (cities[i].toLowerCase().equals("manhattan")) {
                System.out.println("City is " + cities[i]);
            } else if (cities[i].toUpperCase().equals("Brooklyn")) {
                System.out.println("City is " + cities[i]);
            }//end of conditions

            i++;

        }//end of while loop







    }//end of main



}//end of class
