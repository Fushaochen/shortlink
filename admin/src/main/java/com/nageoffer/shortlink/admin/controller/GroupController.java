package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:GroupController
 * Package:com.nageoffer.shortlink.admin.controller
 * Description:
 *
 * @Author: fsc
 * @Create: 2024/11/2 - 13:55
 * @Version: v1.0
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
}
