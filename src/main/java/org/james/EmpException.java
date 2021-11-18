package org.james;

public class EmpException extends  Exception{
    public String message;

    public EmpException(String string) {
        message = string;
    }

    @Override
    public String toString() {
        return "EmpException [Message=" + message + "]";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
}
    