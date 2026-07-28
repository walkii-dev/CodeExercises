package com.exercising.CodeExercises;

public enum CodigoErro {
    NOT_FOUND(404,"this resource isnt found."),
    BAD_REQUEST(400,"this is a bad request."),
    INTERNAL_SERVER_ERROR(500,"this is a server error.");

    private int statusCode;
    private String statusCodeDescription;

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusCodeDescription() {
        return statusCodeDescription;
    }

    CodigoErro(int statusCode, String statusCodeDescription) {
        this.statusCode = statusCode;
        this.statusCodeDescription = statusCodeDescription;
    }
}
