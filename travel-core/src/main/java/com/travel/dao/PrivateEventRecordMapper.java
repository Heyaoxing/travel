package com.travel.dao;

import com.travel.entity.PrivateEventRecord;
import com.travel.entity.PrivateEventRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivateEventRecordMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PrivateEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PrivateEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(PrivateEventRecord record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PrivateEventRecord record);

    /**
     *
     * @mbg.generated
     */
    List<PrivateEventRecord> selectByExample(PrivateEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    PrivateEventRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) PrivateEventRecord record, @Param ( "example" ) PrivateEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) PrivateEventRecord record, @Param ( "example" ) PrivateEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PrivateEventRecord record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PrivateEventRecord record);
}