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
@Table(name = "may_tinh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MayTinh.findAll", query = "SELECT m FROM MayTinh m"),
    @NamedQuery(name = "MayTinh.findBySoHieu", query = "SELECT m FROM MayTinh m WHERE m.soHieu = :soHieu"),
    @NamedQuery(name = "MayTinh.findByTen", query = "SELECT m FROM MayTinh m WHERE m.ten = :ten"),
    @NamedQuery(name = "MayTinh.findByXuatXu", query = "SELECT m FROM MayTinh m WHERE m.xuatXu = :xuatXu"),
    @NamedQuery(name = "MayTinh.findByNamNhap", query = "SELECT m FROM MayTinh m WHERE m.namNhap = :namNhap"),
    @NamedQuery(name = "MayTinh.findByCauHinh", query = "SELECT m FROM MayTinh m WHERE m.cauHinh = :cauHinh")})
public class MayTinh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "so_hieu")
    private Integer soHieu;
    @Basic(optional = false)
    @Column(name = "ten")
    private String ten;
    @Basic(optional = false)
    @Column(name = "xuat_xu")
    private String xuatXu;
    @Basic(optional = false)
    @Column(name = "nam_nhap")
    private int namNhap;
    @Basic(optional = false)
    @Column(name = "cau_hinh")
    private String cauHinh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mayTinh")
    private Collection<QlMayTinh> qlMayTinhCollection;

    public MayTinh() {
    }

    public MayTinh(Integer soHieu) {
        this.soHieu = soHieu;
    }

    public MayTinh(Integer soHieu, String ten, String xuatXu, int namNhap, String cauHinh) {
        this.soHieu = soHieu;
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.namNhap = namNhap;
        this.cauHinh = cauHinh;
    }

    public Integer getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(Integer soHieu) {
        this.soHieu = soHieu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getNamNhap() {
        return namNhap;
    }

    public void setNamNhap(int namNhap) {
        this.namNhap = namNhap;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
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
        hash += (soHieu != null ? soHieu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MayTinh)) {
            return false;
        }
        MayTinh other = (MayTinh) object;
        if ((this.soHieu == null && other.soHieu != null) || (this.soHieu != null && !this.soHieu.equals(other.soHieu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.MayTinh[ soHieu=" + soHieu + " ]";
    }
    
}
