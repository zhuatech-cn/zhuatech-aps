/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.aps.controller;

import cn.zhuatech.aps.common.ApiResponse;
import cn.zhuatech.aps.service.OrderPromiseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aps/insights")
public class OrderPromiseController {
    private final OrderPromiseService service;

    public OrderPromiseController(OrderPromiseService service) { this.service = service; }

    @PostMapping("/order-promise")
    public ApiResponse<OrderPromiseService.Result> evaluate(@Valid @RequestBody OrderPromiseService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
