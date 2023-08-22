//UserApplication

package com.example.RegistroUsuariosApplication.Task;

import jakarta.persistence.*;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String descripcion;
    private String fecha;
    private String estado;

    public Task() {
    }

    public Task(Long id, String name, String descripcion , String fecha, String estado) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }




}