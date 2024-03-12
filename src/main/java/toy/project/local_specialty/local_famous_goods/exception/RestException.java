package toy.project.local_specialty.local_famous_goods.exception;

import lombok.Getter;
import toy.project.local_specialty.local_famous_goods.dto.response.Response;

/**
 *
 * 최상위 익셉션을 받아놓고 -> Advisor 에서 세세하게 예외처리를 분리해야한다.
 */
@Getter
public class RestException extends RunTimeException{

    private final Response response;

    public RestException(int code, String message) {
        response = new Response.ResponseBuilder<>(message ,code).build();
    }
}
