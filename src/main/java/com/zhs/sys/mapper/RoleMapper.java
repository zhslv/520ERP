package com.zhs.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhs.sys.domain.Role;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ZHS
 * @since 2020-03-23
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据角色ID删除sys_role_permission
     * @param id
     */
    void deleteRolePermissionByRid(Serializable id);

    /**
     * 根据角色ID删除sys_role_user
     * @param id
     */
    void deleteRoleUserByRid(Serializable id);

    /**
     * 根据角色ID查询当前角色拥有的所有的权限或菜单ID
     */
    List<Integer> queryRolePermissionIdsByRid(Integer roleId);
}
