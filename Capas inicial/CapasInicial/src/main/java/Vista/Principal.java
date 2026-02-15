/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Empresa;
import Modelo.EmpresaDAO;

/**
 *
 * @author Soporte
 */
public class Principal {

    public static void main(String[] args) {

        EmpresaDAO empresaDAO = new EmpresaDAO();


        // ===== INSERT =====
        Empresa nuevaEmpresa = new Empresa();
        nuevaEmpresa.setNombreEmpresa("Universidad USAC");
        empresaDAO.insert(nuevaEmpresa);


        // ===== Consulta =====
        Empresa empresaConsultar = new Empresa();
        empresaConsultar.setCodigoEmpresa(1);
        empresaConsultar = empresaDAO.query(empresaConsultar);
        System.out.println(empresaConsultar);


        // ===== UPDATE =====
        Empresa empresaActualizar = new Empresa();
        empresaActualizar.setCodigoEmpresa(4);
        empresaActualizar.setNombreEmpresa("Universidad Hardvard");
        int filasUpdate = empresaDAO.update(empresaActualizar);
        System.out.println("Filas actualizadas: " + filasUpdate);


        // ===== DELETE =====
        Empresa empresaEliminar = new Empresa();
        empresaEliminar.setCodigoEmpresa(5);
        int filasDelete = empresaDAO.delete(empresaEliminar);
        System.out.println("Filas eliminadas: " + filasDelete);

    }
}
