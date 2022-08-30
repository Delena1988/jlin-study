package cn.joinhealth.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author linjian
 * @date 2022/8/30 13:52
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private Integer age;
    private String userName;
}
