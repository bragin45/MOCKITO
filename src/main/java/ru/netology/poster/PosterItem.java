package ru.netology.poster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PosterItem {
    private int id;
    private String name;
    private String genre;
    private int year;
    private String description;
}
