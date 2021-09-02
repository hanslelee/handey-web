package com.handey.web.controller.home;

import com.handey.web.domain.home.ToDoBox;
import com.handey.web.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoController {
    private final ToDoService toDoService;

               // 스프링 빈 등록 2가지 방법 중: 컴포넌트 스캔과 자동 의존관계 생성
    @Autowired // DI(Dependency Injection): Controller -> Service -> Repository
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    /**
     * 투두 박스 리스트 조회
     */
    @GetMapping("/toDoBoxList")
    public List<ToDoBox> getToDoBoxList() {
        return toDoService.getToDoBoxList();
    }

    /**
     * 투두 박스 객체 생성
     */
    @PostMapping("/toDoBox")
    public Long createToDoBoxObj() {
        return toDoService.createToDoBoxObj();
    }

    /**
     * 투두 박스 타이틀 수정
     */
    @PutMapping("/toDoBox/{toDoBoxId}")
    public boolean updateToDoBoxTitle(@PathVariable long toDoBoxId, @RequestBody ToDoBoxParam param) {
        return toDoService.updateToDoBoxTitle(toDoBoxId, param);
    }
}
