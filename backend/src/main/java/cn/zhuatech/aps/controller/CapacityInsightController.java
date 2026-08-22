/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.aps.controller;

import cn.zhuatech.aps.common.ApiResponse;
import cn.zhuatech.aps.service.CapacityBalanceService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasAnyRole('PLANNER','ADMIN')")
public class CapacityInsightController {
    private final CapacityBalanceService service;
    public CapacityInsightController(CapacityBalanceService service) { this.service = service; }

    @PostMapping("/capacity-balance")
    public ApiResponse<CapacityBalanceService.Result> analyze(@Valid @RequestBody CapacityBalanceService.Request request) {
        return ApiResponse.ok(service.analyze(request));
    }
}
