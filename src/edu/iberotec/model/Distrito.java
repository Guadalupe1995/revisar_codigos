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
public enum Distrito {
    
    //ANCASH
     //huaraz
    HUARAZ ("Huaraz\n ",Provincia.HUARAZ),
    COCHABAMBA("Cochabamba\n",Provincia.HUARAZ),
    COLCABAMBA("Colcabamba\n",Provincia.HUARAZ),
    HUANCHAY("Huanchay\n",Provincia.HUARAZ),
    JANGAS("Jangas\n",Provincia.HUARAZ),
    OLLEROS("Olleros\n",Provincia.HUARAZ),
    PAMPAS("Pampas\n",Provincia.HUARAZ),
    PARIACOTO("Pariacoto\n",Provincia.HUARAZ),
    PIRA("Pira\n",Provincia.HUARAZ),
    TARICA("Taricá\n",Provincia.HUARAZ ),
    
    // huaylas
    CARAZ("Caraz\n",Provincia.HUAYLAS),
    HUALLANCA("Caraz\n",Provincia.HUAYLAS),
    HUATA("Caraz\n",Provincia.HUAYLAS),
    HUAYLAS("Huaylas\n",Provincia.HUAYLAS),
    MATO("Mato\n",Provincia.HUAYLAS),
    PAMPAROMAS("Pamparomas\n",Provincia.HUAYLAS),
    PUEBLO_LIBRE("Pueblo Libre\n",Provincia.HUAYLAS),
    SANTA_CRUZ ("Santa Cruz\n",Provincia.HUAYLAS),
    SANTO_TORIBIO("Santo Toribio\n",Provincia.HUAYLAS),
    YURACMARCA("Yuramarca\n",Provincia.HUAYLAS),
    
    //carhuaz
 
    CARHUAZ("Carhuaz\n",Provincia.CARHUAZ),
    ACOPAMPA("Acopampa\n",Provincia.CARHUAZ),
    AMASHCA("Amashca\n",Provincia.CARHUAZ),
    ANTA("Anta\n",Provincia.CARHUAZ),
    ATAQUERO ("Ataqueros\n",Provincia.CARHUAZ),
    MARCARA("Marcará\n",Provincia.CARHUAZ),
    PARIAHUANCA("Parihuanca\n",Provincia.CARHUAZ),
    SAN_MIGUEL_DE_ACO ("San Miguel De Aco\n",Provincia.CARHUAZ),
    SHILLA("Shilla\n",Provincia.CARHUAZ),
    TINCO("Tinco\n",Provincia.CARHUAZ),
    YUNGAR("Yungay\n",Provincia.CARHUAZ),
    
    
    
    //yungay
    
    YUNGAY("Yungay\n",Provincia.YUNGAY),
    CASCAPARA("Cascapampa\n",Provincia.YUNGAY),
    MANCOS("Mancos\n",Provincia.YUNGAY),
    MATACOTO("Matacoto\n",Provincia.YUNGAY),
    QUILLO("Quillo\n",Provincia.YUNGAY),
    RANRAHIRCA("Ranrahirca\n",Provincia.YUNGAY),
    SHUPLUY("Shupluy\n",Provincia.YUNGAY),
    YANAMA("Yanama\n",Provincia.YUNGAY),
    
    
    
    
    //PALLASCA
    
    CABANA("Cabana\n",Provincia.PALLASCA),
    BOLOGNESI("Bolognesi\n",Provincia.PALLASCA),
    CONCHUCOS("Conchucos\n",Provincia.PALLASCA),
    HUACASCHUQUE("Huacaschuque\n",Provincia.PALLASCA),
    HUANDOVAL("Huandoval\n",Provincia.PALLASCA),
    LACABAMBA("Lacabamba\n",Provincia.PALLASCA),
    LLAPO("Llapo\n",Provincia.PALLASCA),
    PALLASCA("Pallasca\n",Provincia.PALLASCA),
    SANTA_ROSA("Santa Rosa\n",Provincia.PALLASCA),
    TAUCA("Tauca\n",Provincia.PALLASCA),
    
    
    //LIMA
    
    //huaral
   
    ATAVILOS_ALTO("Atavillos Alto\n",Provincia.HUARAL),
    ATAVILLOS_BAJO("Atavillos Bajo\n",Provincia.HUARAL),
    AUCALLAMA("Aucallama\n",Provincia.HUARAL),
    CHANCAY("Chancay\n",Provincia.HUARAL),
    HUARAL("Huaral\n",Provincia.HUARAL),
    IHUARI("Ihuarí\n",Provincia.HUARAL),
    LAMPIAN("Lampían\n",Provincia.HUARAL),
    PACARAOS("Pacaraos\n",Provincia.HUARAL),
    SANTA_CRUZ_DE_ANDAMARCA("Santa Cruz de Andamarca\n",Provincia.HUARAL),
    SUMBILCA("Sumbilca\n",Provincia.HUARAL),
    SAN_MIGUEL_DE_ACOS("San Miguel de Acos\n",Provincia.HUARAL),
    
    
    
    
    //cañete
    
