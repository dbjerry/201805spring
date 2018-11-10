package kr.or.ddit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* LogginAdvice.java
*
* @author jerry
* @version 1.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정자 수정내용
* ------ ------------------------
* pc 최초 생성
* 공통의 관심사(메서드 호출 로깅)를 담당하는 advice
* </pre>
*/
public class LoggingAdvice {
	private Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);
	
	//구현하는 비지니스 로직이 실행되기 전에
	//실행되는 공통 로직
	public void beforeAdvice(JoinPoint joinPoint) {
		//joinPoint : Advice가 적용될 시점/지점(메서드(구현한 로직))
		//beforeAdvice가 먼저 호출되고 joinPoint 호출
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		
		logger.debug("before-className : {}", className);
		logger.debug("before-methodName : {}", methodName);
		
	}
	
	public void afterAdvice(JoinPoint joinPoint) {
		//joinPoint : Advice가 적용될 시점/지점(메서드(구현한 로직))
		//beforeAdvice가 먼저 호출되고 joinPoint 호출
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().getName();
		
		logger.debug("after-className : {}", className);
		logger.debug("after-methodName : {}", methodName);
		
	}
	
	//비지니스 로직 전 후로 다른 로직을 삽입
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		//실제 비지니스 메서드 실행 전
		long startTime = System.currentTimeMillis();
		
		//실제 비지니스 메서드 호출
		Object[] args = joinPoint.getArgs();	//비지니스 메서드 매개변수
		Object object = joinPoint.proceed(args);//비지니스 메서드 실행
		
		//실제 비지니스 메서드 실행 후
		long endTime = System.currentTimeMillis();
		logger.debug("Advice-duration : {}", endTime-startTime);
		
		return object;
	}
	
}

