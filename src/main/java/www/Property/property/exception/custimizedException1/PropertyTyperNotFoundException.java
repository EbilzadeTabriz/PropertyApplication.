package www.Property.property.exception.custimizedException1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import www.Property.property.exception.ErrorDetails;

import java.time.LocalDateTime;

public class PropertyTyperNotFoundException extends RuntimeException {

    public PropertyTyperNotFoundException(String message) {
        super(message);
    }
}
