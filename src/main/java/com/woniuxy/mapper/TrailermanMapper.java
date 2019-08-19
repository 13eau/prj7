package com.woniuxy.mapper;

import com.woniuxy.entity.Trailerman;
import com.woniuxy.entity.TrailermanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrailermanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(TrailermanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(TrailermanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer tmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(Trailerman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(Trailerman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Trailerman> selectByExample(TrailermanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    Trailerman selectByPrimaryKey(Integer tmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") Trailerman record, @Param("example") TrailermanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") Trailerman record, @Param("example") TrailermanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(Trailerman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trailerman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(Trailerman record);
}