package com.accp.mapper;

import com.accp.domain.Role;
import com.accp.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    //按roleId查询角色表
    List<Role> queryByroleId(@Param("roleId") Integer roleId);

    //查询角色表
    List<Role> queryRole();
    
    //角色分页
    List<Role> rolePage(@Param("start") Integer start,@Param("size") Integer size);
    
    int count();
    
    //删除角色
    int deleteRole(@Param("roleId") Integer roleId);
    
    //修改角色
    int updateRole(@Param("roleName") String roleName,@Param("roleId") Integer roleId);
    
    //添加角色
    int insertrole(List<Role> roleLists);

}