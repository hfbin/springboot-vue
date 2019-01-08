package cn.ibona.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.common.utils.Query;

import cn.ibona.modules.sys.dao.DictDao;
import cn.ibona.modules.sys.entity.DictEntity;
import cn.ibona.modules.sys.service.DictService;


@Service("dictService")
public class DictServiceImpl extends ServiceImpl<DictDao, DictEntity> implements DictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DictEntity> page = this.selectPage(
                new Query<DictEntity>(params).getPage(),
                new EntityWrapper<DictEntity>()
        );

        return new PageUtils(page);
    }

}
