package com.datmt.jpa2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SecondaryTable(name = "smart_phone", pkJoinColumns=@PrimaryKeyJoinColumn(name="PHONE_ID"))
@SecondaryTable(name = "brain_phone", pkJoinColumns=@PrimaryKeyJoinColumn(name="PHONE_ID"))
public class SmartPhone extends Phone {

    @Column(table = "smart_phone")
    private Integer cpuCoresCount;

    @Column(table = "smart_phone")
    private Boolean hasSDCard;

    @Column(table = "smart_phone")
    private Boolean hasFingerprintUnlock;

    @Column(table = "smart_phone")
    private Float rearCameraResolution;

    @Column(table = "smart_phone")
    private Float frontCameraResolution;


    @Column(table = "brain_phone")
    private Float brainCount;

}