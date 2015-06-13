/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iberotec.model;

/**
 *
 * @author ROLANDO_GUADALUPE
 */
public enum Departamento {
    LIMA(" DEPARTAMENTO:  LIMA"),
    ANCASH(" DEPARTAMENTO:  ANCASH"),
    HUANUCO(" DEPARTAMENTO:  HUANUCO"),
    CAJAMARCA("DEPARTAMENTO:  CAJAMARCA"),
    TUMBES("DEPARTAMENTO:   TUMBES"),
    AREQUIPA("DEPARTAMENTO:  AREQUIPA"),
    LA_LIBERTAD("DEPARTAMENTO:  LA LIBERTAR"),
    HUANCAVELICA("DEPARTAMENTO:  HUANCAVELICA"),
    CUZCO("DEPARTAMENTO:  CUZCO"),
    MADRE_DE_DIOS("DEPARTAMENTO:  MADRE DE DIOS"),
    LORETO("DEPARTAMENTO:  LORETO"),
    ICA("DEPARTAMENTO:  ICA"),
    PIURA("DEPARTAMENTO:  PIURA"),
    TRUJILLO("DEPARTAMENTO: TRUJILLO"),
    TACNA("DEPARTAMENTO:  TACNA"),
    MOQUEGUA("DEPARTAMENTO:  MOQUEGUA"),
    APURIMAC("DPARTAMENTO:  APURIMAC"),
    CERRO_DE_PASCO("DAPARTAMENTO:  CERRO DE PASCO")
    
    ;
    
    
    
     private final String nombre;
     
     private Departamento(String nombre) {    
        this.nombre = nombre;
     }
     
     
     /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
}
