package org.example.spring.boot.oracle.listener;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component("UserTaskExecutionStart")
@Slf4j
public class UserTaskExecutionStart implements ExecutionListener {

    @Override
    public void notify(DelegateExecution delegateExecution) {
        if (log.isDebugEnabled()) log.debug("-----> notify: Enter - {}", delegateExecution.getCurrentActivityId());

/*
//Do something, e.g.:
        ManagementService managementService = delegateExecution.getProcessEngineServices().getManagementService();
 */
        if (log.isDebugEnabled()) log.debug("-----> notify: Exit - {}", delegateExecution.getCurrentActivityId());
    }
}
