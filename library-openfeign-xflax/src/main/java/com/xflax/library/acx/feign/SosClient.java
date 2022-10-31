package com.xflax.library.acx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "sosClient", url = "${feign.client.url.sosClient}")
public interface SosClient {

    @RequestMapping(method = RequestMethod.GET, value = "/oauth")
    String getTokenOauth();
}
