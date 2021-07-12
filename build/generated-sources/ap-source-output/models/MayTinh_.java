package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.QlMayTinh;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T17:08:19")
@StaticMetamodel(MayTinh.class)
public class MayTinh_ { 

    public static volatile SingularAttribute<MayTinh, String> cauHinh;
    public static volatile SingularAttribute<MayTinh, Integer> soHieu;
    public static volatile SingularAttribute<MayTinh, String> xuatXu;
    public static volatile SingularAttribute<MayTinh, Integer> namNhap;
    public static volatile SingularAttribute<MayTinh, String> ten;
    public static volatile CollectionAttribute<MayTinh, QlMayTinh> qlMayTinhCollection;

}