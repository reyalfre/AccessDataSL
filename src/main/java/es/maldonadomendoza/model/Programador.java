package es.maldonadomendoza.model;


import java.util.Date;
import java.util.List;


public class Programador {
    private long id;
    private long idDpt;
    private long idEquipo;
    private long idComite;
    private String nombre;
    private String experto;
    private Date alta;
    private double salario;
    private String password;
    private List<Proyecto> proyectos;
    private List<Commit> commits;
    private List<Issue> issues;
    private List<String> conocimientos;


    public Programador(long id, long idDpt, long idEquipo, long idComite, String nombre, String experto, Date alta, double salario, String password, List<Proyecto> proyectos, List<Commit> commits, List<Issue> issues, List<String> conocimientos) {
        this.id = id;
        this.idDpt = idDpt;
        this.idEquipo = idEquipo;
        this.idComite = idComite;
        this.nombre = nombre;
        this.experto = experto;
        this.alta = alta;
        this.salario = salario;
        this.password = password;
        this.proyectos = proyectos;
        this.commits = commits;
        this.issues = issues;
        this.conocimientos = conocimientos;
    }

    public Programador(long id, long idDpt, List<Proyecto> proyectos, List<Issue> issues) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdDpt() {
        return idDpt;
    }

    public void setIdDpt(long idDpt) {
        this.idDpt = idDpt;
    }

    public long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public long getIdComite() {
        return idComite;
    }

    public void setIdComite(long idComite) {
        this.idComite = idComite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExperto() {
        return experto;
    }

    public void setExperto(String experto) {
        this.experto = experto;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<String> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(List<String> conocimientos) {
        this.conocimientos = conocimientos;
    }
}
