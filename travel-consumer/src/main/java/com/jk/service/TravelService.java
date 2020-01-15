package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @InterfaceName: TravelService
 * @Author: zs
 * @Description: 接口作用描述
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
@FeignClient(value = "cloud-provider")
public interface TravelService extends TravelServer{

}
