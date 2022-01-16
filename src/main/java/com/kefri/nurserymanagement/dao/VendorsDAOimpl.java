package com.kefri.nurserymanagement.dao;

import com.kefri.nurserymanagement.model.Nurseries;
import com.kefri.nurserymanagement.model.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorsDAOimpl implements  VendorsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int save(Vendors vendors) {

        return jdbcTemplate.update("INSERT INTO tbl_nursery_vendors(fname,sname,othername,phone,email,county,created_at)VALUES (?,?,?,?,?,?,?)",new Object[]{vendors.getFname(),vendors.getSname(),vendors.getOthername(),vendors.getPhone(),vendors.getEmail(),vendors.getCounty(),vendors.getCreated_at()});
    }

    @Override
    public int update(Vendors vendors, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Vendors> getAll() {
        return  jdbcTemplate.query("SELECT * FROM tbl_nursery_vendors",new BeanPropertyRowMapper<Vendors>(Vendors.class));
    }

    @Override
    public Vendors getbyId(int id) {
        return null;
    }



    @Override
    public List<Nurseries> getAllNurseries() {
        return  jdbcTemplate.query("SELECT * FROM tbl_nurseries",new BeanPropertyRowMapper<Nurseries>(Nurseries.class));
    }


}