    ASIA("Asia\n",Provincia.CAÑETE),
    CALANGO("Calango\n",Provincia.CAÑETE),
    CERRO_AZUL("Cerro Azul\n",Provincia.CAÑETE),
    CHILCA("Chilca\n",Provincia.CAÑETE),
    COAYLLO("Coayllo\n",Provincia.CAÑETE),
    IMPERIAL("Imperial\n",Provincia.CAÑETE),
    LUNAHUANA("Lunahuana\n",Provincia.CAÑETE),
    MALA("Mala\n",Provincia.CAÑETE),
    NUEVO_IMPERIAL("Nuevo Imperial\n",Provincia.CAÑETE),
    PACARAN("Pacaran\n",Provincia.CAÑETE),
    QUILMANA("Quilmana\n",Provincia.CAÑETE),
    SAN_ANTONIO("San Antonio\n",Provincia.CAÑETE),
    SAN_LUIS("San Luis\n",Provincia.CAÑETE),
    SAN_VICENTE_DE_CAÑETE("San Vicente de Cañete\n",Provincia.CAÑETE),
    SANTA_CRUZ_DE_FLORES("Santa Cruz de Florez\n",Provincia.CAÑETE),
    ZUÑIGA("Zuñiga\n",Provincia.CAÑETE),
    
    
    
    //HUAURA

    HUACHO("Huacho\n",Provincia.HUAURA),
    AMBAR("Ámbar\n",Provincia.HUAURA),
    CALETA_DE_CARQUIN("Caleta de Carquín\n",Provincia.HUAURA),
    CHECRAS("Checras\n",Provincia.HUAURA),
    HUALMAY("Hualmay\n",Provincia.HUAURA),
    HUAURA("Huaura\n",Provincia.HUAURA),
    LEONCIO_PRADO("Leoncio Prado\n",Provincia.HUAURA),
    PACCHO("Paccho\n",Provincia.HUAURA),
    SANTA_LEONOR("Santa Leonor\n",Provincia.HUAURA),
    SANTA_MARIA("Santa María\n",Provincia.HUAURA),
    SAYAN("Sayán\n",Provincia.HUAURA),
    VEGUETA("Vegueta\n",Provincia.HUAURA),
    
    
    
    //huarochiri


    MATUCANA("Matucana\n",Provincia.HUAROCHIRI),
    ANTIOQUIA("Antioquía\n",Provincia.HUAROCHIRI),
    CALLAHUANCA("Callahuanca\n",Provincia.HUAROCHIRI),
    CARAMPOMA("Carampoma\n",Provincia.HUAROCHIRI),
    CHICLA("Chicla\n",Provincia.HUAROCHIRI),
    CUENCA("Cuenca\n",Provincia.HUAROCHIRI),
    HUACHUPAMPA("Huachupampa\n",Provincia.HUAROCHIRI),
    HUANZA("Huanza\n",Provincia.HUAROCHIRI),
    HUAROCHIRI("Huarochirí\n",Provincia.HUAROCHIRI),
    LAHUAYTAMBO("Lahuaytambo\n",Provincia.HUAROCHIRI),
    LANGA("Langa\n",Provincia.HUAROCHIRI),
    LARAOS("Laraos\n",Provincia.HUAROCHIRI),
    MARIATANA("Mariatana\n",Provincia.HUAROCHIRI),
    RICARDO_PALMA("Ricardo Palma\n",Provincia.HUAROCHIRI),
    SAN_ANDRES_DE_TUPICOCHA("San Andrés de Tupicocha\n",Provincia.HUAROCHIRI),
    SAN_ANTONIO_DE_CHACLLA("San Antonio de Chaclla\n",Provincia.HUAROCHIRI),
    SAN_BARTOLOME("San Bartolomé\n",Provincia.HUAROCHIRI),
    SAN_DAMIAN("San Damián\n",Provincia.HUAROCHIRI),
    SAN_JUAN_DE_IRIS("San Juan de Iris\n",Provincia.HUAROCHIRI),
    SAN_JUAN_DE_TANTARANCHE("San Juan de Tantaranche\n",Provincia.HUAROCHIRI),
    SAN_LORENZO_DE_QUINTI("San Lorenzo de Quinti\n",Provincia.HUAROCHIRI),
    SAN_MATEO("San Mateo\n",Provincia.HUAROCHIRI),
    SAN_MATEO_DE_ATAO("San Mateo de Otao\n",Provincia.HUAROCHIRI),
    SAN_PEDRO_DE_CASTA("San Pedro de Casta\n",Provincia.HUAROCHIRI),
    SAN_PEDRO_DE_HUANCAYRE("San Pedro de Huancayre\n",Provincia.HUAROCHIRI),
    SANGALLAYA("Sangallaya\n",Provincia.HUAROCHIRI),
    SANTA_CRUZ_DE_COCACHACRA("Santa Cruz de Cocachacra\n",Provincia.HUAROCHIRI),
    SANTA_EULALIA("Santa Eulalia\n",Provincia.HUAROCHIRI),
    SANTIAGO_DE_ANCHUCAYA("Santiago de Anchucaya\n",Provincia.HUAROCHIRI),
    SANTIAGO_DE_TUNA("Santiago de Tuna\n",Provincia.HUAROCHIRI),
    SANTO_DOMINGO_DE_OLLEROS("Santo Domingo de los Olleros\n",Provincia.HUAROCHIRI),
    SAN_GERONIMO_DE_SURCO("San Jerónimo de Surco\n",Provincia.HUAROCHIRI),
    
    
    
    
    //canta
    
