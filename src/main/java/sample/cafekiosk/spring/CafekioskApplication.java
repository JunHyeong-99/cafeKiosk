package sample.cafekiosk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class CafekioskApplication {

    public static void main(String[] args) {
        SpringApplication.run(CafekioskApplication.class, args);
    }
//헥사고날 아케텍쳐
//
//yml 파일 분리
//
//of 메서드
//
//builider에는 private
//
//@EntityListeners(AuditingEntityListener.class) 사용법
//
}
