package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {

    @Test
    public void shouldAddMovieAndFindAll() {
        PosterManager manager = new PosterManager();

        manager.addMovie("1 The Green Mile");
        manager.addMovie("2 Forrest Gump");
        manager.addMovie("3 Fight Club");

        String[] expected = {"1 The Green Mile", "2 Forrest Gump", "3 Fight Club"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindLastFive() {
        PosterManager manager = new PosterManager(5);
        manager.addMovie("1 The Green Mile");
        manager.addMovie("2 Forrest Gump");
        manager.addMovie("3 Fight Club");
        manager.addMovie("4 Titanic");
        manager.addMovie("5 Snatch");
        manager.addMovie("6 Home Alone");

        String[] expected = {"6 Home Alone", "5 Snatch", "4 Titanic", "3 Fight Club", "2 Forrest Gump"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFiveIfContainedThree() {
        PosterManager manager = new PosterManager(5);
        manager.addMovie("1 The Green Mile");
        manager.addMovie("2 Forrest Gump");
        manager.addMovie("3 Fight Club");


        String[] expected = {"3 Fight Club", "2 Forrest Gump", "1 The Green Mile"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastTen() {
        PosterManager manager = new PosterManager();
        manager.addMovie("1 The Green Mile");
        manager.addMovie("2 Forrest Gump");
        manager.addMovie("3 Fight Club");
        manager.addMovie("4 Titanic");
        manager.addMovie("5 Snatch");
        manager.addMovie("6 Home Alone");
        manager.addMovie("7 Leon");
        manager.addMovie("8 The Godfather");
        manager.addMovie("9 The Pianist");
        manager.addMovie("10 Scent of a Woman");
        manager.addMovie("11 The Matrix");
        manager.addMovie("12 Braveheart");

        String[] expected = {"12 Braveheart", "11 The Matrix", "10 Scent of a Woman", "9 The Pianist", "8 The Godfather", "7 Leon", "6 Home Alone", "5 Snatch", "4 Titanic", "3 Fight Club"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }
}

