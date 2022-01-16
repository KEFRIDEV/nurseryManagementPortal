package com.kefri.nurserymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendors {

    private  int id;
    private String fname;
    private String sname;
    private String othername;
    private String phone;
    private String email;
    private String county;
    private String created_at;
}
