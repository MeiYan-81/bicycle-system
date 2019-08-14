package com.ps.allapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author VP
 */
@FeignClient("managebicycle-service")
public interface FaultService {


}
