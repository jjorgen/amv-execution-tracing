package org.nsu.dcis.gj214.trace.criteria;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by John Jorgensen on 6/2/2017.
 *
 * Developer Note:
 *  In order for indentation in the log file to work properly showing the nested level of method (using NDC in advice)
 *  calls the following %x had to be added to the log4j.xml file: (arrow pointing down)  |
 *                                                                                       v
 *                       <param name="ConversionPattern" value="%5p [%d] [%t] [%F:%L] - %x%m%n" />
 */
@Aspect
public class AspectTrace {
    private Logger log = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* *.*(..)) && !within(AspectTrace)")
    public void traced() {}

    // Before advice used for tracing
    @Before("traced()")
    public void beforeTraced(JoinPoint joinPoint) {
//        Signature sig = thisJoinPointStaticPart.getSignatue();
//        log.info("Entering [" + joinPoint + "]");
//        log.info("Args [" + joinPoint.getArgs() + "]");
//        log.info("Entering[" + signature.toShortString() + "]");

//        log.info("Signature [" + joinPoint.getStaticPart().getSignature() + "]");

        Signature signature = joinPoint.getStaticPart().getSignature();
        signature.toShortString();
        log.info("Entering[" + signature + "]");
        NDC.push("  ");
    }

    // After advice used for tracing
    @After("traced()")
    public void afterTraced(JoinPoint joinPoint) {
        NDC.pop();
    }
}
