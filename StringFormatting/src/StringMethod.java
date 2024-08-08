public class StringMethod {
    public static void main(String[] args) {

        String birthDate = "31/03/2002";
        int startingIndex =birthDate.indexOf("2002"); //index la 2002 in String
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); //extragem 2002 din string folosind index care am primit mai sus

        System.out.println("Month = " +  birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "2000");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("01");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2001");
        System.out.println("newDate = " + newDate); //putem scrie si asa si chiar va functiona ca si 'join', dar asta ar insemna ca de fiecare data se creaza un nou String

        newDate = "25" + "/" + "01" + "/" + "2002";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("02").concat("/").concat("2003"); //poate fi scris si asa pentru ca oricum scoate string intr-un final, dar din nou de fiecare data cand se cheama '.concat' se creaza un nou String
        System.out.println("newDate = " +newDate);

        System.out.println(newDate.replace('/','-')); //inlocuieste un caracter cu alt caracter 25-02-2003

        System.out.println(newDate.replace("2","00")); //005/000/00003

        System.out.println(newDate.replaceFirst("/","-")); //25-02/2003
        System.out.println(newDate.replaceAll("/","--")); //25--02--2003

        System.out.println("ABC \n".repeat(3));/*ABC
                                                      ABC
                                                      ABC */
        System.out.println("-".repeat(20)); //--------------------

        System.out.println("ABC \n".repeat(3).indent(8)); //indent pune spatiu
        System.out.println("-".repeat(20)); //--------------------

        System.out.println("ABC \n".repeat(3).indent(-2)); //poti scoate spatiu
        System.out.println("-".repeat(20)); //--------------------
    }
}
