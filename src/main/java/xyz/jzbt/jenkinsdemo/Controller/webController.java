package xyz.jzbt.jenkinsdemo.Controller;

/**
 * @author Jiaxing Jiang
 * @version 0.1.0-SNAPSHOT
 * @date 2023/10/30 15:17
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {
    @RequestMapping("/admin")
    public String admin() {
        return "Welcome";
    }
}
