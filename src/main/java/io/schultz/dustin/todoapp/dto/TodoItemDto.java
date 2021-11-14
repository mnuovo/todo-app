package io.schultz.dustin.todoapp.dto;

public class TodoItemDto {

    private final String value;
    private final boolean complete;

    public TodoItemDto(String value, boolean complete) {
        this.value = value;
        this.complete = complete;
    }

    public String getValue() {
        return value;
    }

    public boolean isComplete() {
        return complete;
    }
}
