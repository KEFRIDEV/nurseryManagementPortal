package com.kefri.nurserymanagement.dao;

import com.kefri.nurserymanagement.model.Vendors;

import java.util.List;

public interface VendorsDAO {

    int save(Vendors vendors);

    int update(Vendors vendors,int id);
    int delete(int id);

    List<Vendors> getAll();

    Vendors getbyId(int id);


}
