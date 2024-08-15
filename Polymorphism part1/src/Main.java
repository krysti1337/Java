import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars ");
//        theMovie.watchMovie();
//
//        Movie adventureMovie = new Adventure("Jumanji ");
//        adventureMovie.watchMovie();
//
//        Movie comedyMovie = new Comedy("Truman Show ");
//        comedyMovie.watchMovie();
//
//        Movie scienceMovie = new ScienceFiction("Interstellar ");
//        scienceMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q for quit");
            String type = s.nextLine();

            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}