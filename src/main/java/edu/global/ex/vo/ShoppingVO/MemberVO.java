package edu.global.ex.vo.ShoppingVO;


import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

    private String custno;
    private String custname;
    private String phone;
    private String address;
    private Date joindate;
    private String grade;
    private String city;

}
