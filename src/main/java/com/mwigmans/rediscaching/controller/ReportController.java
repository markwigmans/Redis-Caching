package com.mwigmans.rediscaching.controller;

import com.mwigmans.rediscaching.dto.ReportData;
import com.mwigmans.rediscaching.dto.ReportRequest;
import com.mwigmans.rediscaching.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @PostMapping("/report-data")
    public List<ReportData> fetchReportData(@RequestBody ReportRequest reportRequest) {
        return reportService.getReportDataList(reportRequest);
    }
}
