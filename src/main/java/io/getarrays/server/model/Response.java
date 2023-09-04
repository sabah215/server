package io.getarrays.server.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
/**
 * @author Sabah Ummie (sabah.ummie@gmail.com)
 * @version 1.0
 * @since 09/04/22
 */
@Data
public class Response {
    protected LocalDateTime timestamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;


}
