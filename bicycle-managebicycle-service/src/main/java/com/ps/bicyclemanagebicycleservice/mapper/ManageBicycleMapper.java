package com.ps.bicyclemanagebicycleservice.mapper;
import com.ps.allapp.domain.Fault;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZZH
 * @date 2019/8/13 19:18
 */
@Mapper
@Repository
public interface ManageBicycleMapper {

    /**
     *  历史故障（用户提交单车的故障）
     * @param userId
     * @return
     */
    List<Fault> historyMalfunction(int userId);

    /**
     * 故障的详情资料
     * @param id
     * @return
     */
    Fault faultDetails(int id);



}
