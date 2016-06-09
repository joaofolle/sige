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

    //private Usuario usuario = new Usuario();
    private UsuarioDAO daoUsuario=new UsuarioDAO();
    private Evento evento = new Evento();
    private EventoDAO dao = new EventoDAO();
    private List<Evento> listaEventos;
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

    public void adicionar(Evento evento,Usuario usuario){
        evento.getEvento().add(usuario);
        dao.salvar(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Sua inscrição foi realizada com sucesso no(a)  "+evento.getTipoEvento()+" : "+evento.getTituloEvento()+" .");
        evento = new Evento();
        listaEventos = dao.listar();
    }
    
    public void autorCriadorEvento(Usuario usuario,Evento evento){
        usuario.getUsuario().add(evento);
        daoUsuario.salvar(usuario);
        dao.salvar(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Evento criado com sucesso !!!");
        usuario = new Usuario();
        listaUsuarios = daoUsuario.listar();
        evento = new Evento();
        listaEventos = dao.listar();
    }
    
    public void salvar() {
        dao.salvar(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Evento cadastrado com sucesso");
        evento = new Evento();
        listaEventos = dao.listar();
    }

//    public void carregar(int id) {
//        evento = dao.carregar(id);
//    }
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
    public void remover(Evento evento) {
        dao.remover(evento);
        enviarMensagem(FacesMessage.SEVERITY_INFO, "Evento removido com sucesso");
        listaEventos = dao.listar();
    }

    private void enviarMensagem(Severity sev, String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(sev, msg, ""));
    }

    @PreDestroy
    public void encerrar() {
        dao.encerrar();
    }
    
/*
    public List<Evento> getListaEventosUsuarios() {
        return listaEventosUsuarios;
    }

    public void setListaEventosUsuarios(List<Evento> listaEventosUsuarios) {
        this.listaEventosUsuarios = listaEventosUsuarios;
    }

    public List<Usuario> getLista2EventosUsuarios() {
        return lista2EventosUsuarios;
    }

    public void setLista2EventosUsuarios(List<Usuario> lista2EventosUsuarios) {
        this.lista2EventosUsuarios = lista2EventosUsuarios;
    }
*/

    public String getListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(String listaEmails) {
        this.listaEmails = listaEmails;
    }
}