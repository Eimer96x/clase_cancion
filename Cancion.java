package com.example;

public class Cancion {

    private String titulo;
    private String artista;
    private int duracion;
    private String genero;
    private String album;

    public static int SEGUNDOS_POR_MINUTO=60;

    public Cancion() {
        titulo = "desconocido";
        artista = "desconocido";
        duracion = 0;
        genero = "desconocido";
        album = "desconocido";
    }

    public Cancion(String titulo, String artista, int duracion, String genero, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private void calcularDuracionMinutos() {

       int calcularDuracionMinutos = duracion / SEGUNDOS_POR_MINUTO;
    }


    public void mostrarInformacion(){
        System.out.println(this.titulo);
        System.out.println(this.album);
        System.out.println(this.artista);
        System.out.println(this.duracion);
        System.out.println(this.genero);
    }


    public void mostrarInformacion(String Eimer){
        System.out.println(this.titulo);
        System.out.println(this.album);
        System.out.println(this.artista);
        System.out.println(this.duracion);
        System.out.println(this.genero);
        System.out.println(Eimer);

    }


}
