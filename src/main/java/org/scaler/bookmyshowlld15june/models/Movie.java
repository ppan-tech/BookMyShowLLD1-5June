package org.scaler.bookmyshowlld15june.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel{
    private String title;
    private String director;
    private String year;
    private String genre;
    private List<String> actors;
    private List<Language> languages;
    private Date releastDate;
    private double length;
}
