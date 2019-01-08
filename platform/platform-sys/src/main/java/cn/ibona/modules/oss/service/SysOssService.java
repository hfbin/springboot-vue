package cn.ibona.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
