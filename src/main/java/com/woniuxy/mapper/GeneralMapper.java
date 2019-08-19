package com.woniuxy.mapper;

import com.woniuxy.entity.General;
import com.woniuxy.entity.GeneralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(GeneralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(GeneralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(General record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(General record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<General> selectByExample(GeneralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    General selectByPrimaryKey(Integer projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") General record, @Param("example") GeneralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") General record, @Param("example") GeneralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(General record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(General record);
}