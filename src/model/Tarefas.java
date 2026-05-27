package model;

public class Tarefas {
    private int id;
    private int id_usuario;
    private String titulo;
    private String status;

    public Tarefas(String titulo, String status, int id_usuario) {
        this.titulo = titulo;
        this.status = status;
        this.id_usuario = id_usuario;
    }

    //Getters
    public int getId() {return id;}
    public int getId_usuario() {return id_usuario;}
    public String getTitulo() {return titulo;}
    public String getStatus() {return status;}

    //Setters
    public void setId(int id) {this.id = id;}
    public void setId_usuario(int id_usuario) {this.id_usuario = id_usuario;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setStatus(String status) {this.status = status;}

    @Override
    public String toString(){
        return String.format("ID: %-5d|Titulo: %-20s|Status: %-10s|",
                id, titulo, status);
    }
}
