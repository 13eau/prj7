package com.woniuxy.entity;

public class SplicingStock extends SplicingStockKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column splicing_stock.count
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column splicing_stock.company
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    private Integer company;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column splicing_stock.count
     *
     * @return the value of splicing_stock.count
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column splicing_stock.count
     *
     * @param count the value for splicing_stock.count
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column splicing_stock.company
     *
     * @return the value of splicing_stock.company
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column splicing_stock.company
     *
     * @param company the value for splicing_stock.company
     *
     * @mbggenerated Mon Aug 19 19:23:43 CST 2019
     */
    public void setCompany(Integer company) {
        this.company = company;
    }
}