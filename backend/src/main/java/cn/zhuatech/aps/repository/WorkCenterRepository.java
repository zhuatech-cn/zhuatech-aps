/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.aps.repository; import cn.zhuatech.aps.model.WorkCenter; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface WorkCenterRepository extends JpaRepository<WorkCenter,Long>{Optional<WorkCenter> findByCode(String code);}
