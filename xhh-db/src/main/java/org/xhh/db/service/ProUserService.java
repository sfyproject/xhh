package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ProUserMapper;
import org.xhh.db.domain.ProContent;
import org.xhh.db.domain.ProUser;
import org.xhh.db.domain.ProUserExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 11:04 2019-6-3
 */
@Service
public class ProUserService {

    @Resource
    private ProUserMapper proUserMapper;

    public void add(ProUser proUser) {
        proUser.setAddTime(LocalDateTime.now());
        proUser.setUpdateTime(LocalDateTime.now());
        proUserMapper.insertSelective(proUser);
    }

    public List<ProUser> querySelective(String user, String status, Integer page, Integer limit, String sort, String order) {
        ProUserExample example = new ProUserExample();
        ProUserExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(user)) {
            criteria.andUserLike("%" + user + "%");
        }
        if (!StringUtils.isEmpty(status)) {
            criteria.andStatusEqualTo("%" + status + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return proUserMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        proUserMapper.deleteByPrimaryKey(id);
    }

    public void updateById(ProUser proUser) {
        proUserMapper.updateByPrimaryKeySelective(proUser);
    }

    public Object queryById(Integer id) {
        return proUserMapper.selectByPrimaryKeySelective(id);
    }

}
