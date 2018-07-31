package com.travel.dao;

import com.travel.entity.CaptureRecord;
import com.travel.entity.CaptureRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaptureRecordMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(CaptureRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(CaptureRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(CaptureRecord record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(CaptureRecord record);

    /**
     *
     * @mbg.generated
     */
    List<CaptureRecord> selectByExample(CaptureRecordExample example);

    /**
     *
     * @mbg.generated
     */
    CaptureRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) CaptureRecord record, @Param ( "example" ) CaptureRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) CaptureRecord record, @Param ( "example" ) CaptureRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CaptureRecord record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CaptureRecord record);
}