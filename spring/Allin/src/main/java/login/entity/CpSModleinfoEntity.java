package login.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cp_s_modleinfo", schema = "centerserviceplatform", catalog = "")
public class CpSModleinfoEntity {
    private String pkId;
    private String fkIdUserInfo;
    private String fkIdUserOrg;
    private Timestamp createTime;
    private Timestamp editTime;
    private String editUser;
    private String fkIdParentKey;
    private String state;
    private String fkId;
    private String workFlowId;
    private String name;
    private String alias;
    private String assemblyType;
    private String visibility;
    private String isDefault;
    private String description;
    private String url;
    private Integer displayIndex;
    private String parentId;
    private String remark;
    private String downTag;

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
    @Column(name = "fkID_UserOrg")
    public String getFkIdUserOrg() {
        return fkIdUserOrg;
    }

    public void setFkIdUserOrg(String fkIdUserOrg) {
        this.fkIdUserOrg = fkIdUserOrg;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "EditTime")
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "EditUser")
    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser;
    }

    @Basic
    @Column(name = "fkID_ParentKey")
    public String getFkIdParentKey() {
        return fkIdParentKey;
    }

    public void setFkIdParentKey(String fkIdParentKey) {
        this.fkIdParentKey = fkIdParentKey;
    }

    @Basic
    @Column(name = "State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "fkID")
    public String getFkId() {
        return fkId;
    }

    public void setFkId(String fkId) {
        this.fkId = fkId;
    }

    @Basic
    @Column(name = "WorkFlowID")
    public String getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId;
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
    @Column(name = "Alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "AssemblyType")
    public String getAssemblyType() {
        return assemblyType;
    }

    public void setAssemblyType(String assemblyType) {
        this.assemblyType = assemblyType;
    }

    @Basic
    @Column(name = "Visibility")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Basic
    @Column(name = "IsDefault")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "DisplayIndex")
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }

    @Basic
    @Column(name = "ParentID")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "DownTag")
    public String getDownTag() {
        return downTag;
    }

    public void setDownTag(String downTag) {
        this.downTag = downTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpSModleinfoEntity that = (CpSModleinfoEntity) o;

        if (pkId != null ? !pkId.equals(that.pkId) : that.pkId != null) return false;
        if (fkIdUserInfo != null ? !fkIdUserInfo.equals(that.fkIdUserInfo) : that.fkIdUserInfo != null) return false;
        if (fkIdUserOrg != null ? !fkIdUserOrg.equals(that.fkIdUserOrg) : that.fkIdUserOrg != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (editTime != null ? !editTime.equals(that.editTime) : that.editTime != null) return false;
        if (editUser != null ? !editUser.equals(that.editUser) : that.editUser != null) return false;
        if (fkIdParentKey != null ? !fkIdParentKey.equals(that.fkIdParentKey) : that.fkIdParentKey != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (fkId != null ? !fkId.equals(that.fkId) : that.fkId != null) return false;
        if (workFlowId != null ? !workFlowId.equals(that.workFlowId) : that.workFlowId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (assemblyType != null ? !assemblyType.equals(that.assemblyType) : that.assemblyType != null) return false;
        if (visibility != null ? !visibility.equals(that.visibility) : that.visibility != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (displayIndex != null ? !displayIndex.equals(that.displayIndex) : that.displayIndex != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (downTag != null ? !downTag.equals(that.downTag) : that.downTag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkId != null ? pkId.hashCode() : 0;
        result = 31 * result + (fkIdUserInfo != null ? fkIdUserInfo.hashCode() : 0);
        result = 31 * result + (fkIdUserOrg != null ? fkIdUserOrg.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (editTime != null ? editTime.hashCode() : 0);
        result = 31 * result + (editUser != null ? editUser.hashCode() : 0);
        result = 31 * result + (fkIdParentKey != null ? fkIdParentKey.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (fkId != null ? fkId.hashCode() : 0);
        result = 31 * result + (workFlowId != null ? workFlowId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (assemblyType != null ? assemblyType.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (displayIndex != null ? displayIndex.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (downTag != null ? downTag.hashCode() : 0);
        return result;
    }
}
