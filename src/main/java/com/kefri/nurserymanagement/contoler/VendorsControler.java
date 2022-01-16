package com.kefri.nurserymanagement.contoler;

import com.kefri.nurserymanagement.dao.VendorsDAO;
import com.kefri.nurserymanagement.model.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorsControler {
    @Autowired
    private VendorsDAO vendorsDAO;


    //fetch all tree nursery verndors controler
    @GetMapping("/vendors")
    public List<Vendors> getVendors(){
        return   vendorsDAO.getAll();
    }


    // add new seedling vendor
    @PostMapping("/vendors")
    public  String saveEmployee(@RequestBody Vendors employee){
        return   vendorsDAO.save(employee)+" Vendor added successfully ";

    }
}
