package com.ps.bicyclemanagebicycleservice.controller;

import com.ps.allapp.domain.Result;
import com.ps.bicyclemanagebicycleservice.service.ManageBicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ZZH
 * @date 2019/8/13 19:17
 */
@RestController
public class ManageBicycleController {

    @Autowired
    private ManageBicycleService manageBicycleService;

    /**
     * 历史故障（用户提交单车的故障）
     */
    @GetMapping("/history-malfunction")
    public Result historyMalfunction(@RequestParam("userId") int userId){

        Result result  = manageBicycleService.historyMalfunction(userId);
        return result;
    }

    /**
     * 故障的详情资料
     */
    @GetMapping("/fault-details")
    public Result faultDetails(@RequestParam("id") int id){

        Result result  = manageBicycleService.faultDetails(id);
        return result;
    }

    /**
     *  免密支付
     * @param id
     * @return
     */
    @GetMapping("/confidential-payment")
    public Result confidentialPayment(@RequestParam("id") int id){

        Result result  = manageBicycleService.faultDetails(id);
        return result;
    }





}
