package com.woniuxy.mapper;

import com.woniuxy.entity.Constructionman;
import com.woniuxy.entity.ConstructionmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstructionmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int countByExample(ConstructionmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByExample(ConstructionmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int deleteByPrimaryKey(Integer cscId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insert(Constructionman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int insertSelective(Constructionman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    List<Constructionman> selectByExample(ConstructionmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    Constructionman selectByPrimaryKey(Integer cscId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") Constructionman record, @Param("example") ConstructionmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByExample(@Param("record") Constructionman record, @Param("example") ConstructionmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKeySelective(Constructionman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constructionman
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    int updateByPrimaryKey(Constructionman record);
}