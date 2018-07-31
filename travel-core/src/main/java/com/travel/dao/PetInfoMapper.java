package com.travel.dao;

import com.travel.entity.PetInfo;
import com.travel.entity.PetInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PetInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PetInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(PetInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PetInfo record);

    /**
     *
     * @mbg.generated
     */
    List<PetInfo> selectByExample(PetInfoExample example);

    /**
     *
     * @mbg.generated
     */
    PetInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) PetInfo record, @Param ( "example" ) PetInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) PetInfo record, @Param ( "example" ) PetInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PetInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PetInfo record);
}