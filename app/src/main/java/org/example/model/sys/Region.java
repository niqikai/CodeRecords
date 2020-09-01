package org.example.model.sys;

import lombok.Data;

@Data
public class Region {
    private Integer code;
    private String name;
    private Integer level;
    private Integer parentCode;
}
