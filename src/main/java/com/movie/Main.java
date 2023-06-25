package com.movie;

import com.movie.BO.*;

import java.util.Date;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Genre scienceFiction = new Genre();
        scienceFiction.setNom("sf");
        scienceFiction.setId(1);

        System.out.println(scienceFiction.getNom());
        int id = 2;
        String nomR = "Tony";
        String prenom ="Stark";
        Realisateur johnCarpenter = new Realisateur(id,nomR,prenom);

        Date date= new Date(1674562515000L);

        Film johnDoe = new Film(1,"JohnDoe", date,johnCarpenter,scienceFiction);

        System.out.println(johnDoe);

    }
}

