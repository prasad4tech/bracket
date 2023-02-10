package com.josh.bracket.tournament;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tournament {
    @Id
    private String code;

//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

    private int year;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
