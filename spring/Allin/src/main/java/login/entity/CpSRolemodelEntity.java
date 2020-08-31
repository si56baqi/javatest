package login.entity;

import javax.persistence.*;

@Entity
@Table(name = "cp_s_rolemodel", schema = "centerserviceplatform", catalog = "")
public class CpSRolemodelEntity {
    private String pkId;
    private String fkIdUserRole;
    private String fkIdModelInfo;

    @Id
    @Column(name = "pkID")
    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fkID_UserRole")
    public String getFkIdUserRole() {
        return fkIdUserRole;
    }

    public void setFkIdUserRole(String fkIdUserRole) {
        this.fkIdUserRole = fkIdUserRole;
    }

    @Basic
    @Column(name = "fkID_ModelInfo")
    public String getFkIdModelInfo() {
        return fkIdModelInfo;
    }

    public void setFkIdModelInfo(String fkIdModelInfo) {
        this.fkIdModelInfo = fkIdModelInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpSRolemodelEntity that = (CpSRolemodelEntity) o;

        if (pkId != null ? !pkId.equals(that.pkId) : that.pkId != null) return false;
        if (fkIdUserRole != null ? !fkIdUserRole.equals(that.fkIdUserRole) : that.fkIdUserRole != null) return false;
        if (fkIdModelInfo != null ? !fkIdModelInfo.equals(that.fkIdModelInfo) : that.fkIdModelInfo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkId != null ? pkId.hashCode() : 0;
        result = 31 * result + (fkIdUserRole != null ? fkIdUserRole.hashCode() : 0);
        result = 31 * result + (fkIdModelInfo != null ? fkIdModelInfo.hashCode() : 0);
        return result;
    }
}
