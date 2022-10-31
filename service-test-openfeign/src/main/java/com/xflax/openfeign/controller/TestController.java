package com.xflax.openfeign.controller;

import com.xflax.library.acx.service.AcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/client")
public class TestController
{
    @Autowired
    private AcxService acxService;

    @GetMapping()
    public String getSts() {
        return acxService.consumeAcxApi();
    }



}