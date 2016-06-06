package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;
import modelo.Evento;
import persistencia.EventoDAO;
import persistencia.UsuarioDAO;

@ManagedBean
@SessionScoped
public class LoginBean {

    private Usuario usuario = new Usuario();
    private Evento evento = new Evento();
    private List<Evento> lista  = new ArrayList();
    EventoDAO evdao= new EventoDAO();
    private int idUsuario;
    
    public LoginBean(){
        lista = evdao.listarEventosDeUsuarios(idUsuario);
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String autenticar() {
        UsuarioDAO dao = new UsuarioDAO();
        EventoDAO evdao= new EventoDAO();
        
        setUsuario(dao.autentica(getUsuario().getLogin(), getUsuario().getSenha()));
        
        if (getUsuario() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou senha incorretos.", ""));
            setUsuario(new Usuario());
            return "index";
        } else {
            setIdUsuario(getUsuario().getId());
            setLista(evdao.listarEventosDeUsuarios(getIdUsuario()));
            if(!lista.isEmpty()){return "principal_1_1";}else{
            return "principal_1";}
        }
    }
}
    /*    
    public List<Evento> eventosUsuariosLista(){
        UsuarioDAO dao = new UsuarioDAO();
        EventoDAO evdao= new EventoDAO();
        List lista  = new ArrayList();
        int idUsuario;
        setUsuario(dao.autentica(getUsuario().getLogin(), getUsuario().getSenha()));
        idUsuario= getUsuario().getId();
        lista= evdao.listarEventosDeUsuarios(idUsuario);
        return (Evento)lista;
    }
    */


    /*
        public String autenticar() {
        UsuarioDAO dao = new UsuarioDAO();
        setUsuario(dao.autentica(getUsuario().getLogin(), getUsuario().getSenha()));
        if (getUsuario() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login ou senha incorretos.", ""));
            setUsuario(new Usuario());
            return "index";
        } else {
            //int idUsuario = getUsuario().getId();
            //List lista = getUsuario().getUsuario();
            //List lista = getEvento().getEvento();
            //if (lista == null){
            //return "principal_1";
            //}else{
            return "principal_1";
        //}
        }
    }
    */