package com.spring.Batchprocessingsystem.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;
    @PostMapping("/importCustomers/importCustomers")
    public void importCsvToDb(){
        JobParameters jobParameter=new JobParametersBuilder().addLong("startAt",System.currentTimeMillis())
                .toJobParameters();
        try {
            jobLauncher.run(job,jobParameter);
        } catch (JobExecutionAlreadyRunningException | JobRestartException |JobInstanceAlreadyCompleteException
        | JobParametersInvalidException e ) {
            e.printStackTrace();

        }
        }

    }

