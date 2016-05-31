package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import persistencia.HibernateUtil;

/**
 * Filtro usado para interceptar todas as requisições que chegam para arquivo XHTML.
 * Este filtro iniciar uma transação do Hibernate para cada requisição.
 * 
 * @author leonardo
 */
public class FiltroTransacoesHibernate implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        chain.doFilter(request, response);
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
    }

    @Override
    public void destroy() {
    }
    
    
    
}
