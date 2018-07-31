package com.travel.dao;

import com.travel.entity.UserInfo;
import com.travel.entity.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    UserInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) UserInfo record, @Param ( "example" ) UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) UserInfo record, @Param ( "example" ) UserInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserInfo record);
}