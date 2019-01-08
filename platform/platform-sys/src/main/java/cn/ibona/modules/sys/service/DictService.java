package cn.ibona.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.modules.sys.entity.DictEntity;

import java.util.Map;

/**
 * 数据字典表
 *
 * @author qiao
 * @email qiaogqiang@163.com
 * @date 2019-01-08 16:13:22
 */
public interface DictService extends IService<DictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

