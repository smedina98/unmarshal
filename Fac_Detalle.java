
/**
 *
 * @author SebasM
 */
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Fac_Detalle {
    
	private String cabId;
	private String detDetalle;
	private String detId;
	private String detPrecio;

    public Fac_Detalle() {
    }

    public Fac_Detalle(String cabId, String detDetalle, String detId, String detPrecio) {
        this.cabId = cabId;
        this.detDetalle = detDetalle;
        this.detId = detId;
        this.detPrecio = detPrecio;
    }

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getDetDetalle() {
        return detDetalle;
    }

    public void setDetDetalle(String detDetalle) {
        this.detDetalle = detDetalle;
    }

    public String getDetId() {
        return detId;
    }

    public void setDetId(String detId) {
        this.detId = detId;
    }

    public String getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(String detPrecio) {
        this.detPrecio = detPrecio;
    }

    
}
