package com.zhs.sys.vo;

import com.zhs.sys.domain.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=false)
public class RoleVo extends Role {
    private static final long serialVersionUID = 1L;

    private Integer page=1;
    private  Integer limit=10;
    private Integer[] ids;//接收多个ids
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
}
