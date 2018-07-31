package com.travel.dao;

import com.travel.entity.PublicEventRecord;
import com.travel.entity.PublicEventRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicEventRecordMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PublicEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PublicEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int insert(PublicEventRecord record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PublicEventRecord record);

    /**
     *
     * @mbg.generated
     */
    List<PublicEventRecord> selectByExample(PublicEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    PublicEventRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param ( "record" ) PublicEventRecord record, @Param ( "example" ) PublicEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param ( "record" ) PublicEventRecord record, @Param ( "example" ) PublicEventRecordExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PublicEventRecord record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PublicEventRecord record);
}