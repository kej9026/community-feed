package org.fastcampus.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(
                                "http://localhost:5173", // ✅ 로컬 개발용
                                "https://agreeable-coast-073deca00.2.azurestaticapps.net" // ✅ 실제 배포 프론트 주소
                        )
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        .allowCredentials(false); // ✅ allowCredentials는 true면 allowedOrigins에 * 못 씀
            }
        };
    }
}
