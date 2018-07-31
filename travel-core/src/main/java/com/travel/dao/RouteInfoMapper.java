package com.travel.dao;

import com.travel.entity.RouteInfo;
import com.travel.entity.RouteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(RouteInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(RouteInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(RouteInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(RouteInfo record);

    /**
     *
     * @mbg.generated
     */
    List<RouteInfo> selectByExample(RouteInfoExample example);

    /**
     *
     * @mbg.generated
     */
    RouteInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) RouteInfo record, @Param ( "example" ) RouteInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) RouteInfo record, @Param ( "example" ) RouteInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RouteInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RouteInfo record);
}