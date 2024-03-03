package com.mwigmans.rediscaching.service;

import com.mwigmans.rediscaching.dto.ReportData;
import com.mwigmans.rediscaching.dto.ReportRequest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class ReportService {

    @Value("${app.timeout.sec:10}")
    private int timeout;

    @SneakyThrows
    @Cacheable("reportData")
    public List<ReportData> getReportDataList(ReportRequest reportRequest) {
        log.info("-----------Cache Miss---------- : '{}'", reportRequest);
        Thread.sleep(TimeUnit.MILLISECONDS.convert(timeout, TimeUnit.SECONDS));
        return List.of(
                new ReportData(1, "Report Data 1", reportRequest.fromDate(), reportRequest.toDate()),
                new ReportData(2, "Report Data 2", reportRequest.fromDate(), reportRequest.toDate())
        );
    }
}

