public class Dog extends Animal {

    //super() trebuie să fie primul apel dintr-un constructor, dacă este folosit.
    //Acest apel asigură că partea din obiect corespunzătoare clasei Animal
    //este inițializată înainte de a executa orice alt cod din constructorul clasei Dog.
    //Dacă clasa Animal nu are un constructor fără argumente, compilatorul va genera o eroare
    //dacă nu apelăm explicit un alt constructor din clasa părinte cu parametri potriviți.
//            +--------------------+
//            |       Animal       |
//            +--------------------+
//            | - someProperty     |
//            | + someMethod()     |
//            +--------------------+
//            ▲
//            |
//            +--------------------+
//            |        Dog         |
//            +--------------------+
//            |                    |
//            | + Dog()            |
//            +--------------------+
    public Dog(){
        super("Mutt", "Big", 40);
    }

}
