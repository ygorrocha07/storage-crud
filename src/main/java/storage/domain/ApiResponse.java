package storage.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiResponse {
    Integer code;
    String message;
    Object result;
}
