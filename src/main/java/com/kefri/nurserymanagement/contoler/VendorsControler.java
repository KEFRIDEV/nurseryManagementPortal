package com.kefri.nurserymanagement.contoler;

import com.kefri.nurserymanagement.dao.VendorsDAO;
import com.kefri.nurserymanagement.model.Nurseries;
import com.kefri.nurserymanagement.model.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    // vetch all nurseries added
    @GetMapping("/allnurseries")
    public List<Nurseries> getNurseries(){
        return   vendorsDAO.getAllNurseries();
    }

    @PostMapping("/addnursery")
    public  String saveNursery(@RequestBody Nurseries nurseries){
        return   vendorsDAO.saveNursery(nurseries)+" Nursery added successfully ";

    }


//    fetch nursery by vendors id

    @GetMapping("/allnurseries/{id}")
    public  Nurseries getNursery(@PathVariable int id){
        return vendorsDAO.getNurseryByID(id);

    }

}
