package com.xflax.library.acx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "acxClient", url = "${feign.client.url.acxClient}")
public interface AcxClient {

    @RequestMapping(method = RequestMethod.GET, value = "/prices")
    String getPrices();
}
