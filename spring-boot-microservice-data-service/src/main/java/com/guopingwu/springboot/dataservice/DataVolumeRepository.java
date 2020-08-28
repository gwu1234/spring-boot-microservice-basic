package com.guopingwu.springboot.dataservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataVolumeRepository extends JpaRepository<DataVolume, Long> {
    DataVolume findByFromAndTo(String from, String to);
}