import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMovieManager {
    public String[] myMovies = {"Терминатор",
            "Форсаж",
            "Унесённые ветром",
            "Побег из шоушенка",
            "Ёлки",
            "Кавказкая пленница",
            "Матрица",
            "Пролетая над гнездом кукушки",
            "Цельнометалическая Оболочка",
            "Звонок"};
    @ParameterizedTest
    @CsvSource({"Мой сосед Тоторо"})
    public void shouldAddMovieAndFindAll(String movie){
        MovieManager manager = new MovieManager();
        manager.movies = myMovies;
        manager.addMovie(movie);
        String[] exp = {"Терминатор",
                "Форсаж",
                "Унесённые ветром",
                "Побег из шоушенка",
                "Ёлки",
                "Кавказкая пленница",
                "Матрица",
                "Пролетая над гнездом кукушки",
                "Цельнометалическая Оболочка",
                "Звонок",
                "Мой сосед Тоторо"
        };
        String[] act = manager.findAll();
        Assertions.assertArrayEquals(exp, act);
    }
    @Test
    public void shouldShowLastMoviesWithLimit(){
        MovieManager manager = new MovieManager(5);
        manager.movies = myMovies;
        String[] exp = {"Звонок",
                "Цельнометалическая Оболочка",
                "Пролетая над гнездом кукушки",
                "Матрица",
                "Кавказкая пленница"
        };
        String[] act = manager.findLast();
    }

}