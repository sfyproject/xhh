package org.xhh.db.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.xhh.db.dao.ProContentMapper;
import org.xhh.db.domain.ProContent;
import org.xhh.db.domain.ProContentExample;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 15:43 2019-6-1
 */
@Service
public class ProContentService {

    @Resource
    private ProContentMapper proContentMapper;

    public Integer add(ProContent proContent) {
        proContent.setAddTime(LocalDateTime.now());
        proContent.setUpdateTime(LocalDateTime.now());
        proContentMapper.insertSelective(proContent);
        return proContent.getId();
    }

    public List<ProContent> querySelective(String number, String project, Integer page, Integer limit, String sort, String order) {
        ProContentExample example = new ProContentExample();
        ProContentExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(number)) {
            criteria.andNumberLike("%" + number + "%");
        }
        if (!StringUtils.isEmpty(project)) {
            criteria.andProjectLike("%" + project + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return proContentMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        proContentMapper.deleteByPrimaryKey(id);
    }

    public void updateById(ProContent proContent) {
        proContentMapper.updateByPrimaryKeySelective(proContent);
    }

    public ProContent queryById(Integer id) {
        return proContentMapper.selectByPrimaryKeySelective(id);
    }

}
