package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulDaysAtTheMoviesTest {
    @Test
    void beautifulDays() {
        assertEquals(2, BeautifulDaysAtTheMovies.beautifulDays(20, 23, 6));
        assertEquals(33, BeautifulDaysAtTheMovies.beautifulDays(13, 45, 3));
        assertEquals(33, BeautifulDaysAtTheMovies.beautifulDays(1, 100, 1));
        assertEquals(21841, BeautifulDaysAtTheMovies.beautifulDays(123, 456789, 189));
    }

    @Test
    void reverse() {
        assertEquals(21, BeautifulDaysAtTheMovies.reverse(12));
        assertEquals(321, BeautifulDaysAtTheMovies.reverse(123));
        assertEquals(1, BeautifulDaysAtTheMovies.reverse(1000));
        assertEquals(987654321, BeautifulDaysAtTheMovies.reverse(123456789));
    }
}