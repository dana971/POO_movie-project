package com.movie.BO;

import java.util.Date;

public class Film {
    private int id;
    private String nom;
    private Date dateDeCreation;
    private String resume;

    private Genre genre;

    private Realisateur realisateur;

    private int duree;

    private String image;

    public Film(){}

    public Film( int id, String nom, Date dateDeCreation, String resume, Realisateur realisateur, int duree, String image, Genre genre){
        this.id =id;
        this.nom= nom;
        this.dateDeCreation=dateDeCreation;
        this.resume=resume;
        this.realisateur=realisateur;
        this.duree=duree;
        this.image=image;
        this.genre=genre;

    }

    public Film(int id,String nom, Date dateDeCreation, Realisateur realisateur, Genre genre){
        this.id=id;
        this.nom=nom;
        this.dateDeCreation=dateDeCreation;
        this.realisateur=realisateur;
        this.duree=60;
        this.resume="aucun";
        this.genre=genre;


    }

    public int getId() {
        return id;
    }

    public void setId( int id){

        this.id=id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom( String nom){

        this.nom=nom;
    }

    public Date getDateDeCreation(){
       return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation){
        this.dateDeCreation=dateDeCreation;
    }

    public Realisateur getRealisateur(){
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur){
        this.realisateur=realisateur;
    }

    public int getDuree(){
        return duree;
    }

    public void setDuree(int duree){
        this.duree=duree;
    }

    public String getResume(){
        return resume;
    }

    public void setResume(String resume){
        this.resume=resume;
    }

    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre=genre;
    }

    public String toString(){

        return "{id:"+id+", " +
                "nom:"+nom+", " +
                "dateDeCreation:"+dateDeCreation+", " +
                "realisateur: "+realisateur+" , " +
                "duree: "+duree+"," +
                "resume:"+resume+"," +
                "genre: "+genre+"}";
    }

}
