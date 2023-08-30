package io.getarrays.server.enumeration;

/**
 * @author Sabah Ummie (sabah.ummie@gmail.com)
 * @version 1.0
 * @since 8/30/23
 * */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
