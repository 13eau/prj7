package com.woniuxy.mapper;

import com.woniuxy.entity.Security;
import com.woniuxy.entity.SecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer plSid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(Security record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(Security record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Security> selectByExampleWithBLOBs(SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Security> selectByExample(SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    Security selectByPrimaryKey(Integer plSid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") Security record, @Param("example") SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Security record, @Param("example") SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") Security record, @Param("example") SecurityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(Security record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Security record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(Security record);
}