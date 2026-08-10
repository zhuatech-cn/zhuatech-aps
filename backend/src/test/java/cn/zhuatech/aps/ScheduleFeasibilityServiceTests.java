/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.aps;

import cn.zhuatech.aps.service.ScheduleFeasibilityService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScheduleFeasibilityServiceTests {
    private final ScheduleFeasibilityService service = new ScheduleFeasibilityService();

    @Test void reschedulesWhenShortageExceedsOvertimeLimit() {
        var result = service.evaluate(new ScheduleFeasibilityService.Request(
            "PLAN-01", 900, 960, 120, 120, 30, 24));
        assertEquals(180, result.capacityShortageMinutes());
        assertEquals("RESCHEDULE", result.decision());
    }

    @Test void acceptsFeasiblePlan() {
        var result = service.evaluate(new ScheduleFeasibilityService.Request(
            "PLAN-02", 600, 960, 60, 60, 30, 24));
        assertEquals("FEASIBLE", result.decision());
    }
}
