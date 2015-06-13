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
public enum Provincia {

    HUARAZ("Huaraz", Departamento.ANCASH),
    HUAYLAS("Caraz",Departamento.ANCASH),
    CARHUAZ("Carhuaz", Departamento.ANCASH),
    YUNGAY("Yungay",Departamento.ANCASH),
    PALLASCA("Pallasca", Departamento.ANCASH),
    
    HUARAL("Huaral",Departamento.LIMA),
    CAÑETE("Cañete",Departamento.LIMA),
    HUAURA("Huaura",Departamento.LIMA),
    HUAROCHIRI("Huarochiri",Departamento.LIMA),
    CANTA("Canta",Departamento.LIMA),
    
   
    
    AMBO("Ambo",Departamento.HUANUCO),
    DOS_DE_MAYO("Dos De Mayo",Departamento.HUANUCO),
    LEONCIO_PRADO("Leoncio Prado",Departamento.HUANUCO),
    HUAMALIES("Huamalies",Departamento.HUANUCO),
    YAROWILLCA("Yarowillca",Departamento.HUANUCO);
    
    
    /*
    private final String nombre;
    private final Departamento depa;

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepa() {
        return depa;
    }

    private Provincia(String nombre, Departamento depa) {
        this.nombre = nombre;
        this.depa = depa;
    }

    public Object getDepartameto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
      private String nombre;
    private  Departamento departameto;

    private Provincia(String nombre, Departamento departameto) {
        this.nombre = nombre;
        this.departameto = departameto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the departameto
     */
    public Departamento getDepartameto() {
        return departameto;
    }

    /**
     * @param departameto the departameto to set
     */
    public void setDepartameto(Departamento departameto) {
        this.departameto = departameto;
    }

   
    

}
