package com.labdemo.book.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDAO {

    private SessionFactory sessionFactory;

    public BookDAO() {
        sessionFactory = Utility.getSessionFactory();
    }

    private Session getSession() {
        return sessionFactory.openSession();
    }

    public void save(Book b) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();

        session.persist(b);

        tx.commit();
        session.close();
    }

    public List<Book> findAll() {
        Session session = getSession();

        List<Book> books = session
                .createQuery("FROM Book", Book.class)
                .list();

        session.close();
        return books;
    }

    public void update(Book b) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();

        session.merge(b);

        tx.commit();
        session.close();
    }

    public void delete(int id) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();

        Book b = session.find(Book.class, id);

        if (b != null) {
            session.remove(b);
            System.out.println("Book Deleted Successfully");
        } else {
            System.out.println("Book Not Found");
        }

        tx.commit();
        session.close();
    }
}