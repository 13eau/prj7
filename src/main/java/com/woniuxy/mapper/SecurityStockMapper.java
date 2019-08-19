package com.woniuxy.mapper;

import com.woniuxy.entity.SecurityStock;
import com.woniuxy.entity.SecurityStockExample;
import com.woniuxy.entity.SecurityStockKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecurityStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(SecurityStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(SecurityStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(SecurityStockKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(SecurityStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(SecurityStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<SecurityStock> selectByExample(SecurityStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    SecurityStock selectByPrimaryKey(SecurityStockKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") SecurityStock record, @Param("example") SecurityStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") SecurityStock record, @Param("example") SecurityStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(SecurityStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table security_stock
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(SecurityStock record);
}