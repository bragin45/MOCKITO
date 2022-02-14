package ru.netology.poster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    PosterItem first = new PosterItem(1, "Name1", "Genre1", 1999, "Desc1");
    PosterItem second = new PosterItem(1, "Name2", "Genre2", 1998, "Desc2");
    PosterItem third = new PosterItem(1, "Name3", "Genre3", 1997, "Desc3");
    PosterItem fourth = new PosterItem(1, "Name4", "Genre4", 1996, "Desc4");
    PosterItem fifth = new PosterItem(1, "Name5", "Genre5", 1995, "Desc5");
    PosterItem sixth = new PosterItem(1, "Name6", "Genre6", 1994, "Desc6");
    PosterItem seventh = new PosterItem(1, "Name7", "Genre7", 1993, "Desc7");
    PosterItem eighth = new PosterItem(1, "Name8", "Genre8", 1992, "Desc8");
    PosterItem ninth = new PosterItem(1, "Name9", "Genre9", 1991, "Desc9");
    PosterItem tenth = new PosterItem(1, "Name10", "Genre10", 1990, "Desc10");

    @Test
    void shouldAddNewPoster() {
        PosterManager post = new PosterManager();
        post.addPoster(first);
        post.addPoster(second);
        post.addPoster(third);
        post.addPoster(fourth);
        post.addPoster(fifth);
        PosterItem[] actual = post.findAll();
        PosterItem[] expected = new PosterItem[]{first, second, third, fourth, fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllPoster() {
        PosterManager post = new PosterManager();
        post.addPoster(first);
        post.addPoster(second);
        post.addPoster(third);
        post.addPoster(fourth);
        post.addPoster(fifth);
        PosterItem[] actual = post.findAll();
        PosterItem[] expected = new PosterItem[]{first, second, third, fourth, fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowReversePoster() {
        PosterManager post = new PosterManager();
        post.addPoster(first);
        post.addPoster(second);
        post.addPoster(third);
        post.addPoster(fourth);
        post.addPoster(fifth);
        PosterItem[] actual = post.findLast();
        PosterItem[] expected = new PosterItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }

}