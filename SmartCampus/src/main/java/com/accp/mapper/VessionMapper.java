package com.accp.mapper;

import com.accp.domain.Vession;
import com.accp.domain.VessionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VessionMapper {
	int addVession(String vname);
	List<Vession> queryVessions();
    long countByExample(VessionExample example);

    int deleteByExample(VessionExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vession record);

    int insertSelective(Vession record);

    List<Vession> selectByExample(VessionExample example);

    Vession selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vession record, @Param("example") VessionExample example);

    int updateByExample(@Param("record") Vession record, @Param("example") VessionExample example);

    int updateByPrimaryKeySelective(Vession record);

    int updateByPrimaryKey(Vession record);
}