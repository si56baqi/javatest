package login.entity;

import javax.persistence.*;

@Entity
@Table(name = "cp_s_usermaprole", schema = "centerserviceplatform", catalog = "")
public class CpSUsermaproleEntity {
    private String pkId;
    private String fkIdUserInfo;
    private String fkIdUserRole;

    @Id
    @Column(name = "pkID")
    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fkID_UserInfo")
    public String getFkIdUserInfo() {
        return fkIdUserInfo;
    }

    public void setFkIdUserInfo(String fkIdUserInfo) {
        this.fkIdUserInfo = fkIdUserInfo;
    }

    @Basic
    @Column(name = "fkID_UserRole")
    public String getFkIdUserRole() {
        return fkIdUserRole;
    }

    public void setFkIdUserRole(String fkIdUserRole) {
        this.fkIdUserRole = fkIdUserRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpSUsermaproleEntity that = (CpSUsermaproleEntity) o;

        if (pkId != null ? !pkId.equals(that.pkId) : that.pkId != null) return false;
        if (fkIdUserInfo != null ? !fkIdUserInfo.equals(that.fkIdUserInfo) : that.fkIdUserInfo != null) return false;
        if (fkIdUserRole != null ? !fkIdUserRole.equals(that.fkIdUserRole) : that.fkIdUserRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkId != null ? pkId.hashCode() : 0;
        result = 31 * result + (fkIdUserInfo != null ? fkIdUserInfo.hashCode() : 0);
        result = 31 * result + (fkIdUserRole != null ? fkIdUserRole.hashCode() : 0);
        return result;
    }
}
