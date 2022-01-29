package Day4_121221;

public class Loop_Array_Conditions {

    public static void main(String[] args) {

       //create a dynamic array for 4 different cities, iterate through the value but only print when city is
//either brooklyn or queens
      String[] cities = new String[4];
      cities[0] = "Queens";
        cities[1] = "Manhattan";
        cities[2] = "Bronx";
        cities[3] = "Brooklyn";

        int i = 0;
        while(i <cities.length){
            //two if conditions
            //when you are not sure if the value is in upper case , lower case or mixed case
            if(cities[i].toLowerCase().equals("brooklyn")){
                System.out.println("City is " + cities[i]);
            }else if(cities[i].toUpperCase().equals("QUEENS")) {
                System.out.println("City is " + cities[i]);
            }//end of conditions

            i++;

            int i1 = 0;
            while(i1 <cities.length){
                //two if conditions
                if(cities[i1] == "brooklyn"){
                    System.out.println("City is " + cities[i1]);
                }else if(cities[i1] == "QUEENS") {
                    System.out.println("City is " + cities[i1]);
                }//end of conditions

                i1++;
            }//end of while loop

        }//end of while loop



    }//end of main method
}//end of java class