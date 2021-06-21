/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SebasM
 */
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Fac_Cabecera {
 
    private String cabId;
    private String cabCi;
    private String cabIva;
    private String cabSubt;

    public Fac_Cabecera() {
    }

    public Fac_Cabecera(String cabId, String cabCi, String cabIva, String cabSubt) {
        this.cabId = cabId;
        this.cabCi = cabCi;
        this.cabIva = cabIva;
        this.cabSubt = cabSubt;
    }

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getCabCi() {
        return cabCi;
    }

    public void setCabCi(String cabCi) {
        this.cabCi = cabCi;
    }

    public String getCabIva() {
        return cabIva;
    }

    public void setCabIva(String cabIva) {
        this.cabIva = cabIva;
    }

    public String getCabSubt() {
        return cabSubt;
    }

    public void setCabSubt(String cabSubt) {
        this.cabSubt = cabSubt;
    }

    
    
}