    CANTA("Canta\n",Provincia.CANTA),
    ARAHUAY("Arahuay\n",Provincia.CANTA),
    HUAMANTANGA("Huamantanga\n",Provincia.CANTA),
    HUAROS("Huaros\n",Provincia.CANTA),
    LACHAQUI("Lachaqui\n",Provincia.CANTA),
    SAN_BUENAVENTURA("San Buenaventura\n",Provincia.CANTA),
    SANTA_ROSA_DE_QUIVES("Santa Rosa de Quives\n",Provincia.CANTA),
    
    
    
    
    
    //HUANUCO
    
    //ambo
    
    CAYNA("Cayna\n",Provincia.AMBO),
    COLPAS("Colpas\n",Provincia.AMBO),
    COCHAMARCA("Conchamarca\n",Provincia.AMBO),
    HUACAR("Huacar\n",Provincia.AMBO),
    SAN_FRANCISCO("San Francisco\n",Provincia.AMBO),
    SAN_RAFAEL("San Rafael\n",Provincia.AMBO),
    TOMAY_KICHWA("Tomay Kichwa\n",Provincia.AMBO),



    //dos de mayo

    LA_UNION("La union\n",Provincia.DOS_DE_MAYO),
    CHUQUIS("Chuquis\n",Provincia.DOS_DE_MAYO),
    MARIAS("Marias\n",Provincia.DOS_DE_MAYO),
    PACHAS("Pachas\n",Provincia.DOS_DE_MAYO),
    QUIVILLA("Quivilla\n",Provincia.DOS_DE_MAYO),
    RIPAN("Ripan\n",Provincia.DOS_DE_MAYO),
    SHUNQUI("Shunqui\n",Provincia.DOS_DE_MAYO),
    SILLAPATA("Sillapata\n",Provincia.DOS_DE_MAYO),
    YANAS("Yanas\n",Provincia.DOS_DE_MAYO),



    //leoncio prado

    DANIEL_ALONA_ROBLES("Daniel alomia robles\n",Provincia.LEONCIO_PRADO),
    HERMILIO_VALDIZAN("Hermilio valdizan\n",Provincia.LEONCIO_PRADO),
    JOSE_CRESPO_Y_CASTILLO("Jose crespo y castillo(aucayacu)\n",Provincia.LEONCIO_PRADO),
    LUYANDO("Luyando\n",Provincia.LEONCIO_PRADO),
    MARIANO_DAMASO_BERAUN("Mariano damaso beraun\n",Provincia.LEONCIO_PRADO),


    //huamalies

    LLATA("Llata\n",Provincia.HUAMALIES),
    ARANCAY("Arancay\n",Provincia.HUAMALIES),
    CHAVIN_DE_PARIARCA("Chavin de pariarca\n",Provincia.HUAMALIES),
    JACAS_GRANDE("Jacas grande\n",Provincia.HUAMALIES),
    JIRCAN("jircan\n",Provincia.HUAMALIES),
    MIRAFLORES("Miraflores\n",Provincia.HUAMALIES),
    MONZON("Monzon\n",Provincia.HUAMALIES),
    PUNCHAO("punchao\n",Provincia.HUAMALIES),
    PUÑOS("Puños\n",Provincia.HUAMALIES),
    SINGA("Singa\n",Provincia.HUAMALIES),
    TANTAMAYO("Tantamayo\n",Provincia.HUAMALIES),



    //yarowillca

    CHAVINILLO("chavinillo\n",Provincia.YAROWILLCA),
    CAHUAC("cahuac\n",Provincia.YAROWILLCA),
    CHACABAMBA("chacabamba\n",Provincia.YAROWILLCA),
    CHUPAN("chupan\n",Provincia.YAROWILLCA),
    JACAS_CHICO("jacas chico\n",Provincia.YAROWILLCA),
    OBAS("obas\n",Provincia.YAROWILLCA),
    PAMPAMARCA("pampamarca\n",Provincia.YAROWILLCA),
    
    
    ;
     
    
    
    private String nombre;
    private Provincia provincia ;

    private Distrito(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
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
     * @return the provincia
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

   
 
    
}
