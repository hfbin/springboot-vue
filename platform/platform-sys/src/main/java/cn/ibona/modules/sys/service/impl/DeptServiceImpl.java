package cn.ibona.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.ibona.common.utils.PageUtils;
import cn.ibona.common.utils.Query;

import cn.ibona.modules.sys.dao.DeptDao;
import cn.ibona.modules.sys.entity.DeptEntity;
import cn.ibona.modules.sys.service.DeptService;


@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptDao, DeptEntity> implements DeptService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DeptEntity> page = this.selectPage(
                new Query<DeptEntity>(params).getPage(),
                new EntityWrapper<DeptEntity>()
        );

        return new PageUtils(page);
    }

}
