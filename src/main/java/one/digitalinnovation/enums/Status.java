package one.digitalinnovation.enums;

public enum Status {
    OPEN(13, "Opened"),
    CLOSE(02,"Closed");

    private int code;
    private String text;

    Status(final int code, final String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }
}
