package com.xflax.library.acx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "stsClient", url = "${feign.client.url.stsClient}")
public interface StsClient {

    @RequestMapping(method = RequestMethod.GET, value = "/jwt")
    String getTokenJwt();
}
