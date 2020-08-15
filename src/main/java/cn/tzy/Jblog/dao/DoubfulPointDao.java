package cn.tzy.Jblog.dao;


import cn.tzy.Jblog.model.DoubfulPoint;
import cn.tzy.Jblog.model.Level;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DoubfulPointDao {


    List<DoubfulPoint> selectByIdAndStatus();

}
