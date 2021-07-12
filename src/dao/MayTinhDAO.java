/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import models.MayTinh;

/**
 *
 * @author Admin
 */
public class MayTinhDAO {
    private EntityManager em = Persistence.createEntityManagerFactory("OOP_BTL_QLMTPU").createEntityManager();
    
     public List<MayTinh> getAll(){
        String sql = String.format("select a from %s a", MayTinh.class.getName());
        return em.createQuery(sql).getResultList();
    }
    
    public MayTinh getBySoHieu(int id){
        return em.find(MayTinh.class, id);
    }
    
    public boolean addNew(MayTinh mayTinh){
        em.getTransaction().begin();
        em.persist(mayTinh);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean update(MayTinh mayTinh){
        em.getTransaction().begin();
        em.merge(mayTinh);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean delete(int id){
        em.getTransaction().begin();
        MayTinh b = em.find(MayTinh.class, id);
        em.remove(b);
        em.getTransaction().commit();
        return true;
    }
}
