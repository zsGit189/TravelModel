package com.jk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: CorsMapping
 * @Author: zs
 * @Description: 在cors的注册器上 声明哪些请求可以跨域方法
 * @CreateDate: 2020/01/06
 * @Version: 1.0
 */
//@Configuration
public class CorsMapping implements WebMvcConfigurer {
    /**
     * addCorsMappings
     * 在cors的注册器上 声明哪些请求可以跨域方法
     * @param registry
     */
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        //开放那些请求允许跨域
//        registry.addMapping("/**")
//                //运行哪些请求类型 跨域方法
//                //OPTIONS 预检请求 在访问跨域方法之前 浏览器对跨域的资源会发送一个
//                //OPTIONS请求 测试y一下当前方法是否支持跨域
//                .allowedMethods("GET","DELETE","POST","PUT","OPTIONS")
//                //Origin 允许远程访问的域名
//                //*代表所有ip都可以方法 在测试时可以使用此配置(可变参数)
//                //http://localhost:8082
//                .allowedOrigins("*")
//                //是否允许当前请求跨 域携带cookie
//                //.allowCredentials(true)
//                //OPTIONS请求 存活时间
//                .maxAge(3600);
//    }

}
