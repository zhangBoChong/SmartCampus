package com.accp.mapper;

import com.accp.domain.Dccharacter;
import com.accp.domain.DccharacterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DccharacterMapper {
    long countByExample(DccharacterExample example);

    int deleteByExample(DccharacterExample example);

    int deleteByPrimaryKey(Integer dccharacterid);

    int insert(Dccharacter record);

    int insertSelective(Dccharacter record);

    List<Dccharacter> selectByExample(DccharacterExample example);

    Dccharacter selectByPrimaryKey(Integer dccharacterid);

    int updateByExampleSelective(@Param("record") Dccharacter record, @Param("example") DccharacterExample example);

    int updateByExample(@Param("record") Dccharacter record, @Param("example") DccharacterExample example);

    int updateByPrimaryKeySelective(Dccharacter record);

    int updateByPrimaryKey(Dccharacter record);
}