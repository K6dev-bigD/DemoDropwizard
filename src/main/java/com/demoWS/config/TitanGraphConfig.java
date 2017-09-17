package com.demoWS.config;

import javax.validation.constraints.NotNull;

/**
 * Created by kundankumar on 29/04/17.
 */
public class TitanGraphConfig {

    @NotNull
    private String storageBackend;

    @NotNull
    private String storagePort;

    @NotNull
    private String storageHbaseTable;

    @NotNull
    private String strorageHostName;


    public String getStorageBackend() {
        return storageBackend;
    }

    public void setStorageBackend(String storageBackend) {
        this.storageBackend = storageBackend;
    }

    public String getStoragePort() {
        return storagePort;
    }

    public void setStoragePort(String storagePort) {
        this.storagePort = storagePort;
    }

    public String getStorageHbaseTable() {
        return storageHbaseTable;
    }

    public void setStorageHbaseTable(String storageHbaseTable) {
        this.storageHbaseTable = storageHbaseTable;
    }

    public String getStrorageHostName() {
        return strorageHostName;
    }

    public void setStrorageHostName(String strorageHostName) {
        this.strorageHostName = strorageHostName;
    }

    @Override
    public String toString() {
        return "TitanGraphConfig{" +
                "storageBackend='" + storageBackend + '\'' +
                ", storagePort='" + storagePort + '\'' +
                ", storageHbaseTable='" + storageHbaseTable + '\'' +
                ", strorageHostName='" + strorageHostName + '\'' +
                '}';
    }
}
