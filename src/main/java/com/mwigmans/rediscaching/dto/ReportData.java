package com.mwigmans.rediscaching.dto;

import java.io.Serializable;

public record ReportData(Integer id, String data, String fromDate, String toDate) implements Serializable {
}

