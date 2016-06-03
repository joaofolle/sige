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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;
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
    @NotNull(message = "O campo deve ser preenchido.")
    private String tituloEvento;
    @NotEmpty
    @NotNull(message = "O campo deve ser preenchido.")
    private String trilhaEvento;
    @NotEmpty
    @NotNull(message = "O campo deve ser preenchido.")
    private String descricaoEvento;
    @NotEmpty
    @NotNull(message = "O campo deve ser preenchido.")
    private String autor;
//  pode ficar vazio
    private String segundoautor;
    @NotEmpty
    @NotNull(message = "O campo deve ser preenchido.")
    private String lugar;
    @NotNull(message = "O campo deve ser preenchido.")

    @Temporal(TemporalType.DATE)
    private Date dataEvento;
    @Future
    @NotNull(message = "O campo deve ser preenchido.")

    @Temporal(TemporalType.DATE)
    private Date inicioEvento;
    @Future
    @NotNull(message = "O campo deve ser preenchido.")

    @Temporal(TemporalType.DATE)
    private Date fimEvento;
    @Future
    @NotNull(message = "O campo deve ser preenchido.")

    @Temporal(TemporalType.TIME)
    private Date horario;
    @NotNull(message = "O campo deve ser preenchido.")

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
}


