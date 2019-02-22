package com.accp.mapper;

import com.accp.domain.Floor;
import com.accp.domain.FloorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FloorMapper {
	List<Floor> floorall();
	Floor maxfloornumber();//最高的楼层数
	Floor floornubifexist(Integer floorid);//该层是否存在
	int floornumberinsert(Floor record);
	
    long countByExample(FloorExample example);

    int deleteByExample(FloorExample example);

    int deleteByPrimaryKey(Integer floorid);

    int insert(Floor record);

    int insertSelective(Floor record);

    List<Floor> selectByExample(FloorExample example);

    Floor selectByPrimaryKey(Integer floorid);

    int updateByExampleSelective(@Param("record") Floor record, @Param("example") FloorExample example);

    int updateByExample(@Param("record") Floor record, @Param("example") FloorExample example);

    int updateByPrimaryKeySelective(Floor record);

    int updateByPrimaryKey(Floor record);
}