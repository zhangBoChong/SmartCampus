package com.accp.mapper;

import com.accp.domain.Ctc;
import com.accp.domain.CtcExample;
import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CtcMapper {
	List<Ctc> queryBycourseId(Integer courseid);
    long countByExample(CtcExample example);

    int deleteByExample(CtcExample example);

    int deleteByPrimaryKey(Integer ccid);

    int insert(Ctc record);

    int insertSelective(Ctc record);

    List<Ctc> selectByExample(CtcExample example);

    Ctc selectByPrimaryKey(Integer ccid);

    int updateByExampleSelective(@Param("record") Ctc record, @Param("example") CtcExample example);

    int updateByExample(@Param("record") Ctc record, @Param("example") CtcExample example);

    int updateByPrimaryKeySelective(Ctc record);

    int updateByPrimaryKey(Ctc record);
}