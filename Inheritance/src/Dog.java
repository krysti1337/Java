public class Dog extends Animal {

    private String earShape;
    private String tailShape;

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

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
