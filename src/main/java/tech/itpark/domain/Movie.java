package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Movie {
    private String name;
    private String date;
    private float rating;
    private String image;
    private boolean ticketsAvailability;
}
