package com.tk.springtest.web.po;


import com.tk.springtest.web.enums.GenderEnums;
import lombok.Data;
import java.util.Date;

/**
 * 雇员
 */
@Data
public class Employee {
    private Integer empNo;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private Date hireDate;
    private Enum gender;

}
