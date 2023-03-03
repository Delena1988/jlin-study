package cn.joinhealth.springbootsqlite.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author linjian
 * @date 2023/3/3 14:40
 */
@Data
@Component
public class UserDTO extends User implements Serializable {
}
