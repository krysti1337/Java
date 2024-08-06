public class Animal {

    private String type;
    private String size;
    private double wight;

    public Animal(){

    }

    public Animal(String type, String size, double wight) {
        this.type = type;
        this.size = size;
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", wight=" + wight +
                '}';
    }

    public void move(String speed){
        System.out.println(type +  "move " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " Make some kind of noise ");
    }
}
