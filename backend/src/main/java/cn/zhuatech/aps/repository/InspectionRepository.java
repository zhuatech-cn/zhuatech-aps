/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.aps.repository; import cn.zhuatech.aps.model.Inspection; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface InspectionRepository extends JpaRepository<Inspection,Long>{List<Inspection> findTop10ByOrderByIdDesc();long countByResult(Inspection.Result result);}
