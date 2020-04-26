package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTestManagerIsEmpty {
    FilmManager manager = new FilmManager(0);
    FilmItem first = new FilmItem(1, "Бладшот", "боевик");
    FilmItem second = new FilmItem(2, "Вперёд", "мультфильм");
    FilmItem third = new FilmItem(3, "Отель Белград", "комедия");
    FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик");
    FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы");
    FilmItem sixth = new FilmItem(6, "Тролли", "мультфильм");
    FilmItem seventh = new FilmItem(7, "1+1", "драма");
    FilmItem eighth = new FilmItem(8, "Легенда", "триллер");
    FilmItem ninth = new FilmItem(9, "Волк с Уолл-Стрит", "драма");
    FilmItem tenth = new FilmItem(10, "Брат 2", "драма");
    FilmItem eleventh = new FilmItem(11, "Малифисента", "фэнтези");

    @BeforeEach
    void setup() {
        manager = new FilmManager(0);


    }

    @Test
    void shouldAdd() {
        manager.FilmAdd(first);
        FilmItem[] expected = new FilmItem[]{first};
        FilmItem[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldNotDisplayFilmsIfNoFilms() {
        FilmItem[] expected = new FilmItem[]{};
        FilmItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotDisplayFilmsIfFilms() {
        manager.FilmAdd(first);
        manager.FilmAdd(second);
        manager.FilmAdd(third);
        manager.FilmAdd(fourth);
        manager.FilmAdd(fifth);
        manager.FilmAdd(sixth);
        manager.FilmAdd(seventh);
        manager.FilmAdd(eighth);
        manager.FilmAdd(ninth);
        manager.FilmAdd(tenth);
        FilmItem[] expected = new FilmItem[]{};
        FilmItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }


}