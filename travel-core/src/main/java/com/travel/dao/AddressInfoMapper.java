package com.travel.dao;

import com.travel.entity.AddressInfo;
import com.travel.entity.AddressInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(AddressInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(AddressInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String addressUid);

    /**
     *
     * @mbg.generated
     */
    int insert(AddressInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(AddressInfo record);

    /**
     *
     * @mbg.generated
     */
    List<AddressInfo> selectByExample(AddressInfoExample example);

    /**
     *
     * @mbg.generated
     */
    AddressInfo selectByPrimaryKey(String addressUid);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) AddressInfo record, @Param ( "example" ) AddressInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) AddressInfo record, @Param ( "example" ) AddressInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AddressInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AddressInfo record);
}