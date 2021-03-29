package com.sx.component;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 异步处理
 * @author huang hao
 * @version 1.0
 * @date 2021/1/20 14:22
 */
@Slf4j
@Component
@RefreshScope
@EnableAsync
@ConditionalOnProperty(value = "async.task")
public class AsyncComponent {
    /**
     * 线程池维护线程的最少数量
     */
    @Value("${async.task.minSize}")
    private int minPoolSize = 5;

    /**
     * 线程池维护线程的最大数量
     */
    @Value("${async.task.maxSize}")
    private int maxPoolSize = 30;

    /**
     * 缓存队列数量
     */
    @Value("${async.task.queues}")
    private int queueCapacity = 8;

    /**
     * 允许的空闲时间
     */
    @Value("${async.task.keepAlive}")
    private int keepAlive = 60;

    /**
     * 任务名称前缀
     */
    @Value("${async.task.namePrefix}")
    private String namePrefix = "taskExecutor-";

    @Bean(name = "taskExecutor")
    @Primary
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(minPoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix(namePrefix);
        /** rejection-policy：当pool已经达到max size的时候，如何处理新任务
         *  CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
         */
        //对拒绝task的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setKeepAliveSeconds(keepAlive);
        executor.initialize();
        return executor;
    }

    @Bean(name = "threadPoolTaskExecutor")
    @Primary
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(minPoolSize);
        taskExecutor.setMaxPoolSize(maxPoolSize);
        taskExecutor.setQueueCapacity(queueCapacity);
        taskExecutor.setThreadNamePrefix(namePrefix);
        /** rejection-policy：当pool已经达到max size的时候，如何处理新任务
         *  CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
         */
        //对拒绝task的处理策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.setKeepAliveSeconds(keepAlive);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Bean(name = "taskExecutorOfExp")
    @Primary
    public ThreadPoolTaskExecutor taskExecutorOfExp() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(minPoolSize);
        taskExecutor.setMaxPoolSize(maxPoolSize);
        taskExecutor.setQueueCapacity(queueCapacity);
        taskExecutor.setThreadNamePrefix(namePrefix);
        /** rejection-policy：当pool已经达到max size的时候，如何处理新任务
         *  CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行"UTF-8"
         */
        //对拒绝task的处理策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.setKeepAliveSeconds(keepAlive);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Bean(name = "taskScheduler")
    @Primary
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(minPoolSize);
        taskScheduler.setThreadNamePrefix(namePrefix);
        /** rejection-policy：当pool已经达到max size的时候，如何处理新任务
         *  CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行"UTF-8"
         */
        //对拒绝task的处理策略
        taskScheduler.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        taskScheduler.setThreadFactory(threadFactoryBuilder.setNameFormat("测试-pool-%d").build());
        taskScheduler.initialize();
        return taskScheduler;
    }

}
