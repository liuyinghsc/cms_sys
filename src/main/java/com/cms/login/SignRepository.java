package com.cms.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignRepository extends JpaRepository<User,Integer>{
//自定义查询方法
    User findByName(String name);

}
