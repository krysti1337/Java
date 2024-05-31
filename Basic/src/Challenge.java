public class Challenge {
    public static void main(String[] args){

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        firstDouble = (firstDouble + secondDouble) * 100.00d;

        boolean bVariable = false;

        System.out.println(firstDouble);

        if ( firstDouble % 40.00d == 0) {
            bVariable = true;
            System.out.println("boolean variable =" + bVariable);
        }

        if (bVariable != true) {
            System.out.println("got some remainder");
        }

        //or
        System.out.println("");
        double theRemainder = firstDouble % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }

    }

