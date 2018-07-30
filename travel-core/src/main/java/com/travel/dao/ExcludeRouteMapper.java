package com.travel.dao;

import com.travel.model.ExcludeRoute;
import com.travel.model.ExcludeRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcludeRouteMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ExcludeRouteExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ExcludeRouteExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(ExcludeRoute record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ExcludeRoute record);

    /**
     *
     * @mbg.generated
     */
    List<ExcludeRoute> selectByExample(ExcludeRouteExample example);

    /**
     *
     * @mbg.generated
     */
    ExcludeRoute selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) ExcludeRoute record, @Param ( "example" ) ExcludeRouteExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) ExcludeRoute record, @Param ( "example" ) ExcludeRouteExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExcludeRoute record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExcludeRoute record);
}