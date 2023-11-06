package com.quiz.MusicQuiz.musicQuiz.data.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private int count;

    private String team;


    public User(Integer id, String name, Integer count, String team) {
        super();
        this.id = id;
        this.name = name;
        this.count = count;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }



}
