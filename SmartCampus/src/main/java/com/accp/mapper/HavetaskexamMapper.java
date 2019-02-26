package com.accp.mapper;

import com.accp.domain.Havetaskexam;
import com.accp.domain.HavetaskexamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HavetaskexamMapper {
	//考试信息（分数、考试名称）
	List<Havetaskexam> examscoreBysid(Integer sid);
	List<Havetaskexam> examscoreBysidTow(Integer sid);
	Double selectexamscore(Integer examinationId);
	//一个题目的错误次数
	int chmistakecountBytopicid(Integer topicid);
	//题目做错的学员集合
	List<Havetaskexam> chmistakestudents(Integer topicid);
	
    long countByExample(HavetaskexamExample example);

    int deleteByExample(HavetaskexamExample example);

    int insert(Havetaskexam record);

    int insertSelective(Havetaskexam record);

    List<Havetaskexam> selectByExample(HavetaskexamExample example);

    int updateByExampleSelective(@Param("record") Havetaskexam record, @Param("example") HavetaskexamExample example);

    int updateByExample(@Param("record") Havetaskexam record, @Param("example") HavetaskexamExample example);
}