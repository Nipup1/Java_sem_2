package Practic_9;

import com.example.practicjava_2_next.Service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {
    @Before("allServiceMethods()")
    public void logParameters(JoinPoint joinPoint) {
        if(joinPoint.getSignature().getName().equals("sendEmail")){
            log.info("Send email into: {}", joinPoint.getArgs());
        }else{
            log.info("Methods: {}, {}",
                    joinPoint.getSignature().getName(),
                    new Date());
        }
    }
    @Pointcut("within(com.example.practicjava_2_next.Service.*)")
    public void allServiceMethods() {}
}
