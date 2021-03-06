package com.accp.mapper;

import com.accp.domain.Examination;
import com.accp.domain.ExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExaminationMapper {
	//考试试卷信息（课程+教员）
	Examination selectexamByexaminationId(Integer examinationId);
	Examination selectexamByexaminationIdTow(Integer examinationId);
	List<Examination> chaexamBytidtan(Integer tid);
	
	int insertExa(Examination exa);
	

    long countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);

    int deleteByPrimaryKey(Integer examinationId);

    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExample(ExaminationExample example);

    Examination selectByPrimaryKey(Integer examinationId);

    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByPrimaryKeySelective(Examination record);

    int updateByPrimaryKey(Examination record);
}