/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.aps.repository; import cn.zhuatech.aps.model.UserAccount; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface UserRepository extends JpaRepository<UserAccount,Long>{Optional<UserAccount> findByUsername(String username);}
