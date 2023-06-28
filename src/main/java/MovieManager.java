
public class MovieManager {
    public String[] movies;
    private final int limit;

    public MovieManager() {
        this.limit = 10;
        this.movies = new String[0];
    }

    public MovieManager(int limit) {
        this.limit = limit;
        this.movies = new String[0];
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

        // нужен массив самый меньший limit или длинна массива фильмов
        // Так как встречалась ошибка несоответствия длинны массива
        // Либо отрицательная длинна массива
        String[] lastMovies = new String[Math.min(limit, movies.length)];
        int newIndex = 0;


        for (int i = movies.length - 1; i >= 0 && newIndex < limit; i--){
            if (movies[i] != null) {
                lastMovies[newIndex] = movies[i];
                newIndex++;
            }
        }

        return lastMovies;
    }
}



