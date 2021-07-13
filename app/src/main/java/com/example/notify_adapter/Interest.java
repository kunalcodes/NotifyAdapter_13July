package com.example.notify_adapter;

public class Interest {
    private String text;
    private boolean isSelected;

    public Interest(String text, boolean isSelected) {
        this.text = text;
        this.isSelected = isSelected;
    }

    public String getText() {
        return text;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
