package com.mars.system.api;

import com.mars.system.api.domain.SysLogininfor;
import com.mars.system.api.domain.SysOperLog;

/**
 * 日志服务
 *
 * @author Lion Li
 */
public interface RemoteLogService {

    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     * @return 结果
     */
    Boolean saveLog(SysOperLog sysOperLog);

    /**
     * 保存访问记录
     *
     * @param sysLogininfor 访问实体
     * @return 结果
     */
    Boolean saveLogininfor(SysLogininfor sysLogininfor);
}
