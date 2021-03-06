package com.woniuxy.mapper;

import com.woniuxy.entity.Painting;
import com.woniuxy.entity.PaintingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaintingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer p7Ptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(Painting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(Painting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Painting> selectByExampleWithBLOBs(PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Painting> selectByExample(PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    Painting selectByPrimaryKey(Integer p7Ptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") Painting record, @Param("example") PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Painting record, @Param("example") PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") Painting record, @Param("example") PaintingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(Painting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Painting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table painting
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(Painting record);
}