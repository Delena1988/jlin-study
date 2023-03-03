package cn.joinhealth.springbootsqlite.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author linjian
 * @date 2023/3/3 14:35
 */
@Data
@Component
public class User implements Serializable {
    private Integer id;
    private String name;
    private Double height;
    private String intro;

}
