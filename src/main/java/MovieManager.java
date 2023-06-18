
public class MovieManager {
    public String[] movies;
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }


    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i];
            newMovies[newMovies.length - 1] = movie;
        }
        movies = newMovies;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        //последние фильмы
        String lastMovies[] = new String[limit];
        for (int i = 0; i < limit; i++) {
            lastMovies[i] = movies[movies.length - 1 - i];
        }
        //теперь нужно это перевернуть
        for (int i = 0; i < lastMovies.length / 2; i++) {
            String temp = lastMovies[i];
            lastMovies[i] = lastMovies[lastMovies.length - 1 - i];
            lastMovies[lastMovies.length - 1 - i] = temp;
        }
        return lastMovies;
    }
}



