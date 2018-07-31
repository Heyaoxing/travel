package com.travel.service;

import model.request.CreateJobRequest;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/7/31 15:46
 */
public interface JobService {

    /**
     * 动态创建job
     *
     * @param request
     * @return
     */
    Boolean createTravelJob(CreateJobRequest request);


    /**
     * 创建停留job
     *
     * @param request
     * @return
     */
    Boolean createStayJob(CreateJobRequest request);

}
