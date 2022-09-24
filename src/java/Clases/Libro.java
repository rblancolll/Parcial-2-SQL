/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Libro {
    private int codigo;
    private String nombre;
    private String correo;
    private String direccion;
    private int año;
    private int tipo;

    
    public Libro(int año, int codigo, String nombre, String correo, String direccion, int tipo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.correo=correo;
        this.direccion=direccion;  
        this.año=año;
        this.tipo=tipo;   
    }
    
    public Libro(){
        this.nombre="Alumno de ejemplo";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
