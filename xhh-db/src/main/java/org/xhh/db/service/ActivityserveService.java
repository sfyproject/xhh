package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ActivityserveMapper;
import org.xhh.db.domain.Activityserve;
import org.xhh.db.domain.ActivityserveExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivityserveService {
    @Resource
    private ActivityserveMapper ActivityserveMapper;

    public void add(Activityserve Activityserve) {
        Activityserve.setCreatetime(LocalDateTime.now());
        ActivityserveMapper.insertSelective(Activityserve);
    }

    public List<Activityserve> querySelective(String name, Integer page, Integer limit) {
        ActivityserveExample ActivityserveExample = new ActivityserveExample();
        ActivityserveExample.Criteria criteria = ActivityserveExample.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }

        PageHelper.startPage(page, limit);
        return ActivityserveMapper.selectByExample(ActivityserveExample);
    }

    public void deleteById(Integer id) {
        ActivityserveMapper.deleteByPrimaryKey(id);
    }

    public void updateById(Activityserve Activityserve) {
        ActivityserveMapper.updateByPrimaryKeySelective(Activityserve);
    }

    public Activityserve queryById(Integer id) {
        return ActivityserveMapper.selectByPrimaryKeySelective(id);
    }

}
