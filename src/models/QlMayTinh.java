/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "ql_may_tinh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QlMayTinh.findAll", query = "SELECT q FROM QlMayTinh q"),
    @NamedQuery(name = "QlMayTinh.findBySoHieu", query = "SELECT q FROM QlMayTinh q WHERE q.qlMayTinhPK.soHieu = :soHieu"),
    @NamedQuery(name = "QlMayTinh.findByMaPhong", query = "SELECT q FROM QlMayTinh q WHERE q.qlMayTinhPK.maPhong = :maPhong"),
    @NamedQuery(name = "QlMayTinh.findBySoLuong", query = "SELECT q FROM QlMayTinh q WHERE q.soLuong = :soLuong"),
    @NamedQuery(name = "QlMayTinh.findByTinhTrang", query = "SELECT q FROM QlMayTinh q WHERE q.tinhTrang = :tinhTrang")})
public class QlMayTinh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QlMayTinhPK qlMayTinhPK;
    @Basic(optional = false)
    @Column(name = "so_luong")
    private int soLuong;
    @Basic(optional = false)
    @Column(name = "tinh_trang")
    private String tinhTrang;
    @JoinColumn(name = "ma_phong", referencedColumnName = "ma_phong", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PhongHoc phongHoc;
    @JoinColumn(name = "so_hieu", referencedColumnName = "so_hieu", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MayTinh mayTinh;

    public QlMayTinh() {
    }

    public QlMayTinh(QlMayTinhPK qlMayTinhPK) {
        this.qlMayTinhPK = qlMayTinhPK;
    }

    public QlMayTinh(QlMayTinhPK qlMayTinhPK, int soLuong, String tinhTrang) {
        this.qlMayTinhPK = qlMayTinhPK;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public QlMayTinh(int soHieu, int maPhong) {
        this.qlMayTinhPK = new QlMayTinhPK(soHieu, maPhong);
    }

    public QlMayTinhPK getQlMayTinhPK() {
        return qlMayTinhPK;
    }

    public void setQlMayTinhPK(QlMayTinhPK qlMayTinhPK) {
        this.qlMayTinhPK = qlMayTinhPK;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public PhongHoc getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
    }

    public MayTinh getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(MayTinh mayTinh) {
        this.mayTinh = mayTinh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qlMayTinhPK != null ? qlMayTinhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlMayTinh)) {
            return false;
        }
        QlMayTinh other = (QlMayTinh) object;
        if ((this.qlMayTinhPK == null && other.qlMayTinhPK != null) || (this.qlMayTinhPK != null && !this.qlMayTinhPK.equals(other.qlMayTinhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.QlMayTinh[ qlMayTinhPK=" + qlMayTinhPK + " ]";
    }
    
}
