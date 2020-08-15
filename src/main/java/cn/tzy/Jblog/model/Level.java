package cn.tzy.Jblog.model;

import org.apache.ibatis.type.Alias;

@Alias("level")
public class Level {

    private String doubLevel;
    private String levelCount;

    public String getDoubLevel() {
        return doubLevel;
    }

    public void setDoubLevel(String doubLevel) {
        this.doubLevel = doubLevel;
    }

    public String getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(String levelCount) {
        this.levelCount = levelCount;
    }
}
