package com.handey.web.controller.home;

import lombok.Data;

@Data
public class ToDoBoxParam {
    // spring의 잭슨을 통해 json으로 변환해줌
    private String title;

    private boolean fixed;
}
