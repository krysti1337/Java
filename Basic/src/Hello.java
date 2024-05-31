public class Hello {

    public static void main(String[] args) {

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score !");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90 ) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This is domestic to our country");
        }

        int ageClient = 20;
        String ageText = ageClient >= 18 ? "OverEighteen" : "Still a kid";
        System.out.println("Our client is "  + ageText);

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);
    }

}
