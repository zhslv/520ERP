package com.zhs.sys.service;

import com.zhs.sys.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZHS
 * @since 2020-03-23
 */
public interface RoleService extends IService<Role> {

    List<Integer> queryRolePermissionIdsByRid(Integer id);

    /**
     * 保存角色和菜单权限之间的关系
     * @param roleId
     * @param ids
     */
    void saveRolePermission(Integer roleId, Integer[] ids);
}
