package com.ps.bicyclemanagebicycleservice.service;

import com.ps.allapp.domain.Fault;
import com.ps.allapp.domain.Result;
import com.ps.bicyclemanagebicycleservice.mapper.ManageBicycleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ZZH
 * @date 2019/8/13 19:17
 */
@Service
public class ManageBicycleService {

    @Autowired
    private ManageBicycleMapper manageBicycleMapper;

    /**
     * 历史故障（用户提交单车的故障）
     * @param userId
     * @return
     */
    public Result historyMalfunction(int userId) {
        Result result = new Result();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");


        List<Fault> list = manageBicycleMapper.historyMalfunction(userId);
        for (Fault fault: list) {
            System.out.println(fault);

            String format = simpleDateFormat.format(fault.getPublishTime().getTime());
            System.out.println(format);


//            fault.setPublishTime(format);
        }

        System.out.println(list);

        result.setData(list);
        return result;
    }

    /**
     * 故障的详情资料
     * @param id
     * @return
     */
    public Result faultDetails(int id) {
        Result result = new Result();

        Fault fault = manageBicycleMapper.faultDetails(id);
        System.out.println(fault);

        result.setData(fault);
        return result;
    }
}
