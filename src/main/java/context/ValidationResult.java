package context;

public class ValidationResult {

    private boolean isResultSuccess;
    private String message;

    public boolean isResultSuccess() {
        return isResultSuccess;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder {

        private final ValidationResult validationResult = new ValidationResult();

        public static Builder getBuilder(){
            return new Builder();
        }

        public Builder isResultSuccess(boolean isResultSuccess){
            this.validationResult.isResultSuccess = isResultSuccess;
            return this;
        }

        public Builder withMessage(String message){
            this.validationResult.message = message;
            return this;
        }

        public ValidationResult build(){
            return this.validationResult;
        }

    }

}
