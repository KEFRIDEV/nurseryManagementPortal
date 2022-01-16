package com.kefri.nurserymanagement.contoler;

import com.kefri.nurserymanagement.dao.VendorsDAO;
import com.kefri.nurserymanagement.model.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorsControler {
    @Autowired
    private VendorsDAO vendorsDAO;

    @GetMapping("/vendors")
    public List<Vendors> getVendors(){
        return   vendorsDAO.getAll();

    }
}
