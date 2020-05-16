import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {
    static class Movie{
        String movieName;
        String hero;
        String heroine;

        public Movie(String movieName, String hero, String heroine) {
            this.movieName = movieName;
            this.hero = hero;
            this.heroine = heroine;
        }

        @Override
        public String toString() {
            return
                    "movieName='" + movieName + '\'' +
                    ", hero='" + hero + '\'' +
                    ", heroine='" + heroine + '\''
                    ;
        }
    }

    public static void main(String[] args){
        ArrayList<Movie> moviesList=new ArrayList<>();
        moviesList.add(new Movie("Baahubali","Prabhas","Anushka"));
        moviesList.add(new Movie("Baahubali","Prabhas","Anushka"));
        moviesList.add(new Movie("Baahubali","Prabhas","Anushka"));
        moviesList.add(new Movie("Baahubali","Prabhas","Anushka"));

        Consumer<Movie> c=m->System.out.println(m);
        for(Movie m:moviesList) c.accept(m);



    }
    }
