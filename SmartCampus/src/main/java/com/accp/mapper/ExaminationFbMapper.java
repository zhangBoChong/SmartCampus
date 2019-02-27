package com.accp.mapper;

import com.accp.domain.ExaminationFb;
import com.accp.domain.ExaminationFbExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExaminationFbMapper {
	//学员参与的所有考试
	List<ExaminationFb> selectBycsid(Integer csid);
	
	int insertExaFb(@Param("examination_id") int examination_id,@Param("csId") int csId);
	

    long countByExample(ExaminationFbExample example);

    int deleteByExample(ExaminationFbExample example);

    int deleteByPrimaryKey(Integer examinationFbId);

    int insert(ExaminationFb record);

    int insertSelective(ExaminationFb record);

    List<ExaminationFb> selectByExample(ExaminationFbExample example);

    ExaminationFb selectByPrimaryKey(Integer examinationFbId);

    int updateByExampleSelective(@Param("record") ExaminationFb record, @Param("example") ExaminationFbExample example);

    int updateByExample(@Param("record") ExaminationFb record, @Param("example") ExaminationFbExample example);

    int updateByPrimaryKeySelective(ExaminationFb record);

    int updateByPrimaryKey(ExaminationFb record);
}