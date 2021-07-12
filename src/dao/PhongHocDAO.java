/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import models.PhongHoc;

/**
 *
 * @author Admin
 */
public class PhongHocDAO {
    private EntityManager em = Persistence.createEntityManagerFactory("OOP_BTL_QLMTPU").createEntityManager();
    
     public List<PhongHoc> getAll(){
        String sql = String.format("select a from %s a", PhongHoc.class.getName());
        return em.createQuery(sql).getResultList();
    }
    
    public PhongHoc getByMaPhong(int id){
        return em.find(PhongHoc.class, id);
    }
    
    public boolean addNew(PhongHoc phongHoc){
        em.getTransaction().begin();
        em.persist(phongHoc);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean update(PhongHoc phongHoc){
        em.getTransaction().begin();
        em.merge(phongHoc);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean delete(int id){
        em.getTransaction().begin();
        PhongHoc b = em.find(PhongHoc.class, id);
        em.remove(b);
        em.getTransaction().commit();
        return true;
    }
}
