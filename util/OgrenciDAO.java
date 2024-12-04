package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OgrenciDAO {
    public void saveOgrenci(Ogrenci ogrenci) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(ogrenci);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Other CRUD methods (update, delete, getById, getAll)
}
