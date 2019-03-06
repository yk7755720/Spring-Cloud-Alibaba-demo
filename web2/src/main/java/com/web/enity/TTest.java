package com.web.enity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="t_test")
public class TTest {

    private String id;

    @Column(name = "name")
    private String name;
}
