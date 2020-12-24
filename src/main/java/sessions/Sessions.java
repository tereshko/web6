package sessions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sessions {
    private static SessionFactory factory;

    private SessionFactory getFactory() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        return factory;
    }

    public Session getCurrentSession() {
        return getFactory().getCurrentSession();
    }

    public void closeFactory() {
        getFactory().close();
    }
}
