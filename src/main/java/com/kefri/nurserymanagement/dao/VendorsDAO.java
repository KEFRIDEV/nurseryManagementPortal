package com.kefri.nurserymanagement.dao;

import com.kefri.nurserymanagement.model.Nurseries;
import com.kefri.nurserymanagement.model.Vendors;

import java.util.List;

public interface VendorsDAO {


    //vendors
    int save(Vendors vendors);

    int update(Vendors vendors,int id);
    int delete(int id);

    List<Vendors> getAll();

    Vendors getbyId(int id);


    // nurseries
    int saveNursery(Nurseries nurseries);


    List<Nurseries> getAllNurseries();


    Nurseries getNurseryByID(int id);



}
