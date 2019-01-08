package cn.ibona.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.modules.sys.entity.DeptEntity;

import java.util.Map;

/**
 * 部门管理
 *
 * @author qiao
 * @email qiaogqiang@163.com
 * @date 2019-01-08 15:30:46
 */
public interface DeptService extends IService<DeptEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

