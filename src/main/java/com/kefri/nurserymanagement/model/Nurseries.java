package com.kefri.nurserymanagement.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Nurseries {

    private int id;
    private String vname;
    private String idnumber;
    private String nurseryname;
    private String owner_phone;
    private String nursery_phone;
    private String email;
    private String categoryname;
    private String subcategoryname;
    private String county;
    private String subcounty;
    private String latitude;
    private String longitude;
    private String majorspecies;
    private String areasize;
    private String office;
    private String store;
    private String pottingshade;
    private String ablutionblocks;
    private String permanentriver;
    private String borehole;
    private String tapwater;
    private String well;
    private String roofwater;
    private String otherinfratstructure;
    private String purpose;
    private String town;
    private String foreststation;
    private String staff;
    private String training;
    private String investement;
    private String donor;
    private String forestsoil;
    private String farmsoil;
    private String cocopeat;
    private String sawdust;
    private String ec_approval;
    private String reason;


}
