package com.movie.BO;

public class Realisateur {
    private int id;
    private String nom;
    private String prenom;

    public Realisateur(){

        id = 1;
        nom = "john";
    }

    public Realisateur( int id, String nom, String prenom){

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public String toString(){

        return "{id :"+id+" , nom :"+nom+", prenom : "+prenom+" }";
    }

}
