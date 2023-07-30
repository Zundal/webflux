package com.example.demo01.dto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        // 특별히 정의할 메서드가 없으면, 기본적인 CRUD 작업은 JpaRepository에서 자동으로 제공됩니다.
}