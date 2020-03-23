package com.zhs.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhs.sys.domain.Permission;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZHS
 * @since 2020-03-16
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    /**
     * /根据权限或菜单ID删除权限表各和角色的关系表里面的数据
     * @param id
     */
    void deleteRolePermissionByPid(@Param("id") Serializable id);
}
