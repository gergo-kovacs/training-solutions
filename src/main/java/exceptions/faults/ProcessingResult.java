package exceptions.faults;

public enum ProcessingResult {

    WORD_COUNT_ERROR (2), VALUE_ERROR(3),DATE_ERROR(5),VALUE_AND_DATE_ERROR(6);

    int code;

    ProcessingResult(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
