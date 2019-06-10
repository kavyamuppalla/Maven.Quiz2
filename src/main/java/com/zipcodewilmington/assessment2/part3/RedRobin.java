package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    private String migrationMonth;
    public String color() {
        return "red";
    }
    public int getSpeed() {
        return 10;
    }

}
