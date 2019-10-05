package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ActivityMapper;
import org.xhh.db.domain.Activity;
import org.xhh.db.domain.ActivityExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivityService {
    @Resource
    private ActivityMapper activityMapper;

    public void add(Activity activity) {
        activity.setCreatetime(LocalDateTime.now());
        activityMapper.insertSelective(activity);
    }

    public List<Activity> querySelective(String name, Integer page, Integer limit) {
        ActivityExample activityExample = new ActivityExample();
        ActivityExample.Criteria criteria = activityExample.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }

        PageHelper.startPage(page, limit);
        return activityMapper.selectByExample(activityExample);
    }

    public void deleteById(Integer id) {
        activityMapper.deleteByPrimaryKey(id);
    }

    public void updateById(Activity activity) {
        activityMapper.updateByPrimaryKeySelective(activity);
    }

    public Activity queryById(Integer id) {
        return activityMapper.selectByPrimaryKeySelective(id);
    }

}
