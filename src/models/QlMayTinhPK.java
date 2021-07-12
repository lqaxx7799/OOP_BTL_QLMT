/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Admin
 */
@Embeddable
public class QlMayTinhPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "so_hieu")
    private int soHieu;
    @Basic(optional = false)
    @Column(name = "ma_phong")
    private int maPhong;

    public QlMayTinhPK() {
    }

    public QlMayTinhPK(int soHieu, int maPhong) {
        this.soHieu = soHieu;
        this.maPhong = maPhong;
    }

    public int getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(int soHieu) {
        this.soHieu = soHieu;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) soHieu;
        hash += (int) maPhong;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QlMayTinhPK)) {
            return false;
        }
        QlMayTinhPK other = (QlMayTinhPK) object;
        if (this.soHieu != other.soHieu) {
            return false;
        }
        if (this.maPhong != other.maPhong) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.QlMayTinhPK[ soHieu=" + soHieu + ", maPhong=" + maPhong + " ]";
    }
    
}
