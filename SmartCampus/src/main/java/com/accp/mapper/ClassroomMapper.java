package com.accp.mapper;

import com.accp.domain.Classroom;
import com.accp.domain.ClassroomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClassroomMapper {
	List<Classroom> classroominfo(Classroom record);//查询教室信息
	Classroom classroomnameEndByfid(Integer floorid);//根据楼层id查询该层最末一间教室名
	int classroomnubByfid(Integer floorid);//根据楼层id查询教室数量
	int classroominsert(Classroom record);
	
    long countByExample(ClassroomExample example);

    int deleteByExample(ClassroomExample example);

    int deleteByPrimaryKey(Integer classroomid);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    List<Classroom> selectByExample(ClassroomExample example);

    Classroom selectByPrimaryKey(Integer classroomid);

    int updateByExampleSelective(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByExample(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}