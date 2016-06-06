package modelo;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    private String nome;
    
    //@NotNull(message = "O campo deve ser preenchido.")
    private String cpf;
    //@NotNull(message = "O campo deve ser preenchido.")
    //@Size(max = 11)
    private String telefone;
    //@NotNull(message = "O campo deve ser preenchido.")
    //@Size(min = 8, max = 12)
    private String email;
   //@NotNull(message = "O campo deve ser preenchido.")
    private String endereco;
    //@NotNull(message = "O campo deve ser preenchido.")
    //@Size(min = 6, max = 30)
    private char sexo;
    //@NotNull(message = "O campo deve ser preenchido.")
    //@Size(min = 1, max = 30)
    private String login;
    //@NotNull(message = "O campo deve ser preenchido.")
    private String senha;
    //@NotNull(message = "O campo deve ser preenchido.")

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    //@NotNull
    //@Past(message = "A data de nascimento deve ser preenchida.")

    public List<Evento> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Evento> usuarios) {
        this.usuarios = usuarios;
    }

    @ManyToMany(mappedBy = "evento",cascade = CascadeType.ALL)
    private List<Evento> usuarios;

    public List<Evento> getUsuario() {
        return usuarios;
    }

    public void setUsuario(List<Evento> usuario) {
        this.usuarios = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}