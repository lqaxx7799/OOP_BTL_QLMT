/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import models.QlMayTinh;
import models.QlMayTinhPK;

/**
 *
 * @author Admin
 */
public class QlMayTinhDAO {
    private EntityManager em = Persistence.createEntityManagerFactory("OOP_BTL_QLMTPU").createEntityManager();
    
    public List<QlMayTinh> getAll(){
        String sql = String.format("select a from %s a", QlMayTinh.class.getName());
        return em.createQuery(sql).getResultList();
    }
    
    public List<QlMayTinh> getByTenPhong(String ten){
        String sql = String.format("select a from %s a where a.phongHoc.tenPhong like :tenPhong", QlMayTinh.class.getName());
        return em.createQuery(sql).setParameter("tenPhong", "%" + ten + "%").getResultList();
    }
    
    public List<QlMayTinh> getByTenMay(String ten){
        String sql = String.format("select a from %s a where a.mayTinh.ten like :tenMay", QlMayTinh.class.getName());
        return em.createQuery(sql).setParameter("tenMay", "%" + ten + "%").getResultList();
    }
    
    public List<QlMayTinh> getByMaPhongHoc(int maPhong){
        String sql = String.format("select a from %s a where a.phongHoc.maPhong = :maPhong", QlMayTinh.class.getName());
        return em.createQuery(sql).setParameter("maPhong", maPhong).getResultList();
    }
    
    public QlMayTinh getById(QlMayTinhPK id){
        return em.find(QlMayTinh.class, id);
    }
    
    public boolean addNew(QlMayTinh qlMayTinh){
        em.getTransaction().begin();
        em.persist(qlMayTinh);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean update(QlMayTinh qlMayTinh){
        em.getTransaction().begin();
        em.merge(qlMayTinh);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean delete(QlMayTinhPK id){
        em.getTransaction().begin();
        QlMayTinh b = em.find(QlMayTinh.class, id);
        em.remove(b);
        em.getTransaction().commit();
        return true;
    }
}
