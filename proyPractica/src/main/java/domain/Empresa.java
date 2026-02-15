/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Usuario 1
 */
public class Empresa {

    @Override
    public String toString() {
        return "Empresa{" + "codigoEmpresa=" + codigoEmpresa + ", nombreEmpresa=" + nombreEmpresa + '}';
    }
        
    int codigoEmpresa;
    String nombreEmpresa;

    public Empresa(int codigo) {
        codigoEmpresa = codigo;
    }
    
    public Empresa(int codigo, String Nombre) {
        codigoEmpresa = codigo;
        nombreEmpresa= Nombre;
}
    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setCodigoEmpresa(int codigo) {
        codigoEmpresa = codigo;
    }
}
