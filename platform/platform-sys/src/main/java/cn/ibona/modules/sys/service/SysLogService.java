/**
 */

package cn.ibona.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * 
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
