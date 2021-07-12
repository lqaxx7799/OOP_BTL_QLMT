/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "phong_hoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhongHoc.findAll", query = "SELECT p FROM PhongHoc p"),
    @NamedQuery(name = "PhongHoc.findByMaPhong", query = "SELECT p FROM PhongHoc p WHERE p.maPhong = :maPhong"),
    @NamedQuery(name = "PhongHoc.findByTenPhong", query = "SELECT p FROM PhongHoc p WHERE p.tenPhong = :tenPhong"),
    @NamedQuery(name = "PhongHoc.findBySoMay", query = "SELECT p FROM PhongHoc p WHERE p.soMay = :soMay")})
public class PhongHoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma_phong")
    private Integer maPhong;
    @Basic(optional = false)
    @Column(name = "ten_phong")
    private String tenPhong;
    @Basic(optional = false)
    @Column(name = "so_may")
    private int soMay;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phongHoc")
    private Collection<QlMayTinh> qlMayTinhCollection;

    public PhongHoc() {
    }

    public PhongHoc(Integer maPhong) {
        this.maPhong = maPhong;
    }

    public PhongHoc(Integer maPhong, String tenPhong, int soMay) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soMay = soMay;
    }

    public Integer getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(Integer maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    @XmlTransient
    public Collection<QlMayTinh> getQlMayTinhCollection() {
        return qlMayTinhCollection;
    }

    public void setQlMayTinhCollection(Collection<QlMayTinh> qlMayTinhCollection) {
        this.qlMayTinhCollection = qlMayTinhCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maPhong != null ? maPhong.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhongHoc)) {
            return false;
        }
        PhongHoc other = (PhongHoc) object;
        if ((this.maPhong == null && other.maPhong != null) || (this.maPhong != null && !this.maPhong.equals(other.maPhong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.PhongHoc[ maPhong=" + maPhong + " ]";
    }
    
}
