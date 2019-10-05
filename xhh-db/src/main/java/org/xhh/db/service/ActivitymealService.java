package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ActivitymealMapper;
import org.xhh.db.domain.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivitymealService {
    @Resource
    private ActivitymealMapper activitymealMapper;

    public void add(Activitymeal activitymeal) {
        activitymeal.setCreateid("1");
        activitymeal.setCreatetime(LocalDateTime.now());
        activitymeal.setUpdateid("2");
        activitymeal.setUpdatetime(LocalDateTime.now());
        activitymealMapper.insertSelective(activitymeal);
    }

    public List<Activitymeal> querySelective(String name, Integer page, Integer limit) {
        ActivitymealExample activityExample = new ActivitymealExample();
        ActivitymealExample.Criteria criteria = activityExample.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }

        PageHelper.startPage(page, limit);
        return activitymealMapper.selectByExample(activityExample);
    }

    public void deleteById(Integer id) {
        activitymealMapper.deleteByPrimaryKey(id);
    }

    public void updateById(Activitymeal activitymeal) {
        activitymealMapper.updateByPrimaryKeySelective(activitymeal);
    }

    public Activitymeal queryById(Integer id) {
        return activitymealMapper.selectByPrimaryKeySelective(id);
    }

}
