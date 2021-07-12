package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.QlMayTinh;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T17:08:19")
@StaticMetamodel(PhongHoc.class)
public class PhongHoc_ { 

    public static volatile SingularAttribute<PhongHoc, Integer> soMay;
    public static volatile SingularAttribute<PhongHoc, String> tenPhong;
    public static volatile SingularAttribute<PhongHoc, Integer> maPhong;
    public static volatile CollectionAttribute<PhongHoc, QlMayTinh> qlMayTinhCollection;

}