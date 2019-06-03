package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ProUserpayMapper;
import org.xhh.db.domain.ProUserpay;
import org.xhh.db.domain.ProUserpayExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 11:04 2019-6-3
 */
@Service
public class ProUserPayService {

    @Resource
    private ProUserpayMapper proUserpayMapper;

    public void add(ProUserpay proUserpay) {
        proUserpay.setAddTime(LocalDateTime.now());
        proUserpay.setUpdateTime(LocalDateTime.now());
        proUserpayMapper.insertSelective(proUserpay);
    }

    public List<ProUserpay> querySelective(String user, String status, Integer page, Integer limit, String sort, String order) {
        ProUserpayExample example = new ProUserpayExample();
        ProUserpayExample.Criteria criteria = example.createCriteria();

//        if (!StringUtils.isEmpty(user)) {
//            criteria.andUserLike("%" + user + "%");
//        }
        if (!StringUtils.isEmpty(status)) {
            criteria.andStatusEqualTo("%" + status + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return proUserpayMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        proUserpayMapper.deleteByPrimaryKey(id);
    }

    public void updateById(ProUserpay proUserpay) {
        proUserpayMapper.updateByPrimaryKeySelective(proUserpay);
    }

    public Object queryById(Integer id) {
        return proUserpayMapper.selectByPrimaryKeySelective(id);
    }

}
