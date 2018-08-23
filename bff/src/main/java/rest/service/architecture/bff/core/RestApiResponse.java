package rest.service.architecture.bff.core;

public class RestApiResponse<TResponse> {
    private boolean isSuccess;
    private String message;
    private TResponse response;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TResponse getResponse() {
        return response;
    }

    public void setResponse(TResponse response) {
        this.response = response;
    }

    public static <T> RestApiResponse<T> success(T response) {
        RestApiResponse result = new RestApiResponse<T>();
        result.setSuccess(true);
        result.setResponse(response);
        return result;
    }

    public static <T> RestApiResponse<T> error(T response, String message) {
        RestApiResponse result = new RestApiResponse();
        result.setSuccess(false);
        result.setResponse(response);
        result.setMessage(message);
        return result;
    }
}
