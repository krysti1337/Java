package com.mkyong.user;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserDAOTest {

    private static SessionFactory sessionFactory;
    private static UserDAO userDAO;

    @BeforeAll
    static void setup() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        userDAO = new UserDAO(sessionFactory);
    }

    @Test
    @Order(1)
    void testSave() {
        DBUser user = new DBUser();
        user.setUserId(100);
        user.setUsername("testuser");
        user.setCreatedBy("test");
        user.setCreatedDate(new Date());

        userDAO.save(user);

        DBUser fetched = userDAO.findById(100);
        assertNotNull(fetched);
        assertEquals("testuser", fetched.getUsername());
    }

    @Test
    @Order(2)
    void testUpdate() {
        DBUser user = userDAO.findById(100);
        user.setUsername("updateduser");
        userDAO.update(user);

        DBUser updated = userDAO.findById(100);
        assertEquals("updateduser", updated.getUsername());
    }

    @Test
    @Order(3)
    void testFindAll() {
        List<DBUser> users = userDAO.findAll();
        assertFalse(users.isEmpty());
    }

    @Test
    @Order(4)
    void testDelete() {
        DBUser user = userDAO.findById(100);
        userDAO.delete(user);

        DBUser deleted = userDAO.findById(100);
        assertNull(deleted);
    }

//    @Test
//    @Order(5)
//    void testFindByUsername() {
//        DBUser user = userDAO.findByUsername("testuser");
//        assertNotNull(user);
//        assertEquals("testuser", user.getUsername());
//    }

    @AfterAll
    static void tearDown() {
        sessionFactory.close();
    }
}
