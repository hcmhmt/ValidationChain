package validation;

import context.UserControlContext;
import context.ValidationResult;

public class NameValidationClass extends AbstractValidationChain<UserControlContext> {

    @Override
    public ValidationResult execute(UserControlContext context) {
        System.out.println("validation.NameValidationClass");
        return ValidationResult.Builder.getBuilder().isResultSuccess(true).build();
    }
}
