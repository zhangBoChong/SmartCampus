package com.accp.mapper;

import com.accp.domain.Studentinfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudentinfoMapper {
    List<Studentinfo> queryAllStudent();
    
    Character characterName(int characterId);
    
    List<Studentinfo> queryStudent(@Param("sname")String sname,@Param("age1")Integer age1,@Param("age2")Integer age2,@Param("sex")Integer sex,@Param("characterId")Integer characterId);
    
    int updateStudent1(int sid);
    
    int updateStudent2(int sid);
    
    int updateStudent3();
    
    int updateStudent4();
    
    List<Studentinfo> queryStudent2();
    
    int updateStudent5();
    
    int studentQuantity();
    
    int studentQuantity2();

    int updateStudent6(int sid);
}