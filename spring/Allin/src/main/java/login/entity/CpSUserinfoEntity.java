package login.entity;

import javax.persistence.*;

@Entity
@Table(name = "cp_s_userinfo", schema = "centerserviceplatform", catalog = "")
public class CpSUserinfoEntity {
    private String pkId;
    private String fkIdOrg;
    private String name;
    private String no;
    private String password;
    private String mobile;
    private String email;
    private String qq;
    private String status;
    private String wb;
    private String py;
    private Integer userStar;
    private String photo;
    private String remark;

    @Id
    @Column(name = "pkID")
    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fkID_Org")
    public String getFkIdOrg() {
        return fkIdOrg;
    }

    public void setFkIdOrg(String fkIdOrg) {
        this.fkIdOrg = fkIdOrg;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NO")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "QQ")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "WB")
    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    @Basic
    @Column(name = "PY")
    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    @Basic
    @Column(name = "UserStar")
    public Integer getUserStar() {
        return userStar;
    }

    public void setUserStar(Integer userStar) {
        this.userStar = userStar;
    }

    @Basic
    @Column(name = "Photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpSUserinfoEntity that = (CpSUserinfoEntity) o;

        if (pkId != null ? !pkId.equals(that.pkId) : that.pkId != null) return false;
        if (fkIdOrg != null ? !fkIdOrg.equals(that.fkIdOrg) : that.fkIdOrg != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (no != null ? !no.equals(that.no) : that.no != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (wb != null ? !wb.equals(that.wb) : that.wb != null) return false;
        if (py != null ? !py.equals(that.py) : that.py != null) return false;
        if (userStar != null ? !userStar.equals(that.userStar) : that.userStar != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkId != null ? pkId.hashCode() : 0;
        result = 31 * result + (fkIdOrg != null ? fkIdOrg.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (no != null ? no.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (wb != null ? wb.hashCode() : 0);
        result = 31 * result + (py != null ? py.hashCode() : 0);
        result = 31 * result + (userStar != null ? userStar.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
