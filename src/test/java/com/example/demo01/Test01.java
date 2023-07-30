package com.example.demo01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;


@Slf4j
@WebFluxTest
public class Test01 {

    @Test
    @DisplayName("webflux 동작 가능테스트")
    public void test01() {
        log.info("정상작동");
    }


}
