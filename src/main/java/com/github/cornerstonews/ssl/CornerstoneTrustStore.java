package com.github.cornerstonews.ssl;

public class CornerstoneTrustStore {

    private String truststore;
    private String truststorePassword;

    public CornerstoneTrustStore(String truststore, String truststorePassword) {
        this.truststore = truststore;
        this.truststorePassword = truststorePassword;
    }

    public String getTruststore() {
        return truststore;
    }

    public void setTruststore(String truststore) {
        this.truststore = truststore;
    }

    public String getTruststorePassword() {
        return truststorePassword;
    }

    public void setTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
    }
}
