package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ActivityservemealMapper;
import org.xhh.db.domain.Activityserve;
import org.xhh.db.domain.Activityservemeal;
import org.xhh.db.domain.ActivityservemealExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivityservemealService {
    @Resource
    private ActivityservemealMapper activityservemealMapper;

    public void add(Activityservemeal activityservemeal) {
        activityservemeal.setCreatetime(LocalDateTime.now());
        activityservemealMapper.insertSelective(activityservemeal);
    }

    public List<Activityservemeal> querySelective(String name, Integer page, Integer limit) {
        ActivityservemealExample activityservemealExample = new ActivityservemealExample();
        ActivityservemealExample.Criteria criteria = activityservemealExample.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }

        PageHelper.startPage(page, limit);
        return activityservemealMapper.selectByExample(activityservemealExample);
    }

    public void deleteById(Integer id) {
        activityservemealMapper.deleteByPrimaryKey(id);
    }

    public void updateById(Activityservemeal activityservemeal) {
        activityservemealMapper.updateByPrimaryKeySelective(activityservemeal);
    }

    public Activityservemeal queryById(Integer id) {
        return activityservemealMapper.selectByPrimaryKeySelective(id);
    }

}
