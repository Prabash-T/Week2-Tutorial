
package com.example.Tutone;

public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(String title, String description, double price) {
        super(Long.valueOf(title), description, price);
    }

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
