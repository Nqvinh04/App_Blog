package com.codegym.casestudy.model;

public class Status {
    private Long StatusId;
    private String StatusName;

    public Status() {
    }

    public Status(Long statusId, String statusName) {
        StatusId = statusId;
        StatusName = statusName;
    }

    public Long getStatusId() {
        return StatusId;
    }

    public void setStatusId(Long statusId) {
        StatusId = statusId;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String statusName) {
        StatusName = statusName;
    }
}
