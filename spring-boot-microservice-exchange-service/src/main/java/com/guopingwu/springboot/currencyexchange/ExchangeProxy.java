package com.guopingwu.springboot.currencyexchange;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="data-service")
@RibbonClient(name="data-service")
public interface ExchangeProxy {
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ConversionBean retrieveDataVolume
    (@PathVariable("from") String from, @PathVariable("to") String to);
}