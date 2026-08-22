/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.aps.controller;

import cn.zhuatech.aps.common.ApiResponse;
import cn.zhuatech.aps.service.ScheduleFeasibilityService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aps/insights")
public class ScheduleFeasibilityController {
    private final ScheduleFeasibilityService service;
    public ScheduleFeasibilityController(ScheduleFeasibilityService service) { this.service = service; }
    @PostMapping("/schedule-feasibility")
    public ApiResponse<ScheduleFeasibilityService.Result> evaluate(
        @Valid @RequestBody ScheduleFeasibilityService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
