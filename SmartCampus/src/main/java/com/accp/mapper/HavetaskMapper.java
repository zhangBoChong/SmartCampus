package com.accp.mapper;

import com.accp.domain.Havetask;
import com.accp.domain.HavetaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HavetaskMapper {
	//考试信息（分数、考试名称）
	List<Havetask> examscoreBysid(Integer sid);
	List<Havetask> examscoreBysidTow(Integer sid);
	Double selectexamscore(Integer examinationId);
	//一个题目的错误次数
	int chmistakecountBytopicid(Integer topicid);
	//题目做错的学员集合
	List<Havetask> chmistakestudents(Integer topicid);
	
    long countByExample(HavetaskExample example);

    int deleteByExample(HavetaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(Havetask record);

    int insertSelective(Havetask record);

    List<Havetask> selectByExample(HavetaskExample example);

    Havetask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") Havetask record, @Param("example") HavetaskExample example);

    int updateByExample(@Param("record") Havetask record, @Param("example") HavetaskExample example);

    int updateByPrimaryKeySelective(Havetask record);

    int updateByPrimaryKey(Havetask record);
}