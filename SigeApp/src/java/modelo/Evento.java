package modelo;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String tipoEvento;
    @NotEmpty
    private String tituloEvento;
    @NotEmpty
    private String trilhaEvento;
    @NotEmpty
    private String descricaoEvento;
    @NotEmpty
    private String autor;
//  pode ficar vazio
    private String segundoautor;
    @NotEmpty
    private String lugar;
    
    @Temporal(TemporalType.DATE)
    private Date dataEvento;
    
    @Temporal(TemporalType.DATE)
    private Date inicioEvento;
    
    @Temporal(TemporalType.DATE)
    private Date fimEvento;
    
    @Temporal(TemporalType.TIME)
    private Date horario;

    public String getSegundoautor() {
        return segundoautor;
    }

    public void setSegundoautor(String segundoautor) {
        this.segundoautor = segundoautor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getInicioEvento() {
        return inicioEvento;
    }

    public void setInicioEvento(Date inicioEvento) {
        this.inicioEvento = inicioEvento;
    }

    public Date getFimEvento() {
        return fimEvento;
    }

    public void setFimEvento(Date fimEvento) {
        this.fimEvento = fimEvento;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getTrilhaEvento() {
        return trilhaEvento;
    }

    public void setTrilhaEvento(String trilhaEvento) {
        this.trilhaEvento = trilhaEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

}
