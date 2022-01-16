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


    // add Nursery
    @Override
    public int saveNursery(Nurseries nurseries) {


        return jdbcTemplate.update("INSERT INTO tbl_nurseries(vname,idnumber,nurseryname,owner_phone,nursery_phone,email,categoryname,subcategoryname,county,subcounty,latitude,longitude,majorspecies,areasize,office,store,pottingshade,ablutionblocks,permanentriver,borehole,tapwater,well,roofwater,otherinfratstructure,purpose,town,foreststation,staff,training,investement,donor,forestsoil,farmsoil,cocopeat,sawdust,ec_approval,reason)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{nurseries.getVname(),nurseries.getIdnumber(),nurseries.getNurseryname(),nurseries.getOwner_phone(),nurseries.getNursery_phone(),nurseries.getEmail(),nurseries.getCategoryname(),nurseries.getSubcategoryname(),nurseries.getCounty(),nurseries.getSubcounty(),nurseries.getLatitude(),nurseries.getLongitude(),nurseries.getMajorspecies(),nurseries.getAreasize(),nurseries.getOffice(),nurseries.getStore(),nurseries.getPottingshade(),nurseries.getAblutionblocks(),nurseries.getPermanentriver(),nurseries.getBorehole(),nurseries.getTapwater(),nurseries.getWell(),nurseries.getRoofwater(),nurseries.getOtherinfratstructure(),nurseries.getPurpose(),nurseries.getTown(),nurseries.getForeststation(),nurseries.getStaff(),nurseries.getTraining(),nurseries.getInvestement(),nurseries.getDonor(),nurseries.getForestsoil(),nurseries.getFarmsoil(),nurseries.getCocopeat(),nurseries.getSawdust(),nurseries.getEc_approval(),nurseries.getReason()});







    }


    @Override
    public List<Nurseries> getAllNurseries() {
        return  jdbcTemplate.query("SELECT * FROM tbl_nurseries",new BeanPropertyRowMapper<Nurseries>(Nurseries.class));
    }

    @Override
    public Nurseries getNurseryByID(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM tbl_nurseries  WHERE id =?",new BeanPropertyRowMapper<Nurseries>(Nurseries.class),id);
    }


}
