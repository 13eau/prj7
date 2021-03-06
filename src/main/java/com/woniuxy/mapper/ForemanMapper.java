package com.woniuxy.mapper;

import com.woniuxy.entity.Foreman;
import com.woniuxy.entity.ForemanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForemanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(ForemanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(ForemanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer fmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(Foreman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(Foreman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Foreman> selectByExample(ForemanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    Foreman selectByPrimaryKey(Integer fmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") Foreman record, @Param("example") ForemanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") Foreman record, @Param("example") ForemanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(Foreman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foreman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(Foreman record);
}