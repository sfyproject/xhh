package org.xhh.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xhh.db.domain.ProTask;
import org.xhh.db.domain.ProTaskExample;

public interface ProTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    long countByExample(ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int deleteByExample(ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int insert(ProTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int insertSelective(ProTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    ProTask selectOneByExample(ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    ProTask selectOneByExampleSelective(@Param("example") ProTaskExample example, @Param("selective") ProTask.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    List<ProTask> selectByExampleSelective(@Param("example") ProTaskExample example, @Param("selective") ProTask.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    List<ProTask> selectByExample(ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    ProTask selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ProTask.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    ProTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProTask record, @Param("example") ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProTask record, @Param("example") ProTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_task
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProTask record);
}