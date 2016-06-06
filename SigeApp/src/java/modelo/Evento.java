package modelo;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @NotEmpty( message = "Erro ao informar dados" )
    private String tipoEvento;
    @NotEmpty( message = "Erro ao informar dados" )
    private String tituloEvento;
    @NotEmpty( message = "Erro ao informar dados" )
    private String trilhaEvento;
    @NotEmpty( message = "Erro ao informar dados" )
    private String descricaoEvento;
    @NotEmpty( message = "Erro ao informar dados" )
    private String autor;
//  pode ficar vazio
    private String segundoautor;
    private int idUsuarioCriador;
    @NotEmpty( message = "Erro ao informar dados" )
    private String lugar;
    @Future(message = "DATA INVÁLIDA")
    @Temporal(TemporalType.DATE)
    private Date dataEvento;
    @Future(message = "DATA INVÁLIDA")
    @Temporal(TemporalType.DATE)
    private Date inicioEvento;
    @Future(message = "DATA INVÁLIDA")
    @Temporal(TemporalType.DATE)
    private Date fimEvento;
    @Future(message = "DATA INVÁLIDA")
    @Temporal(TemporalType.TIME)
    private Date horario;
    
    @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "Palestra",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private List<Usuario> evento;

    public List<Usuario> getEvento() {
        return evento;
    }

    public void setEvento(List<Usuario> evento) {
        this.evento = evento;
    }   
    
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

    public int getIdUsuarioCriador() {
        return idUsuarioCriador;
    }

    public void setIdUsuarioCriador(int idUsuarioCriador) {
        this.idUsuarioCriador = idUsuarioCriador;
    }

}