package com.mwigmans.rediscaching.dto;

import java.io.Serializable;

public record ReportRequest(Integer id, String fromDate, String toDate) implements Serializable {
}
