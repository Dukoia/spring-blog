package cn.tzy.Jblog.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("doubfulpoint")
public class DoubfulPoint {

    private String userId;
    private String projId;
    private String projName;
    private String implCount;

    private List<Level> levels;

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getImplCount() {
        return implCount;
    }

    public void setImplCount(String implCount) {
        this.implCount = implCount;
    }






}
