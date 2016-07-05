package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelo.Evento;
import modelo.Usuario;
import org.hibernate.mapping.Array;
import persistencia.EventoDAO;
import persistencia.UsuarioDAO;

@ManagedBean(name = "EventoBean")
@RequestScoped
public class CadastroEventosBean {

    private UsuarioDAO daoUsuario=new UsuarioDAO();
    private Evento evento = new Evento();
    private EventoDAO dao = new EventoDAO();
    private List<Evento> listaEventos;
    private List<Evento> listaEventosDoUsuario;
    private List<Usuario> listaUsuarios;
    private String listaEmails;
    
    public CadastroEventosBean() {
        listaEventos = dao.listar();
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }
     public String getListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(String listaEmails) {
        this.listaEmails = listaEmails;
    }

    public List<Evento> getListaEventosDoUsuario() {
        return listaEventosDoUsuario;
    }

    public void setListaEventosDoUsuario(List<Evento> listaEventosDoUsuario) {
        this.listaEventosDoUsuario = listaEventosDoUsuario;
    }

    public void carregar(int id) {
        evento = dao.carregar(id);
        /* LISTA DE EMAILS */
        int iteracoes = evento.getEvento().size();
        Usuario usuario;
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < iteracoes; i++) {
            usuario = evento.getEvento().get(i);
            if (i == (iteracoes - 1)) {
                stb.append(usuario.getEmail());
            } else {
                stb.append(usuario.getEmail()).append(", ");
            }

        }
        listaEmails = stb.toString();
        System.out.println("LISTA DE EMAILS");
        System.out.println(stb.toString());
        System.out.println("STRING LISTA EMAILS");
        System.out.println(listaEmails);
    }
    
    public void salvar() {
        dao.salvar(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Evento cadastrado com sucesso");
        evento = new Evento();
        listaEventos = dao.listar();
    }
    
    public void remover(Evento evento) {
        dao.remover(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Evento removido com sucesso");
        listaEventos = dao.listar();
    }
    
    public void adicionar(Evento evento,Usuario usuario){
        evento.getEvento().add(usuario);
        dao.salvar(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Sua inscrição foi realizada com sucesso no(a)  "+evento.getTipoEvento()+" : "+evento.getTituloEvento()+" .");
        evento = new Evento();
        listaEventos = dao.listar();
    }
    public String autorCriadorEvento(Usuario usuario){
        setListaEventosDoUsuario(dao.carregarEventosDoUsuario(usuario.getId()));
        if(listaEventosDoUsuario.isEmpty()){
            enviarMensagem(FacesMessage.SEVERITY_INFO, "Você não possui evento(s) cadastrado(s) !!!");
            return null;
        }else{
           
            return "eventosDoUsuario";
        }
    }

    private void enviarMensagem(Severity sev, String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(sev, msg, ""));
    }

    @PreDestroy
    public void encerrar() {
        dao.encerrar();
    }
}