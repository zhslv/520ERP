package com.zhs.sys.vo;

import com.zhs.sys.domain.Permission;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PermissionVo extends Permission {
    private static final long serialVersionUID = 1L;
}
