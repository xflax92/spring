package com.xflax.library.acx.service;

import com.xflax.library.acx.feign.AcxClient;
import com.xflax.library.acx.feign.SosClient;
import com.xflax.library.acx.feign.StsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcxService {

    @Autowired
    private StsClient stsClient;

    @Autowired
    private SosClient sosClient;

    @Autowired
    private AcxClient acxClient;

    public String getMessage(){
        return "It's a test";
    }

    public String consumeAcxApi(){
        String sts = stsClient.getTokenJwt();
        String sos = sosClient.getTokenOauth();
        String acx = acxClient.getPrices();

        String res= "Sts call: "+sts+"\n "+
        "Sos call: "+sos+"\n "+
        "Acx call: "+acx;
        return res;


    }

}