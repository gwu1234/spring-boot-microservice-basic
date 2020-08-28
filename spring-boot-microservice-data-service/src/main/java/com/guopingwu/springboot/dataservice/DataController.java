package com.guopingwu.springboot.dataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private DataVolumeRepository repository;
  
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public DataVolume retrieveDataVolume
    (@PathVariable String from, @PathVariable String to){
    
    DataVolume dataVolume = 
        repository.findByFromAndTo(from, to);
    
    dataVolume.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    
    return dataVolume;
  }
}