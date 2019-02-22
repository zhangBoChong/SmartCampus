package com.accp.mapper;

import com.accp.domain.VessionGradeMajorid;
import com.accp.domain.VessionGradeMajoridExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VessionGradeMajoridMapper {
	List<VessionGradeMajorid> queryVessionGradeMajoridByBid(Integer bid);

    long countByExample(VessionGradeMajoridExample example);

    int deleteByExample(VessionGradeMajoridExample example);

    int deleteByPrimaryKey(Integer vgmid);

    int insert(VessionGradeMajorid record);

    int insertSelective(VessionGradeMajorid record);

    List<VessionGradeMajorid> selectByExample(VessionGradeMajoridExample example);

    VessionGradeMajorid selectByPrimaryKey(Integer vgmid);

    int updateByExampleSelective(@Param("record") VessionGradeMajorid record, @Param("example") VessionGradeMajoridExample example);

    int updateByExample(@Param("record") VessionGradeMajorid record, @Param("example") VessionGradeMajoridExample example);

    int updateByPrimaryKeySelective(VessionGradeMajorid record);

    int updateByPrimaryKey(VessionGradeMajorid record);
}