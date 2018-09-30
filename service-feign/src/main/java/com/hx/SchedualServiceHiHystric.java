package com.hx;

import org.springframework.stereotype.Component;

/**
 * @Author: yangfan
 * @Description:
 * @DATE: Created in 14:40 2018/9/29.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHi(String name) {
        return "sorry"+name;
    }
}
