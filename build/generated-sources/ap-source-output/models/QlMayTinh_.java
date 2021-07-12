package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.MayTinh;
import models.PhongHoc;
import models.QlMayTinhPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T17:08:19")
@StaticMetamodel(QlMayTinh.class)
public class QlMayTinh_ { 

    public static volatile SingularAttribute<QlMayTinh, String> tinhTrang;
    public static volatile SingularAttribute<QlMayTinh, MayTinh> mayTinh;
    public static volatile SingularAttribute<QlMayTinh, QlMayTinhPK> qlMayTinhPK;
    public static volatile SingularAttribute<QlMayTinh, Integer> soLuong;
    public static volatile SingularAttribute<QlMayTinh, PhongHoc> phongHoc;

}