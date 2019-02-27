package com.accp.mapper;

import com.accp.domain.VessionGradeMajoridCourse;
import com.accp.domain.VessionGradeMajoridCourseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VessionGradeMajoridCourseMapper {
	VessionGradeMajoridCourse selectBycvgmid(Integer cvgmid);
	int insertVessionGradeMajoridCourse(VessionGradeMajoridCourse record);
	List<VessionGradeMajoridCourse> queryVessionGradeMajoridCourseByvgmid(Integer vgmid);
    long countByExample(VessionGradeMajoridCourseExample example);

    int deleteByExample(VessionGradeMajoridCourseExample example);

    int deleteByPrimaryKey(Integer cvgmid);   

    int insertSelective(VessionGradeMajoridCourse record);

    List<VessionGradeMajoridCourse> selectByExample(VessionGradeMajoridCourseExample example);

    VessionGradeMajoridCourse selectByPrimaryKey(Integer cvgmid);

    int updateByExampleSelective(@Param("record") VessionGradeMajoridCourse record, @Param("example") VessionGradeMajoridCourseExample example);

    int updateByExample(@Param("record") VessionGradeMajoridCourse record, @Param("example") VessionGradeMajoridCourseExample example);

    int updateByPrimaryKeySelective(VessionGradeMajoridCourse record);

    int updateByPrimaryKey(VessionGradeMajoridCourse record);

    List<VessionGradeMajoridCourse> queryAll();
}